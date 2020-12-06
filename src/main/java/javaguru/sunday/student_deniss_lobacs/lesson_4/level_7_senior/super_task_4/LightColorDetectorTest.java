package main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_7_senior.super_task_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class LightColorDetectorTest {

    private LightColorDetector lightColorDetector = new LightColorDetector();

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.testViolet(405);
        lightColorDetector.testBlue(475);
        lightColorDetector.testGreen(505);
        lightColorDetector.testYellow(585);
        lightColorDetector.testOrange(619);
        lightColorDetector.testRed(620);
        lightColorDetector.testInvisible(760);
    }
    public void testViolet(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        check(result.equals("Violet") , "Test1");
    }

    public void testBlue(int wavelength) {

        String result = lightColorDetector.detect(wavelength);
        check(result.equals("Blue") , "Test2");
    }
    public void testGreen(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        check(result.equals("Green") , "Test3");
    }
    public void testYellow(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        check(result.equals("Yellow") , "Test4");
    }
    public void testOrange(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        check(result.equals("Orange") , "Test5");
    }
    public void testRed(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        check(result.equals("Red") , "Test6");
    }
    public void testInvisible(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        check(result.equals("Invisible Light") , "Test5");

    }

    public void check(boolean condition , String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}
