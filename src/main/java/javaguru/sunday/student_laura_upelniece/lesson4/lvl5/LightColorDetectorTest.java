package main.java.javaguru.sunday.student_laura_upelniece.lesson4.lvl5;

public class LightColorDetectorTest {

    LightColorDetector lightColorDetector = new LightColorDetector();

    public static void main(String[] args) {

       LightColorDetector victim = new LightColorDetector();

       victim.

    }
        public String violetTest() {
            String expectedResult = "Violet";
            int wavelength = 380;
            String result = lightColorDetector.detect(wavelength);

             if (expectedResult.equals(result)) {
                 System.out.println("Violet TEST = OK");
             } else {
                 System.out.println("Violet TEST = FAIL");
             }

        }

        public String blueTest() {
            String expectedResult = "Blue";
            int wavelength = 450;
            String result = lightColorDetector.detect(wavelength);

            if (expectedResult.equals(result)) {
                System.out.println("Blue TEST = OK");
            } else {
                System.out.println("Blue TEST = FAIL, EXPECTED: " + expectedResult + "Actual result: " + result);
            }

        }
        public void greenTest() {
            String expectedResult = "Green";
            int wavelength = 495;


            String result = lightColorDetector.detect(wavelength);

            if (expectedResult.equals(result)) {
                System.out.println("Green TEST = OK");
            } else {
                System.out.println("Green TEST = FAIL");
            }

        }
        public void yellowTest() {
            String expectedResult = "Yellow";
            int wavelength = 570;


            String result = lightColorDetector.detect(wavelength);

            if (expectedResult.equals(result)) {
                System.out.println("Yellow TEST = OK");
            } else {
                System.out.println("Yellow TEST = FAIL");
            }

        }
        public void orangeTest() {
            String expectedResult =  "Orange";
            int wavelength = 590;


            String result = lightColorDetector.detect(wavelength);

            if (expectedResult.equals(result)) {
                System.out.println("Orange TEST = OK");
            } else {
                System.out.println("Orange TEST = FAIL");
            }

        }
        public void redTest() {
            String expectedResult = "Red";
            int wavelength = 620;


            String result = lightColorDetector.detect(wavelength);

            if (expectedResult.equals(result)) {
                System.out.println("Red TEST = OK");
            } else {
                System.out.println("Red TEST = FAIL");
            }

        }
        public void invisibleTest() {
            String expectedResult = "Invisible Light";
            int wavelength = 751;


            String result = lightColorDetector.detect(wavelength);

            if (expectedResult.equals(result)) {
                System.out.println("Invisible TEST = OK");
            } else {
                System.out.println("Invisible TEST = FAIL");
            }
        }
    }

