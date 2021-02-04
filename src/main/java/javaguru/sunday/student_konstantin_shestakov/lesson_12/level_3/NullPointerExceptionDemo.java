package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_3;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task 18
@CodeReview(approved = true)
class NullPointerExceptionDemo {

    public static void main(String[] args) {

        String nullString = null;

        try {
            nullString.hashCode(); // здесь проявляется NullPointerException, операция с неинициализированным или нулл объектом
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
