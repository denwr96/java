package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_12;

class ConverterTest {
    public static void main(String[] args) {
        ConverterTest test = new ConverterTest();
        test.kelvinConverterTest();
        test.fahrenheitConverterTest();
    }

    public void kelvinConverterTest(){
        KelvinConverter victim = new KelvinConverter();
        double expectedResult = 288.15;
        double actualResult = victim.convert(15.0);
        testResult(actualResult, expectedResult, "KelvinConverterTest");
    }

    public void fahrenheitConverterTest(){
        FahrenheitConverter victim = new FahrenheitConverter();
        double expectedResult = 59;
        double actualResult = victim.convert(15.0);
        testResult(actualResult, expectedResult, "FahrenheitConverterTest");
    }

    public void testResult(double actualResult, double expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }

}
