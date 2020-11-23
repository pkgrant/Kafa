package com.maphus.kafa.Util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestUtil {
    public static String jsonFileToString(String file) {
        Path path = Paths.get(file);

        try {
            return Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Error processing file.";
    }
}
