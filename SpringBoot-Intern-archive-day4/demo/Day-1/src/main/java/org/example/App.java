package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources.xml");

        Student s = (Student) context.getBean("st");
        s.show();
        s.internshipProgram();

        Teacher t = (Teacher) context.getBean("teacher");
        t.teach();

        Course c = (Course) context.getBean("course");
        c.courseDetails();

        System.out.println("All beans invoked successfully!");
    }
}
