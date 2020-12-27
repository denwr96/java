package javaguru.sunday.student_artjom_proshkin.lesson_4.level_5_middle;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task_16
@CodeReview(approved = true)
class LightColourDetectorTest {
    public static void main(String[] args) {
        LightColourDetectorTest lightColourDetectorTest = new LightColourDetectorTest();
        lightColourDetectorTest.violetTestUno();
        lightColourDetectorTest.violetTestDuo();
        lightColourDetectorTest.blueTestUno();
        lightColourDetectorTest.blueTestDuo();
        lightColourDetectorTest.greenTestUno();
        lightColourDetectorTest.greenTestDuo();
        lightColourDetectorTest.yellowTestUno();
        lightColourDetectorTest.yellowTestDuo();
        lightColourDetectorTest.orangeTestUno();
        lightColourDetectorTest.orangeTestDuo();
        lightColourDetectorTest.redTestUno();
        lightColourDetectorTest.redTestDuo();
        lightColourDetectorTest.invisibleLightTestUno();
        lightColourDetectorTest.invisibleLightTestDuo();
    }

    void violetTestUno(){
        int lengthOfWave = 380;
        LightColourDetector lightColourDetector = new LightColourDetector();
        String expectedResult = lightColourDetector.detect(lengthOfWave);
        if (expectedResult.equals("Violet")){
            System.out.println("violetTestUno = OK ");
        }else {
            System.out.println("violetTestUno = FAIL ");
        }
    }
    void violetTestDuo(){
        int lengthOfWave = 449;
        LightColourDetector lightColourDetector = new LightColourDetector();
        String expectedResult = lightColourDetector.detect(lengthOfWave);
        if (expectedResult.equals("Violet")){
            System.out.println("violetTestUno = OK ");
        }else {
            System.out.println("violetTestUno = FAIL ");
        }
    }
    void blueTestUno(){
        int lengthOfWave = 450;
        LightColourDetector lightColourDetector = new LightColourDetector();
        String expectedResult = lightColourDetector.detect(lengthOfWave);
        if (expectedResult.equals("Blue")){
            System.out.println("blueTestUno = OK ");
        }else {
            System.out.println("blueTestUno = FAIL ");
        }
    }
    void blueTestDuo(){
        int lengthOfWave = 494;
        LightColourDetector lightColourDetector = new LightColourDetector();
        String expectedResult = lightColourDetector.detect(lengthOfWave);
        if (expectedResult.equals("Blue")){
            System.out.println("blueTestUno = OK ");
        }else {
            System.out.println("blueTestUno = FAIL ");
        }
    }
    void greenTestUno(){
        int lengthOfWave = 495;
        LightColourDetector lightColourDetector = new LightColourDetector();
        String expectedResult = lightColourDetector.detect(lengthOfWave);
        if (expectedResult.equals("Green")){
            System.out.println("greenTestUno = OK ");
        }else {
            System.out.println("greenTestUno = FAIL ");
        }
    }
    void greenTestDuo(){
        int lengthOfWave = 569;
        LightColourDetector lightColourDetector = new LightColourDetector();
        String expectedResult = lightColourDetector.detect(lengthOfWave);
        if (expectedResult.equals("Green")){
            System.out.println("greenTestUno = OK ");
        }else {
            System.out.println("greenTestUno = FAIL ");
        }
    }
    void yellowTestUno(){
        int lengthOfWave = 570;
        LightColourDetector lightColourDetector = new LightColourDetector();
        String expectedResult = lightColourDetector.detect(lengthOfWave);
        if (expectedResult.equals("Yellow")){
            System.out.println("yellowTestUno = OK ");
        }else {
            System.out.println("yellowTestUno = FAIL ");
        }
    }
    void yellowTestDuo(){
        int lengthOfWave = 589;
        LightColourDetector lightColourDetector = new LightColourDetector();
        String expectedResult = lightColourDetector.detect(lengthOfWave);
        if (expectedResult.equals("Yellow")){
            System.out.println("yellowTestUno = OK ");
        }else {
            System.out.println("yellowTestUno = FAIL ");
        }
    }
    void orangeTestUno(){
        int lengthOfWave = 590;
        LightColourDetector lightColourDetector = new LightColourDetector();
        String expectedResult = lightColourDetector.detect(lengthOfWave);
        if (expectedResult.equals("Orange")){
            System.out.println("orangeTestUno = OK ");
        }else {
            System.out.println("orangeTestUno = FAIL ");
        }
    }
    void orangeTestDuo(){
        int lengthOfWave = 619;
        LightColourDetector lightColourDetector = new LightColourDetector();
        String expectedResult = lightColourDetector.detect(lengthOfWave);
        if (expectedResult.equals("Orange")){
            System.out.println("orangeTestUno = OK ");
        }else {
            System.out.println("orangeTestUno = FAIL ");
        }
    }
    void redTestUno(){
        int lengthOfWave = 620;
        LightColourDetector lightColourDetector = new LightColourDetector();
        String expectedResult = lightColourDetector.detect(lengthOfWave);
        if (expectedResult.equals("Red")){
            System.out.println("redTestUno = OK ");
        }else {
            System.out.println("redTestUno = FAIL ");
        }
    }
    void redTestDuo(){
        int lengthOfWave = 750;
        LightColourDetector lightColourDetector = new LightColourDetector();
        String expectedResult = lightColourDetector.detect(lengthOfWave);
        if (expectedResult.equals("Red")){
            System.out.println("redTestUno = OK ");
        }else {
            System.out.println("redTestUno = FAIL ");
        }
    }
    void invisibleLightTestUno(){
        int lengthOfWave = 379;
        LightColourDetector lightColourDetector = new LightColourDetector();
        String expectedResult = lightColourDetector.detect(lengthOfWave);
        if (expectedResult.equals("Invisible Light")){
            System.out.println("invisibleLightTestUno = OK ");
        }else {
            System.out.println("invisibleLightTestUno = FAIL ");
        }
    }
    void invisibleLightTestDuo(){
        int lengthOfWave = 751;
        LightColourDetector lightColourDetector = new LightColourDetector();
        String expectedResult = lightColourDetector.detect(lengthOfWave);
        if (expectedResult.equals("Invisible Light")){
            System.out.println("invisibleLightTestUno = OK ");
        }else {
            System.out.println("invisibleLightTestUno = FAIL ");
        }
    }

}
