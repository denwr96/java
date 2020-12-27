package javaguru.sunday.student_nataliya_sinitsa.lesson4.level5.task16;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.detect1();
        lightColorDetectorTest.detect2();
        lightColorDetectorTest.detect3();
        lightColorDetectorTest.detect4();
        lightColorDetectorTest.detect5();
        lightColorDetectorTest.detect6();
        lightColorDetectorTest.detect7();
        lightColorDetectorTest.detect8();
        lightColorDetectorTest.detect9();
        lightColorDetectorTest.detect10();
        lightColorDetectorTest.detect11();
        lightColorDetectorTest.detect12();
        lightColorDetectorTest.detect13();
        lightColorDetectorTest.detect14();
    }

    public void detect1() {
        int wavelength = 379;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColor = lightColorDetector.detect(wavelength);
        if (waveColor.equals("Invisible Light")) {
            System.out.println("Detector in Invisible range 1 = OK");
        } else {
            System.out.println("Detector in Invisible range 1 = FAIL");
        }
    }

    public void detect2() {
        int wavelength = 380;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColor = lightColorDetector.detect(wavelength);
        if (waveColor.equals("Violet")) {
            System.out.println("Detector in Violet range 1 = OK");
        } else {
            System.out.println("Detector in Violet range 1 = FAIL");
        }
    }

    public void detect3() {
        int wavelength = 449;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColor = lightColorDetector.detect(wavelength);
        if (waveColor.equals("Violet")) {
            System.out.println("Detector in Violet range 2 = OK");
        } else {
            System.out.println("Detector in Violet range 2 = FAIL");
        }
    }

    public void detect4() {
        int wavelength = 450;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColor = lightColorDetector.detect(wavelength);
        if (waveColor.equals("Blue")) {
            System.out.println("Detector in Blue range 1 = OK");
        } else {
            System.out.println("Detector in Blue range 1 = FAIL");
        }
    }

    public void detect5() {
        int wavelength = 494;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColor = lightColorDetector.detect(wavelength);
        if (waveColor.equals("Blue")) {
            System.out.println("Detector in Blue range 2 = OK");
        } else {
            System.out.println("Detector in Blue range 2 = FAIL");
        }
    }

    public void detect6() {
        int wavelength = 495;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColor = lightColorDetector.detect(wavelength);
        if (waveColor.equals("Green")) {
            System.out.println("Detector in Green range 1 = OK");
        } else {
            System.out.println("Detector in Green range 1 = FAIL");
        }
    }

    public void detect7() {
        int wavelength = 569;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColor = lightColorDetector.detect(wavelength);
        if (waveColor.equals("Green")) {
            System.out.println("Detector in Green range 2 = OK");
        } else {
            System.out.println("Detector in Green range 2 = FAIL");
        }
    }

    public void detect8() {
        int wavelength = 570;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColor = lightColorDetector.detect(wavelength);
        if (waveColor.equals("Yellow")) {
            System.out.println("Detector in Yellow range 1 = OK");
        } else {
            System.out.println("Detector in Yellow range 1 = FAIL");
        }
    }

    public void detect9() {
        int wavelength = 589;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColor = lightColorDetector.detect(wavelength);
        if (waveColor.equals("Yellow")) {
            System.out.println("Detector in Yellow range 2 = OK");
        } else {
            System.out.println("Detector in Yellow range 2 = FAIL");
        }
    }

    public void detect10() {
        int wavelength = 590;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColor = lightColorDetector.detect(wavelength);
        if (waveColor.equals("Orange")) {
            System.out.println("Detector in Orange range 1 = OK");
        } else {
            System.out.println("Detector in Orange range 1 = FAIL");
        }
    }

    public void detect11() {
        int wavelength = 619;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColor = lightColorDetector.detect(wavelength);
        if (waveColor.equals("Orange")) {
            System.out.println("Detector in Orange range 2 = OK");
        } else {
            System.out.println("Detector in Orange range 2 = FAIL");
        }
    }

    public void detect12() {
        int wavelength = 620;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColor = lightColorDetector.detect(wavelength);
        if (waveColor.equals("Red")) {
            System.out.println("Detector in Red range 1 = OK");
        } else {
            System.out.println("Detector in Red range 1 = FAIL");
        }
    }

    public void detect13() {
        int wavelength = 750;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColor = lightColorDetector.detect(wavelength);
        if (waveColor.equals("Red")) {
            System.out.println("Detector in Red range 2 = OK");
        } else {
            System.out.println("Detector in Red range 2 = FAIL");
        }
    }

    public void detect14() {
        int wavelength = 751;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColor = lightColorDetector.detect(wavelength);
        if (waveColor.equals("Invisible Light")) {
            System.out.println("Detector in Invisible range 2 = OK");
        } else {
            System.out.println("Detector in Invisible range 2 = FAIL");
        }
    }

}
