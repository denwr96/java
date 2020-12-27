package javaguru.sunday.student_sergej_savkin.lesson_12.level_1_intern.task_5;

class ExceptionDemo extends Exception {
    Exception exceptionDemo = new Exception();

    Exception exceptionDemoTwo = new Exception("message");

    Exception exceptionDemoThree = new Exception("message", getCause());

    Exception exceptionDemoFour = new Exception(getCause());


}
