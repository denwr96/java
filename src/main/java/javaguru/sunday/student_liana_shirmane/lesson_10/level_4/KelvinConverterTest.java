package main.java.javaguru.sunday.student_liana_shirmane.lesson_10.level_4;
//task12

public class KelvinConverterTest {
    public static void main(String[] args) {
        KelvinConverterTest kelvinConverterTest = new KelvinConverterTest();
        kelvinConverterTest.calculateTemperature();
    }

    void calculateTemperature(){
        KelvinConverter test = new KelvinConverter();
        double actualResult = test.convert(32);
        double expectedResult = 305.15;
        check(expectedResult, actualResult, "Kelvin temperature test");
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

