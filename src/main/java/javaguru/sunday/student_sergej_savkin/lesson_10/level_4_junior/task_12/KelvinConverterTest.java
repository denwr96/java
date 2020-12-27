package main.java.javaguru.sunday.student_sergej_savkin.lesson_10.level_4_junior.task_12;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class KelvinConverterTest {
    public static void main(String[] args) {
        KelvinConverterTest kelvinConverterTest = new KelvinConverterTest();
        kelvinConverterTest.convertTest();
    }

    public void convertTest() {
        KelvinConverter test = new KelvinConverter();
        check(268.15, test.convert(-5), "convertTest");
    }

    public void check(double expectedResult, double actualResult, String testName) {
        if(expectedResult == actualResult) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
