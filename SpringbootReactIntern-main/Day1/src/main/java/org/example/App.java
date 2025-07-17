package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class App {
    private static void writeToFile(String text) {
        try (PrintWriter out = new PrintWriter(new FileWriter("output.txt", true))) {
            out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
       
        try {
            new FileWriter("output.txt", false).close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ApplicationContext context = new ClassPathXmlApplicationContext("resources.xml");
        student s = (student) context.getBean("st");
        s.show();
        s.internshipProgram();
        String message = "Hello World!";
        System.out.println(message);
        writeToFile(message);
    }
}
