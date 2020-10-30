package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_4.task_16;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest myLightColorDetectorTest = new LightColorDetectorTest();
        myLightColorDetectorTest.violetTest();
        myLightColorDetectorTest.blueTest();
        myLightColorDetectorTest.greenTest();
        myLightColorDetectorTest.yellowTest();
        myLightColorDetectorTest.orangeTest();
        myLightColorDetectorTest.redTest();
        myLightColorDetectorTest.invisibleLightTest();
    }

    public void violetTest() {
        LightColorDetector myLightColorDeterctor = new LightColorDetector();
        int waveLength = 381;
        String result = myLightColorDeterctor.colorDetector(waveLength);
        if (result == "Violet") {
            System.out.println(result + " - Test OK");
        } else {
            System.out.println("Test failed");
        }
    }

    public void blueTest() {
        int waveLength = 450;
        LightColorDetector myLightColorDeterctor = new LightColorDetector();
        String result = myLightColorDeterctor.colorDetector(waveLength);
        if (result == "Blue") {
            System.out.println(result + " - Test OK");
        } else {
            System.out.println("Test failed");
        }
    }

    public void greenTest() {
        int waveLength = 568;
        LightColorDetector myLightColorDeterctor = new LightColorDetector();
        String result = myLightColorDeterctor.colorDetector(waveLength);
        if (result == "Green") {
            System.out.println(result + " - Test OK");
        } else {
            System.out.println("Test failed");
        }
    }

    public void yellowTest() {
        int waveLength = 571;
        LightColorDetector myLightColorDeterctor = new LightColorDetector();
        String result = myLightColorDeterctor.colorDetector(waveLength);
        if (result == "Yellow") {
            System.out.println(result + " - Test OK");
        } else {
            System.out.println("Test failed");
        }
    }

    public void orangeTest() {
        int waveLength = 617;
        LightColorDetector myLightColorDeterctor = new LightColorDetector();
        String result = myLightColorDeterctor.colorDetector(waveLength);
        if (result == "Orange") {
            System.out.println(result + " - Test OK");
        } else {
            System.out.println("Test failed");
        }
    }

    public void redTest() {
        int waveLength = 622;
        LightColorDetector myLightColorDeterctor = new LightColorDetector();
        String result = myLightColorDeterctor.colorDetector(waveLength);
        if (result == "Red") {
            System.out.println(result + " - Test OK");
        } else {
            System.out.println("Test failed");
        }
    }

    public void invisibleLightTest() {
        int waveLength = 1000;
        LightColorDetector myLightColorDeterctor = new LightColorDetector();
        String result = myLightColorDeterctor.colorDetector(waveLength);
        if (result == "Invisible Light") {
            System.out.println(result + " - Test OK");
        } else {
            System.out.println("Test failed");
        }
    }
}
