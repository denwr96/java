package main.java.javaguru.sunday.student_kristina_sutugina.lesson_4.level_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleTest();
    }

    public void violetTest() {
        int wavelength = 400;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Violet") {
            System.out.println("Violet test OK");
        } else {
            System.out.println("Violet test failed");
        }
    }

    public void blueTest() {
        int wavelength = 450;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Blue") {
            System.out.println("Blue test OK");
        } else {
            System.out.println("Blue test failed");
        }
    }

    public void greenTest() {
        int wavelength = 495;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Green") {
            System.out.println("Green test OK");
        } else {
            System.out.println("Green test failed");
        }
    }

    public void yellowTest() {
        int wavelength = 589;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Yellow") {
            System.out.println("Yellow test OK");
        } else {
            System.out.println("Yellow test failed");
        }
    }

    public void orangeTest() {
        int wavelength = 495;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Orange") {
            System.out.println("Orange test OK");
        } else {
            System.out.println("Orange test failed");
        }
    }

    public void redTest() {
        int wavelength = 751;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Red") {
            System.out.println("Red test OK");
        } else {
            System.out.println("Red test failed");
        }
    }

    public void invisibleTest() {
        int wavelength = 379;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Invisible Light") {
            System.out.println("Invisible Light test OK");
        } else {
            System.out.println("Invisible Light test failed");
        }
    }
}