package main.java.javaguru.sunday.student_artjom_proshkin.lesson_4.level_2_intern.task_5;

import java.util.Scanner;

class NumberMax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int numberUno = scanner.nextInt();
        System.out.println("Please enter another number");
        int numberDuo = scanner.nextInt();

        if (numberUno > numberDuo){
            System.out.println("Maximum number is " + numberUno);
        } else if(numberUno < numberDuo){
            System.out.println("Maximum number is " + numberDuo);
        } else {
            System.out.println("Numbers are equal");
        }
    }

}
