package javaguru.sunday.student_deniss_lobacs.lesson_4.level_5_middle.task16;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class LightColorDetectorTest {

    private LightColorDetector victim = new LightColorDetector();

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.test1();
        lightColorDetectorTest.test2();
        lightColorDetectorTest.test3();
        lightColorDetectorTest.test4();
        lightColorDetectorTest.test5();
        lightColorDetectorTest.test6();
        lightColorDetectorTest.test7();
        lightColorDetectorTest.test8();
    }


    public void test1() {
        int wavelength = 381;
        String expectedResult = "Violet";
        String actualResult = victim.detect(wavelength);
        check(expectedResult, actualResult, "Test1");
    }

    public void test2() {
        int wavelength = 460;
        String expectedResult = "Blue";
        String actualResult = victim.detect(wavelength);
        check(expectedResult, actualResult, "Test2");
    }

    public void test3() {
        int wavelength = 500;
        String expectedResult = "Green";
        String actualResult = victim.detect(wavelength);
        check(expectedResult, actualResult, "Test3");
    }

    public void test4() {
        int wavelength = 580;
        String expectedResult = "Yellow";
        String actualResult = victim.detect(wavelength);
        check(expectedResult, actualResult, "Test4");
    }

    public void test5() {
        int wavelength = 600;
        String expectedResult = "Orange";
        String actualResult = victim.detect(wavelength);
        check(expectedResult, actualResult, "Test5");
    }

    public void test6() {
        int wavelength = 700;
        String expectedResult = "Red";
        String actualResult = victim.detect(wavelength);
        check(expectedResult, actualResult, "Test6");
    }

    public void test7() {
        int wavelength = 100;
        String expectedResult = "Invisible Light";
        String actualResult = victim.detect(wavelength);
        check(expectedResult, actualResult, "Test7");
    }

    public void test8() {
        int wavelength = 100;
        String expectedResult = "Red";
        String actualResult = victim.detect(wavelength);
        check(expectedResult, actualResult, "Test8");
    }

    public void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}
