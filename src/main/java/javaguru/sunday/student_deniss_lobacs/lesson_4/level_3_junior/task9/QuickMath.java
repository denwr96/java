package main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_3_junior.task9;

public class QuickMath {

    public String Compare(int numberOne , int numberTwo , int numberThree ) {

        if (numberOne > numberTwo && numberOne > numberThree && numberTwo > numberThree) {

            return "decreasing";

        } else if (numberOne < numberTwo && numberOne < numberThree && numberTwo < numberThree ) {

            return "increasing";

        } else {

            return "Neither increasing or decreasing order";

        }

    }
}
