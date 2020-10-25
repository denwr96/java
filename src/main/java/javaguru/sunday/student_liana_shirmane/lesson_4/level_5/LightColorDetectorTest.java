package main.java.javaguru.sunday.student_liana_shirmane.lesson_4.level_5;


class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.color1();
        lightColorDetectorTest.color2();
        lightColorDetectorTest.color3();
        lightColorDetectorTest.color4();
        lightColorDetectorTest.color5();
        lightColorDetectorTest.color6();
        lightColorDetectorTest.color7();
        lightColorDetectorTest.color8();
        lightColorDetectorTest.color9();
        lightColorDetectorTest.color10();
        lightColorDetectorTest.color11();
        lightColorDetectorTest.color12();
        lightColorDetectorTest.color13();
        lightColorDetectorTest.color14();
    }

    public void color1() {
        int wavelength = 379;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        check(expectedResult, actualResult, "Color1 test");
    }

    public void color2() {
        int wavelength = 3751;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        check(expectedResult, actualResult, "Color2 test");
    }

    public void color3() {
        int wavelength = 380;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        check(expectedResult, actualResult, "Color3 test");
    }

    public void color4() {
        int wavelength = 449;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        check(expectedResult, actualResult, "Color4 test");
    }

    public void color5() {
        int wavelength = 450;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        check(expectedResult, actualResult, "Color5 test");
    }

    public void color6() {
        int wavelength = 494;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        check(expectedResult, actualResult, "Color6 test");
    }

    public void color7() {
        int wavelength = 495;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        check(expectedResult, actualResult, "Color7 test");
    }

    public void color8() {
        int wavelength = 569;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        check(expectedResult, actualResult, "Color8 test");
    }

    public void color9() {
        int wavelength = 570;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        check(expectedResult, actualResult, "Color9 test");
    }

    public void color10() {
        int wavelength = 589;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        check(expectedResult, actualResult, "Color10 test");
    }

    public void color11() {
        int wavelength = 590;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        check(expectedResult, actualResult, "Color11 test");
    }

    public void color12() {
        int wavelength = 619;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        check(expectedResult, actualResult, "Color12 test");
    }

    public void color13() {
        int wavelength = 620;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        check(expectedResult, actualResult, "Color13 test");
    }

    public void color14() {
        int wavelength = 750;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        check(expectedResult, actualResult, "Color14 test");
    }

    public void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}


