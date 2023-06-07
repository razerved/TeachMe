package org.example.lesson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileInput {
    public static void main(String[] args) {
        // Scanner read = new Scanner ("document");

        try
        {
            String textInfo = Files.readAllLines(Path.of("src/text.txt")).toString();
            System.out.println(textInfo);
        } catch (IOException e)
        {
            System.out.println("No such file has been found...");
        }
    }
}