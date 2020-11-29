package main.java.javaguru.sunday.student_mihails_gutmans.lesson4.level5;

class LightColorDetectorTest {
    public static void main(String[] args) {

        LightColorDetectorTest detectorTest = new LightColorDetectorTest();
        detectorTest.violetDecectorTest();
        detectorTest.blueDecectorTest();
        detectorTest.greenDecectorTest();
        detectorTest.yellowDecectorTest();
        detectorTest.orangeDecectorTest();
        detectorTest.redDecectorTest();
        detectorTest.invisibleLightDecectorTest();
    }

    public void violetDecectorTest() {
        LightColorDetector victim = new LightColorDetector();
        String waveColor;
        waveColor = victim.colorDetector(390);
        if (waveColor == "Violet"){
            System.out.println("Test passed , wave color is " + waveColor);
        }else{
            System.out.println("Test failed");
        }
    }

    public void blueDecectorTest() {
        LightColorDetector victim = new LightColorDetector();
        String waveColor;
        waveColor = victim.colorDetector(450);
        if (waveColor == "Blue"){
            System.out.println("Test passed , wave color is " + waveColor);
        }else{
            System.out.println("Test failed");
        }
    }
    public void greenDecectorTest() {
        LightColorDetector victim = new LightColorDetector();
        String waveColor;
        waveColor = victim.colorDetector(496);
        if (waveColor == "Green"){
            System.out.println("Test passed , wave color is " + waveColor);
        }else{
            System.out.println("Test failed");
        }
    }
    public void yellowDecectorTest() {
        LightColorDetector victim = new LightColorDetector();
        String waveColor;
        waveColor = victim.colorDetector(571);
        if (waveColor == "Yellow"){
            System.out.println("Test passed , wave color is " + waveColor);
        }else{
            System.out.println("Test failed");
        }
    }
    public void orangeDecectorTest() {
        LightColorDetector victim = new LightColorDetector();
        String waveColor;
        waveColor = victim.colorDetector(600);
        if (waveColor == "Orange"){
            System.out.println("Test passed , wave color is " + waveColor);
        }else{
            System.out.println("Test failed");
        }
    }
    public void redDecectorTest() {
        LightColorDetector victim = new LightColorDetector();
        String waveColor;
        waveColor = victim.colorDetector(625);
        if (waveColor == "Red"){
            System.out.println("Test passed , wave color is " + waveColor);
        }else{
            System.out.println("Test failed");
        }
    }
    public void invisibleLightDecectorTest() {
        LightColorDetector victim = new LightColorDetector();
        String waveColor;
        waveColor = victim.colorDetector(1007);
        if (waveColor == "Invisible light"){
            System.out.println("Test passed , wave color is " + waveColor);
        }else{
            System.out.println("Test failed");
        }
    }
}