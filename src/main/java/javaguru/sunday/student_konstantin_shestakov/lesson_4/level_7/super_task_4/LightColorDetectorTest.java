package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_4.level_7.super_task_4;

class LightColorDetectorTest {

    private LightColorDetector lightColorDetector = new LightColorDetector();
    private String result;

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.testViolet(380);
        lightColorDetector.testBlue(475);
        lightColorDetector.testGreen(505);
        lightColorDetector.testYellow(585);
        lightColorDetector.testOrange(619);
        lightColorDetector.testRed(620);
        lightColorDetector.testInvisible(760);
    }

    private void checkResults(boolean testResult, String testName) {
        if (testResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }

    public void testViolet(int wavelength) {
        result = lightColorDetector.detect(wavelength);
        checkResults(result == "Violet", "Violet Test");
        }

    public void testBlue(int wavelength) {
        result = lightColorDetector.detect(wavelength);
        checkResults(result == "Blue", "Blue Test");
    }
    public void testGreen(int wavelength) {
        result = lightColorDetector.detect(wavelength);
        checkResults(result == "Green", "Green Test");
    }

    public void testYellow(int wavelength) {
        result = lightColorDetector.detect(wavelength);
        checkResults(result == "Yellow", "Yellow Test");
    }

    public void testOrange(int wavelength) {
        result = lightColorDetector.detect(wavelength);
        checkResults(result == "Orange", "Orange Test");
    }

    public void testRed(int wavelength) {
        result = lightColorDetector.detect(wavelength);
        checkResults(result == "Red", "Red Test");
    }
    public void testInvisible(int wavelength) {
        result = lightColorDetector.detect(wavelength);
        checkResults(result == "Invisible Light", "Invisible Light Test");
    }
}
