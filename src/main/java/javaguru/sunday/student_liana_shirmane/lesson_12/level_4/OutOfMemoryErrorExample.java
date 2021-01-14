package javaguru.sunday.student_liana_shirmane.lesson_12.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//task25
@CodeReview(approved = true)
public class OutOfMemoryErrorExample {

    public static void main(String[] args) {

        Integer[] array = new Integer[1000*1000*100];
        System.out.println("Done");

    }

}