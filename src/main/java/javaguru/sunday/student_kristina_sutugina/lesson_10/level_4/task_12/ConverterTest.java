package javaguru.sunday.student_kristina_sutugina.lesson_10.level_4.task_12;

class ConverterTest {
    public static void main(String[] args) {
        ConverterTest converterTest = new ConverterTest();
        converterTest.kelvinConverterTest();
        converterTest.fahrenheitConverter();
    }

    public void kelvinConverterTest() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double realResult = kelvinConverter.convert(2);
        double expectedResult = 275.15;
        check(expectedResult, realResult, "kelvinConverterTest");
    }

    public void fahrenheitConverter() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double realResult = fahrenheitConverter.convert(2);
        double expectedResult = 35.6;
        check(expectedResult, realResult, "fahrenheitConverter");
    }

    public void check(double expectedResult, double realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed");
        }
    }
}
