package main.java.javaguru.sunday.student_sergej_savkin.lesson_4.level_5_middle.task_16;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTestOne();
        lightColorDetectorTest.violetTestTwo();
        lightColorDetectorTest.blueTestOne();
        lightColorDetectorTest.blueTestTwo();
        lightColorDetectorTest.greenTestOne();
        lightColorDetectorTest.greenTestTwo();
        lightColorDetectorTest.yellowTestOne();
        lightColorDetectorTest.yellowTestTwo();
        lightColorDetectorTest.orangeTestOne();
        lightColorDetectorTest.orangeTestTwo();
        lightColorDetectorTest.redTestOne();
        lightColorDetectorTest.redTestTwo();
        lightColorDetectorTest.outOfRangeTestOne();
        lightColorDetectorTest.outOfRangeTestTwo();

    }

    public void violetTestOne(){
        int waveLength = 449;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if(result.equals("Violet")){
            System.out.println("violetTestOne passed OK!");
        } else {
            System.out.println("violetTestOne FAILED!");
        }
    }

    public void violetTestTwo(){
        int waveLength = 449;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if(result.equals("Violet")){
            System.out.println("violetTestTwo passed OK!");
        } else {
            System.out.println("violetTestTwo FAILED!");
        }
    }

    public void blueTestOne(){
        int waveLength = 450;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if(result.equals("Blue")){
            System.out.println("blueTestOne passed OK!");
        } else {
            System.out.println("blueTestOne FAILED!");
        }
    }

    public void blueTestTwo(){
        int waveLength = 494;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if(result.equals("Blue")){
            System.out.println("blueTestTwo passed OK!");
        } else {
            System.out.println("blueTestTwo FAILED!");
        }
    }

    public void greenTestOne(){
        int waveLength = 495;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if(result.equals("Green")){
            System.out.println("greenTestOne passed OK!");
        } else {
            System.out.println("greenTestOne FAILED!");
        }
    }

    public void greenTestTwo(){
        int waveLength = 569;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if(result.equals("Green")){
            System.out.println("greenTestTwo passed OK!");
        } else {
            System.out.println("greenTestTwo FAILED!");
        }
    }

    public void yellowTestOne(){
        int waveLength = 571;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if(result.equals("Yellow")){
            System.out.println("yellowTestOne passed OK!");
        } else {
            System.out.println("yellowTestOne FAILED!");
        }
    }

    public void yellowTestTwo(){
        int waveLength = 588;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if(result.equals("Yellow")){
            System.out.println("yellowTestTwo passed OK!");
        } else {
            System.out.println("yellowTestTwo FAILED!");
        }
    }

    public void orangeTestOne(){
        int waveLength = 590;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if(result.equals("Orange")){
            System.out.println("orangeTestOne passed OK!");
        } else {
            System.out.println("orangeTestOne FAILED!");
        }
    }

    public void orangeTestTwo(){
        int waveLength = 618;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if(result.equals("Orange")){
            System.out.println("orangeTestTwo passed OK!");
        } else {
            System.out.println("orangeTestTwo FAILED!");
        }
    }

    public void redTestOne(){
        int waveLength = 621;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if(result.equals("Red")){
            System.out.println("redTestOne passed OK!");
        } else {
            System.out.println("redTestOne FAILED!");
        }
    }

    public void redTestTwo(){
        int waveLength = 749;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if(result.equals("Red")){
            System.out.println("redTestTwo passed OK!");
        } else {
            System.out.println("redTestTwo FAILED!");
        }
    }

    public void outOfRangeTestOne(){
        int waveLength = 379;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if(result.equals("Invisible light")){
            System.out.println("outOfRangeTestOne passed OK!");
        } else {
            System.out.println("outOfRangeTestOne FAILED!");
        }
    }

    public void outOfRangeTestTwo(){
        int waveLength = 751;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if(result.equals("Invisible light")){
            System.out.println("outOfRangeTestTwo passed OK!");
        } else {
            System.out.println("outOfRangeTestTwo FAILED!");
        }
    }
}
