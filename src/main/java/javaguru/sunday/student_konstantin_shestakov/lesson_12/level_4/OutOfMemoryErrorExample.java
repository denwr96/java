package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_4;

// Task 25

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
class OutOfMemoryErrorExample {

    public static void main(String[] args) {
        List<Integer> outOfMemoryExampleList = new ArrayList<>();

        Integer number = 1999999999;

        while(true) {
            outOfMemoryExampleList.add(number);
            number *= 1999999999;
        }

    }

}
