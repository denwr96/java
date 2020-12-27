package javaguru.sunday.student_konstantin_shestakov.lesson_4.level_7.super_task_4;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
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

    public void testViolet(int waveLength) {
        result = lightColorDetector.detect(waveLength);
        checkResults(result == "Violet", "Violet Test");
        }

    public void testBlue(int waveLength) {
        result = lightColorDetector.detect(waveLength);
        checkResults(result == "Blue", "Blue Test");
    }
    public void testGreen(int waveLength) {
        result = lightColorDetector.detect(waveLength);
        checkResults(result == "Green", "Green Test");
    }

    public void testYellow(int waveLength) {
        result = lightColorDetector.detect(waveLength);
        checkResults(result == "Yellow", "Yellow Test");
    }

    public void testOrange(int waveLength) {
        result = lightColorDetector.detect(waveLength);
        checkResults(result == "Orange", "Orange Test");
    }

    public void testRed(int waveLength) {
        result = lightColorDetector.detect(waveLength);
        checkResults(result == "Red", "Red Test");
    }
    public void testInvisible(int waveLength) {
        result = lightColorDetector.detect(waveLength);
        checkResults(result == "Invisible Light", "Invisible Light Test");
    }
}
