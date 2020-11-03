package main.java.javaguru.sunday.student_natalia_kochkina.lesson_4.level_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task_16
@CodeReview(approved = true)
public class LightColourDetectorTest {

    public static void main(String[] args) {
        LightColourDetectorTest lightColourDetectorTest = new LightColourDetectorTest();
        lightColourDetectorTest.test1();
        lightColourDetectorTest.test2();
        lightColourDetectorTest.test3();
        lightColourDetectorTest.test4();
        lightColourDetectorTest.test5();
        lightColourDetectorTest.test6();
        lightColourDetectorTest.test7();
    }

    public void test1(){
        int wavelength = 420;

        LightColorDetector lightColorDetector = new LightColorDetector();
        String colour = lightColorDetector.detect(wavelength);

        if (colour == "Violet") {
            System.out.println("Test1 = OK");
        } else {
            System.out.println("Test1 = FAIL");
        }
    }

    public void test2(){
        int wavelength = 460;

        LightColorDetector lightColorDetector = new LightColorDetector();
        String colour = lightColorDetector.detect(wavelength);

        if (colour == "Blue") {
            System.out.println("Test2 = OK");
        } else {
            System.out.println("Test2 = FAIL");
        }
    }

    public void test3(){
        int wavelength = 500;

        LightColorDetector lightColorDetector = new LightColorDetector();
        String colour = lightColorDetector.detect(wavelength);

        if (colour == "Green") {
            System.out.println("Test3 = OK");
        } else {
            System.out.println("Test3 = FAIL");
        }
    }

    public void test4(){
        int wavelength = 585;

        LightColorDetector lightColorDetector = new LightColorDetector();
        String colour = lightColorDetector.detect(wavelength);

        if (colour == "Yellow") {
            System.out.println("Test4 = OK");
        } else {
            System.out.println("Test4 = FAIL");
        }
    }

    public void test5(){
        int wavelength = 611;

        LightColorDetector lightColorDetector = new LightColorDetector();
        String colour = lightColorDetector.detect(wavelength);

        if (colour == "Orange") {
            System.out.println("Test5 = OK");
        } else {
            System.out.println("Test5 = FAIL");
        }
    }

    public void test6(){
        int wavelength = 700;

        LightColorDetector lightColorDetector = new LightColorDetector();
        String colour = lightColorDetector.detect(wavelength);

        if (colour == "Red") {
            System.out.println("Test6 = OK");
        } else {
            System.out.println("Test6 = FAIL");
        }
    }

    public void test7(){
        int wavelength = 870;

        LightColorDetector lightColorDetector = new LightColorDetector();
        String colour = lightColorDetector.detect(wavelength);

        if (colour == "Invisible Light") {
            System.out.println("Test7 = OK");
        } else {
            System.out.println("Test7 = FAIL");
        }
    }
}