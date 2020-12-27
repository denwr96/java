package javaguru.sunday.teacher.lesson_12.lessoncode.level_6_middle;

import java.io.File;
import java.io.IOException;

public class CreateFileExampleV2 {


    public static void main(String[] args) {
        String filePath = "C:\\AlexStaff\\projects\\something\\test.txt";

        CreateFileExampleV2 example = new CreateFileExampleV2();

        try {
            example.createFile(filePath);
            System.out.println("Line after try to create file");
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
        System.out.println("Next line");
        System.out.println("Next line");
        System.out.println("Next line");
    }

    public boolean createFile(String path) throws IOException {
        File file = new File(path);
        return file.createNewFile();
    }

}
