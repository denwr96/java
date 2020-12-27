package javaguru.sunday.student_anna_aleksejeva.lesson_9.task_5;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;
@CodeReview(approved = false)
@CodeReviewComment(comment = "Я бы сказал, что это не совсем верное решение. Кажется странным, " +
        "когда метод, который должен положить деньги, предварительно проверив взодные параметры," +
        "еще и занимается тем, что запрашивает эти самые параметры. Входные параметры pin и размер суммы," +
        "должны были быть поданы в этот метод, соответсвтенно запрошены заранее.")
public class StrongBox2 {

    public int pinCode;
    public int moneyAmount;

    public StrongBox2(int pinCode, int moneyAmount) {
        this.pinCode = pinCode;
        this.moneyAmount = moneyAmount;
    }

    public void getMoney(int pinCode, int moneyGet) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your pin code ");
        int userPinCode = myScanner.nextInt();
        if (userPinCode == pinCode && moneyGet <= moneyAmount) {
            System.out.println("Get your money ");
        } else {
            System.out.println("Not correct pin code ");
        }
    }

    public void putMoney(int pinCode) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your pin code ");
        int userPinCode = myScanner.nextInt();
        if (userPinCode == pinCode) {
            System.out.println("Put your money ");
        } else {
            System.out.println("Not correct pin code ");

        }
    }
}