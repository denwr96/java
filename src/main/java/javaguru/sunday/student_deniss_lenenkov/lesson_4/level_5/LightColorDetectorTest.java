package javaguru.sunday.student_deniss_lenenkov.lesson_4.level_5;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Переменная vawelenght написана без использования camelCase")
public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        LightColorDetectorTest.vawelenght1();
        LightColorDetectorTest.vawelenght2();
        LightColorDetectorTest.vawelenght3();
        LightColorDetectorTest.vawelenght4();
        LightColorDetectorTest.vawelenght5();
        LightColorDetectorTest.vawelenght6();
        LightColorDetectorTest.vawelenght7();


    }
    static void vawelenght1(){
        int vawelenght = 399;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(vawelenght);
        if (result == "Violet"){
            System.out.println("TEST 1 = OK");
        }else {
            System.out.println("TEST 1 = FAIL");
        }
    }
    static void vawelenght2(){
        int vawelenght = 452;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(vawelenght);
        if (result == "Blue"){
            System.out.println("TEST 2 = OK");
        }else {
            System.out.println("TEST 2 = FAIL");
        }
    }
    static void vawelenght3(){
        int vawelenght = 511;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(vawelenght);
        if (result == "Green"){
            System.out.println("TEST 3 = OK");
        }else {
            System.out.println("TEST 3 = FAIL");
        }
    }
    static void vawelenght4(){
        int vawelenght = 575;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(vawelenght);
        if (result == "Yellow"){
            System.out.println("TEST 4 = OK");
        }else {
            System.out.println("TEST 4 = FAIL");
        }
    }
    static void vawelenght5(){
        int vawelenght = 600;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(vawelenght);
        if (result == "Orange"){
            System.out.println("TEST 5 = OK");
        }else {
            System.out.println("TEST 5 = FAIL");
        }
    }
    static void vawelenght6(){
        int vawelenght = 690;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(vawelenght);
        if (result == "Red"){
            System.out.println("TEST 6 = OK");
        }else {
            System.out.println("TEST 6 = FAIL");
        }
    }
    static void vawelenght7(){
        int vawelenght = 200;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(vawelenght);
        if (result == "Invisible Light"){
            System.out.println("TEST 7 = OK");
        }else {
            System.out.println("TEST 7 = FAIL");
        }
    }



}
