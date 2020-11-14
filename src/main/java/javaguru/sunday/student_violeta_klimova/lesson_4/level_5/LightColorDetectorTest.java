package main.java.javaguru.sunday.student_violeta_klimova.lesson_4.level_5;

import java.util.Random;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest test = new LightColorDetectorTest();
        test.violetColorTest();
        test.violetColorControlFirstTest();
        test.violetColorControlSecondTest();
        test.blueColorTest();
        test.blueColorControlFirstTest();
        test.blueColorControlSecondTest();
        test.greenColorTest();
        test.greenColorControlFirstTest();
        test.greenColorControlSecondTest();
        test.yellowColorTest();
        test.yellowColorControlFirstTest();
        test.yellowColorControlSecondTest();
        test.orangeColorTest();
        test.orangeColorControlFirstTest();
        test.orangeColorControlSecondTest();
        test.redColorTest();
        test.redColorControlFirstTest();
        test.redColorControlSecondTest();
        test.invisibleColorControlFirstTest();
        test.invisibleColorControlSecondTest();
    }

    public void violetColorTest() {
        Random random = new Random();
        int violetWave = random.nextInt(449 - 380 + 1) + 380;
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(violetWave);
        testResultPrint("violetColorTest", result.equals("Violet"));
    }

    public void violetColorControlFirstTest() {
        int waveLength = 380;
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(waveLength);
        testResultPrint("violetColorControlFirstTest", result.equals("Violet"));
    }

    public void violetColorControlSecondTest() {
        int waveLength = 449;
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(waveLength);
        testResultPrint("violetColorControlSecondTest", result.equals("Violet"));
    }

    public void blueColorTest() {
        Random random = new Random();
        int blueWave = random.nextInt(494 - 450 + 1) + 450;
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(blueWave);
        testResultPrint("blueColorTest", result.equals("Blue"));
    }

    public void blueColorControlFirstTest() {
        int waveLength = 450;
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(waveLength);
        testResultPrint("blueColorControlFirstTest", result.equals("Blue"));
    }

    public void blueColorControlSecondTest() {
        int waveLength = 494;
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(waveLength);
        testResultPrint("blueColorControlSecondTest", result.equals("Blue"));
    }

    public void greenColorTest() {
        Random random = new Random();
        int greenWave = random.nextInt(569 - 495 + 1) + 495;
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(greenWave);
        testResultPrint("greenColorTest", result.equals("Green"));
    }

    public void greenColorControlFirstTest() {
        int waveLength = 495;
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(waveLength);
        testResultPrint("greenColorControlFirstTest", result.equals("Green"));
    }

    public void greenColorControlSecondTest() {
        int waveLength = 569;
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(waveLength);
        testResultPrint("greenColorControlSecondTest", result.equals("Green"));
    }

    public void yellowColorTest() {
        Random random = new Random();
        int yellowWave = random.nextInt(589 - 570 + 1) + 570;
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(yellowWave);
        testResultPrint("yellowColorTest", result.equals("Yellow"));
    }

    public void yellowColorControlFirstTest() {
        int waveLength = 570;
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(waveLength);
        testResultPrint("yellowColorControlFirstTest", result.equals("Yellow"));
    }

    public void yellowColorControlSecondTest() {
        int waveLength = 589;
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(waveLength);
        testResultPrint("yellowColorControlSecondTest", result.equals("Yellow"));
    }

    public void orangeColorTest() {
        Random random = new Random();
        int orangeWave = random.nextInt(619 - 590 + 1) + 590;
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(orangeWave);
        testResultPrint("orangeColorTest", result.equals("Orange"));
    }

    public void orangeColorControlFirstTest() {
        int waveLength = 590;
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(waveLength);
        testResultPrint("orangeColorControlFirstTest", result.equals("Orange"));
    }

    public void orangeColorControlSecondTest() {
        int waveLength = 619;
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(waveLength);
        testResultPrint("orangeColorControlSecondTest", result.equals("Orange"));
    }

    public void redColorTest() {
        Random random = new Random();
        int redWave = random.nextInt(750 - 620 + 1) + 620;
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(redWave);
        testResultPrint("redColorTest", result.equals("Red"));
    }

    public void redColorControlFirstTest() {
        int waveLength = 620;
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(waveLength);
        testResultPrint("redColorControlFirstTest", result.equals("Red"));
    }

    public void redColorControlSecondTest() {
        int waveLength = 750;
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(waveLength);
        testResultPrint("redColorControlSecondTest", result.equals("Red"));
    }

    public void invisibleColorControlFirstTest() {
        int waveLength = 379;
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(waveLength);
        testResultPrint("invisibleColorControlFirstTest", result.equals("Invisible Light"));
    }

    public void invisibleColorControlSecondTest() {
        int waveLength = 751;
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(waveLength);
        testResultPrint("invisibleColorControlSecondTest", result.equals("Invisible Light"));
    }

    public void testResultPrint(String testName, boolean passed) {
        if (passed) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " Try again! ");
        }
    }
}