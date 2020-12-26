package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_12.task_21;

class TestException extends Exception { }

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

// Result
// 1. Got the Test Exception
//   Inside finally block
