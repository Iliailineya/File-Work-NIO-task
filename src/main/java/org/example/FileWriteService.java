package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileWriteService {
    public static void writeToFile(String filename, String content) throws IOException {
        Files.write(Paths.get(filename), content.getBytes());
    }

    public static void appendToFile(String filename, String content) throws IOException {
        Files.write(Paths.get(filename), content.getBytes(), StandardOpenOption.APPEND);

    }
}

