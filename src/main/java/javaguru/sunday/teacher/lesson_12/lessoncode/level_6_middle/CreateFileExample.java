package main.java.javaguru.sunday.teacher.lesson_12.lessoncode.level_6_middle;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {


    public static void main(String[] args) {
        String filePath = "C:\\AlexStaff\\projects\\something\\test.txt";

        CreateFileExample example = new CreateFileExample();

        example.createFile(filePath);
    }

    public boolean createFile(String path) {
        File file = new File(path);

        try {
            return file.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create file: " + e.getMessage());
        }
        // execute these lines
        return false;
    }

}
