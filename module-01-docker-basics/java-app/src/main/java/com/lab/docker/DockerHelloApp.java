package com.lab.docker;

public class DockerHelloApp {

    public static void main(String[] args) {

        String environment = System.getenv("APP_ENV");

        if (environment == null) {
            environment = "development";
        }

        System.out.println("================================");
        System.out.println("     DOCKER HELLO APPLICATION   ");
        System.out.println("================================");
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("Environment: " + environment);
        System.out.println("Application started successfully!");
    }
}
