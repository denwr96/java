package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_4.level_5;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.detectTestViolet();
        lightColorDetectorTest.detectTestBlue();
        lightColorDetectorTest.detectTestGreen();
        lightColorDetectorTest.detectTestYellow();
        lightColorDetectorTest.detectTestOrange();
        lightColorDetectorTest.detectTestRed();
        lightColorDetectorTest.detectTestInvisibleLight();
    }

    public void detectTestViolet() {
        int wavelength = 449;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result.equals("Violet")) {
            System.out.println("Violet test = OK");
        } else {
            System.out.println("Violet test = FAIL");
        }
    }

    public void detectTestBlue() {
        int wavelength = 460;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result.equals("Blue")) {
            System.out.println("Blue test = OK");
        } else {
            System.out.println("Blue test = FAIL");
        }
    }
    public void detectTestGreen() {
        int wavelength = 500;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result.equals("Green")) {
            System.out.println("Green test = OK");
        } else {
            System.out.println("Green test = FAIL");
        }
    }
    public void detectTestYellow() {
        int wavelength = 580;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result.equals("Yellow")) {
            System.out.println("Yellow test = OK");
        } else {
            System.out.println("Yellow test = FAIL");
        }
    }
    public void detectTestOrange() {
        int wavelength = 600;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result.equals("Orange")) {
            System.out.println("Orange test = OK");
        } else {
            System.out.println("Orange test = FAIL");
        }
    }
    public void detectTestRed() {
        int wavelength = 740;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result.equals("Red")) {
            System.out.println("Red test = OK");
        } else {
            System.out.println("Red test = FAIL");
        }
    }
    public void detectTestInvisibleLight() {
        int wavelength = 751;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result.equals("Invisible Light")) {
            System.out.println("Invisible Light test = OK");
        } else {
            System.out.println("Invisible Light test = FAIL");
        }
    }

}
