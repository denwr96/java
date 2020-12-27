package main.java.javaguru.sunday.student_natalia_kochkina.lesson_12.level_1;

//Task_5

public class ExceptionDemo extends Exception {

    public ExceptionDemo() {
        super();
    }

    public ExceptionDemo(String message) {
        super(message);
    }

    public ExceptionDemo(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionDemo(Throwable cause) {
        super(cause);
    }
}
