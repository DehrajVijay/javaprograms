package com.stream;

import java.util.stream.Stream;

public class StreamWithoutCollection {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(7, 77, 777, 7777, 77777);
		s.forEach(System.out::println);
		
	}

}
