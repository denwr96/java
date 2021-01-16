package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_1;


import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
class Task4 {

    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<>();
        String stringElement = new String("One");
        stringArrayList.add(stringElement);
        stringArrayList.add(stringElement);
        stringArrayList.add("Two");
        stringArrayList.add("Two");
        System.out.println(stringArrayList.toString());
    }
}
