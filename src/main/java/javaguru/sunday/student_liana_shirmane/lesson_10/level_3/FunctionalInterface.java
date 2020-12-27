package javaguru.sunday.student_liana_shirmane.lesson_10.level_3;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

//task6
//A functional interface is an interface that contains only one abstract method.
// They can have only one functionality to exhibit.
@CodeReview(approved = false)
@CodeReviewComment(comment = "К чему этот код? =/")
interface FunctionalInterface {

    public static void main(String args[])
    {
        // create anonymous inner class object
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("New thread created");
            }
        }).start();
    }
}

