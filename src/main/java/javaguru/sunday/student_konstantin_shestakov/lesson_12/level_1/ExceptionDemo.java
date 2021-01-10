package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_1;

// Task 5

class ExceptionDemo extends Exception {

        Exception exceptionOne = new Exception();
        Exception exceptionTwo = new Exception("Message"); // Exception(String message);
        Exception exceptionThree = new Exception("Message", getCause()); // Exception(String message, Throwable cause);
        Exception exceptionFour = new Exception(getCause()); // Exception(Throwable cause)
        // Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace);

}
