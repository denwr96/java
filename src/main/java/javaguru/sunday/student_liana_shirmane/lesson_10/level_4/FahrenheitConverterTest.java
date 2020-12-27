package javaguru.sunday.student_liana_shirmane.lesson_10.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//task12
@CodeReview(approved = true)
public class FahrenheitConverterTest {

    public static void main(String[] args) {
        FahrenheitConverterTest fahrenheitConverterTest = new FahrenheitConverterTest();
        fahrenheitConverterTest.calculateTemperature();
    }

    void calculateTemperature(){
        FahrenheitConverter test = new FahrenheitConverter();
        double actualResult = test.convert(32);
        double expectedResult = 89.6;
        check(expectedResult, actualResult, "Fahrenheit temperature test");
    }

    public void check(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}
