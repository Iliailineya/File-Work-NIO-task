package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileWriteService {

    public static void writeToFile(String filename, String content) throws IOException {
        Path filePath = Paths.get(filename);
        Files.write(filePath, content.getBytes());
    }
    public static void appendToFile(String filename, String content) throws IOException{
        try {
            Path filePath = Paths.get(filename);
            Files.write(filePath, content.getBytes(), StandardOpenOption.APPEND);
            System.out.println("Content added to the file.");
        } catch (IOException e) {
            System.err.println("An error occurred while appending to the file: " + e.getMessage());
        }
    }
}

