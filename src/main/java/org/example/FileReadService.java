package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReadService {
    public static String readFromFile(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }
}

