package javaguru.sunday.student_deniss_lobacs.lesson_12.level_1_intern.task5;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ExceptionDemo extends Exception {

    Exception exceptionOne = new Exception();
    Exception exceptionTwo = new Exception("Message");
    Exception exceptionThree = new Exception("Message",	fillInStackTrace());
    Exception exceptionFour = new Exception("Message",	getCause());
    Exception exceptionFive = new Exception(getCause());
}
