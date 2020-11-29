package main.java.javaguru.sunday.teacher.lesson_10.lessoncode.arrayUtils;

public class Demo {

    public static void main(String[] args) {
        ArrayUtilImpl arrayUtil = new ArrayUtilImpl();

        ArrayUtilUser user = new ArrayUtilUser(arrayUtil);
        user.createArrayAndFillWithRandomNumbers();
    }
}
