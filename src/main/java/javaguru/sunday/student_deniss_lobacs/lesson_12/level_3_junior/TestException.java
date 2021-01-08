package javaguru.sunday.student_deniss_lobacs.lesson_12.level_3_junior;

public class TestException extends Exception{
// task21
    public static void main(String[] args) {
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }

}

//        1. Got the Test Exception
//        Inside finally block