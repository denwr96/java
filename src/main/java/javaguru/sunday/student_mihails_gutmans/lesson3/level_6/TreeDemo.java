package main.java.javaguru.sunday.student_mihails_gutmans.lesson3.level_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class TreeDemo {

    public static void main(String[] args){
        Tree myBirch = new Tree ( "Birtch" , 5.6,true);

        System.out.println( myBirch.hight );
        myBirch.growUp();
        System.out.println( myBirch.hight );
        myBirch.growUp();
        System.out.println( myBirch.hight );

        myBirch.fallLeafes();

    }
}
