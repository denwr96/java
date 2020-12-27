package main.java.javaguru.sunday.student_sergej_savkin.lesson_10.level_4_junior.task_12;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FahrenheitConverterTest {
    public static void main(String[] args) {
        FahrenheitConverterTest fahrenheitConverterTest = new FahrenheitConverterTest();
        fahrenheitConverterTest.FahrenheitConverterTest();
    }


    public void FahrenheitConverterTest(){
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        check(28.4, fahrenheitConverter.convert(-2), "FahrenheitConverterTest");
    }

    public void check(double expectedResult, double actualResult, String testName) {
        if(expectedResult == actualResult) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}