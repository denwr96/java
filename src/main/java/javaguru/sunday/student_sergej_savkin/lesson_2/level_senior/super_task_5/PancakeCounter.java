package main.java.javaguru.sunday.student_sergej_savkin.lesson_2.level_senior.super_task_5;

import java.util.Scanner;
/* The program should be used to check amount
of pancakes can be cooked, from existing food */
public class PancakeCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eggsAmount;
        int eggsMin = 1;
        int milkAmount;
        int milkMin = 200; //mililiters
        int flourAmount;
        int flourMin = 100; //grams

        System.out.println("How many eggs you have?");
        eggsAmount = scanner.nextInt();

        System.out.println("How many milk you have?");
        milkAmount = scanner.nextInt();

        System.out.println("How many flour you have?");
        flourAmount = scanner.nextInt();

        if(eggsAmount < eggsMin || milkAmount < milkMin || flourAmount < flourMin){
            /* checking if pancake preparation
            is possible */
            System.out.println("Sorry, no pancakes today");
        } else {
            /*checking how many portions of food
            you have */
            flourAmount = flourAmount / flourMin;
            milkAmount = milkAmount / milkMin;
            eggsAmount = eggsAmount / eggsMin;

            System.out.println("You have " + eggsAmount + " portions of eggs");
            System.out.println("You have " + milkAmount + " portions of milk");
            System.out.println("You have " + flourAmount + " portions of flour");

            int smallest; //founding a smallest portion amount
            if(eggsAmount <= milkAmount && eggsAmount <= flourAmount){
                smallest = eggsAmount;
            } else if (milkAmount <= flourAmount && milkAmount <= eggsAmount) {
                smallest = milkAmount;
            } else {
                smallest = flourAmount;
            }
            //1 portion is 4 pancakes
            System.out.println("You can make " + smallest * 4 + " pancakes");
            System.out.println("You will need " + smallest * eggsMin + " eggs");
            System.out.println("You will need " + smallest * milkMin + " mililiters of milk");
            System.out.println("You will need " + smallest * flourMin + " grams of flour");

        }
            //enjoy your meal

    }
}
