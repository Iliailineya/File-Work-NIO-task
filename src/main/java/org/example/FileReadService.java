package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadService {

    public static String readFromFile(String filename) throws IOException {
        Path filePath = Paths.get(filename);
        byte[] fileBytes = Files.readAllBytes(filePath);
        return new String(fileBytes);
    }
}

