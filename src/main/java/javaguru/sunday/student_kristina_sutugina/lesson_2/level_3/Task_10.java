package javaguru.sunday.student_kristina_sutugina.lesson_2.level_3;

//Task_10
import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_10 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double radius = input.nextDouble();
        double p = 3.1415;
        double perimeter = 2*p*radius;
        double area = radius *radius *p;
        System.out.println("Perimeter is =  "+perimeter);
        System.out.println("Area is =  "+area);
    }
}
