package com.filecomparision;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class FileComparator {

    public static void main(String[] args) throws IOException {
        String dir1Path = "D:\\Tickets\\Holocron\\view_comparison\\CLM_ARCHIVE_BRANCH_views";
        String dir2Path = "D:\\Tickets\\Holocron\\view_comparison\\Dev4_views";
        String outputFolderPath = "D:\\Tickets\\Holocron\\view_comparison\\comparison_result";
        String outputFile = outputFolderPath + "\\comparison_result.txt";
        String diffDetailFile = outputFolderPath + "\\diff_details.txt";

        // Ensure output directory exists
        Files.createDirectories(Paths.get(outputFolderPath));

        Set<String> files1 = Arrays.stream(Optional.ofNullable(new File(dir1Path).list()).orElse(new String[0]))
                .collect(Collectors.toSet());
        Set<String> files2 = Arrays.stream(Optional.ofNullable(new File(dir2Path).list()).orElse(new String[0]))
                .collect(Collectors.toSet());

        Set<String> common = files1.stream()
                .filter(files2::contains)
                .collect(Collectors.toSet());

        List<String> onlyInDir1 = files1.stream()
                .filter(f -> !files2.contains(f))
                .sorted()
                .collect(Collectors.toList());

        List<String> onlyInDir2 = files2.stream()
                .filter(f -> !files1.contains(f))
                .sorted()
                .collect(Collectors.toList());

        List<String> identical = new ArrayList<>();
        List<String> different = new ArrayList<>();

        try (BufferedWriter diffWriter = Files.newBufferedWriter(Paths.get(diffDetailFile))) {
            common.stream().sorted().forEach(fileName -> {
                Path file1 = Paths.get(dir1Path, fileName);
                Path file2 = Paths.get(dir2Path, fileName);

                try {
                    if (Files.exists(file1) && Files.exists(file2)) {
                        if (compareFiles(file1, file2, diffWriter, fileName)) {
                            identical.add(fileName);
                        } else {
                            different.add(fileName);
                        }
                    }
                } catch (IOException e) {
                    System.err.println("Error comparing file: " + fileName);
                    e.printStackTrace();
                }
            });
        }

        // Write summary
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile))) {
            writer.write("Same name and same content:\n");
            identical.stream().sorted().forEach(f -> writeLine(writer, " - " + f));

            writer.write("\nSame name but different content:\n");
            different.stream().sorted().forEach(f -> writeLine(writer, " - " + f));

            writer.write("\nOnly in Directory CLM_ARCHIVE_BRANCH_views:\n");
            onlyInDir1.forEach(f -> writeLine(writer, " - " + f));

            writer.write("\nOnly in Directory Dev4_views:\n");
            onlyInDir2.forEach(f -> writeLine(writer, " - " + f));
        }

        System.out.println(" Comparison completed. Summary: " + outputFile);
        System.out.println(" Detailed diffs written to: " + diffDetailFile);
    }

    private static void writeLine(BufferedWriter writer, String line) {
        try {
            writer.write(line + "\n");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static boolean compareFiles(Path file1, Path file2, BufferedWriter diffWriter, String fileName) throws IOException {
        boolean isIdentical = true;

        try (BufferedReader reader1 = Files.newBufferedReader(file1);
             BufferedReader reader2 = Files.newBufferedReader(file2)) {

            Iterator<String> lines1 = reader1.lines().iterator();
            Iterator<String> lines2 = reader2.lines().iterator();
            int lineNum = 1;

            while (lines1.hasNext() || lines2.hasNext()) {
                String lineA = lines1.hasNext() ? lines1.next() : null;
                String lineB = lines2.hasNext() ? lines2.next() : null;

                if (!Objects.equals(lineA, lineB)) {
                    if (isIdentical) {
                        diffWriter.write("===== Differences in file: " + fileName + " =====\n");
                        isIdentical = false;
                    }
                    diffWriter.write("Line " + lineNum + ":\n");
                    diffWriter.write(" > CLM_ARCHIVE_BRANCH_views: " + (lineA != null ? lineA : "[EOF]") + "\n");
                    diffWriter.write(" > Dev4_views: " + (lineB != null ? lineB : "[EOF]") + "\n\n");
                }
                lineNum++;
            }
        }

        return isIdentical;
    }
}
