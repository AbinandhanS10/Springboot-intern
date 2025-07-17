package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class student {
    private void writeToFile(String text) {
        try (PrintWriter out = new PrintWriter(new FileWriter("output.txt", true))) {
            out.println(text);
        } catch (IOException e) {
            // In a real application, you'd want to handle this more gracefully
            e.printStackTrace();
        }
    }

    public void show() {
        String message = "Class is going on CodeStudio Lab";
        System.out.println(message);
        writeToFile(message);
    }
    public void internshipProgram() {
        String message = "Students are attending SpringBoot Intern CodeStudio.";
        System.out.println(message);
        writeToFile(message);
    }
}
