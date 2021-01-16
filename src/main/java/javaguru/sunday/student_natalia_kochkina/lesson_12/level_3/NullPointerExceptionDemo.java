package javaguru.sunday.student_natalia_kochkina.lesson_12.level_3;

//Task_18

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
public class NullPointerExceptionDemo {

    public static void main(String[] args) {
        List<Integer> someNumbers = new ArrayList<>();
        someNumbers.add(null);
        int number = someNumbers.get(0);
        int sum = number + 7;
    }
}
//NullPointerException происходит, когда мы пытаемся обратиться по null-ссылке