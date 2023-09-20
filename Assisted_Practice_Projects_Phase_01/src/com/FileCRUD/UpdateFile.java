package com.FileCRUD;

import java.io.FileWriter;
import java.io.IOException;

public class UpdateFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("sample.txt", true)) {
            writer.write("This is new content added to the file.");
            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

