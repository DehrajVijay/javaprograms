package com.dbaconnection;

import java.io.InputStream;
import java.util.Properties;

public class DBPropertyLoader {

    private static final Properties properties = new Properties();

    static {
        try (InputStream input =
                DBPropertyLoader.class
                        .getClassLoader()
                        .getResourceAsStream("db.properties")) {

            if (input == null) {
                throw new RuntimeException("db.properties file not found");
            }

            properties.load(input);

        } catch (Exception e) {
            throw new RuntimeException("Failed to load database properties", e);
        }
    }

    public static String getUrl() {
        return properties.getProperty("db.url");
    }

    public static String getUser() {
        return properties.getProperty("db.user");
    }

    public static String getPassword() {
        return properties.getProperty("db.password");
    }

    public static String getDriver() {
        return properties.getProperty("db.driver");
    }

}
