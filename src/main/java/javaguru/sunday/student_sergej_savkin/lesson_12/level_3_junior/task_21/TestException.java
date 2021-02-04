package javaguru.sunday.student_sergej_savkin.lesson_12.level_3_junior.task_21;

import javaguru.sunday.teacher.annotations.CodeReview;

class TestException extends Exception { }

@CodeReview(approved = true)
class Main {
    public static void main(String args[]) {
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}
//Got the Test Exception
//   Inside finally block