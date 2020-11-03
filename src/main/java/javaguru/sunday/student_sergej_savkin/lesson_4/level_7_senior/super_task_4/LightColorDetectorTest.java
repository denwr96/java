package main.java.javaguru.sunday.student_sergej_savkin.lesson_4.level_7_senior.super_task_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class LightColorDetectorTest {
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

    public void testViolet(int wavelength){
        LightColorDetector test = new LightColorDetector();
        String result = test.detect(wavelength);
        checkResult(result.equals("Violet"), "testViolet");
    }

    public void testBlue(int wavelength){
        LightColorDetector test = new LightColorDetector();
        String result = test.detect(wavelength);
        checkResult(result.equals("Blue"), "testBlue");
    }

    public void testGreen(int wavelength){
        LightColorDetector test = new LightColorDetector();
        String result = test.detect(wavelength);
        checkResult(result.equals("Green"), "testGreen");
    }

    public void testYellow(int wavelength){
        LightColorDetector test = new LightColorDetector();
        String result = test.detect(wavelength);
        checkResult(result.equals("Yellow"), "testYellow");
    }

    public void testOrange(int wavelength){
        LightColorDetector test = new LightColorDetector();
        String result = test.detect(wavelength);
        checkResult(result.equals("Orange"), "testOrange");
    }

    public void testRed(int wavelength){
        LightColorDetector test = new LightColorDetector();
        String result = test.detect(wavelength);
        checkResult(result.equals("Red"), "testRed");
    }

    public void testInvisible(int wavelength){
        LightColorDetector test = new LightColorDetector();
        String result = test.detect(wavelength);
        checkResult(result.equals("Invisible Light"), "testInvisible");
    }

    public void checkResult(boolean condition, String testName){
        if(condition){
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " FAIL!");
        }
    }
}
