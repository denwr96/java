package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson4.level7.supertask2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class LeapYearTest {

    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.test1();
        leapYearTest.test2();
        leapYearTest.test3();
        leapYearTest.test4();
    }

    public void test1() {
        LeapYear victim = new LeapYear();
        boolean isLeapYear = victim.isLeapYear(1000);

        if (!isLeapYear) {
            System.out.println("Leap year checker works!");
        } else {
            System.out.println("Oops! Leap year checker test is failed!");
        }

    }

    public void test2() {
        LeapYear victim = new LeapYear();
        boolean isLeapYear = victim.isLeapYear(2000);

        if (isLeapYear) {
            System.out.println("Leap year checker works!");
        } else {
            System.out.println("Oops! Leap year checker test is failed!");
        }

    }

    public void test3() {
        LeapYear victim = new LeapYear();
        boolean isLeapYear = victim.isLeapYear(2020);

        if (isLeapYear) {
            System.out.println("Leap year checker works!");
        } else {
            System.out.println("Oops! Leap year checker test is failed!");
        }

    }

    public void test4() {
        LeapYear victim = new LeapYear();
        boolean isLeapYear = victim.isLeapYear(2021);

        if (!isLeapYear) {
            System.out.println("Leap year checker works!");
        } else {
            System.out.println("Oops! Leap year checker test is failed!");
        }

    }

}
