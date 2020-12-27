package javaguru.sunday.student_artjom_proshkin.lesson_10.level_4_junior.task_11;

class ConverterOfTemperatureTest {

    public static void main(String[] args) {
        ConverterOfTemperatureTest test = new ConverterOfTemperatureTest();
        test.makeItKelvinTest();
        test.makeItFahrenheitTest();
    }

    void makeItKelvinTest() {
        ConverterOfTemperature victim = new ConverterOfTemperature();
        checkResult(victim.makeItKelvin(0.0) == 273.15, "makeItKelvinTest");
    }

    void makeItFahrenheitTest() {
        ConverterOfTemperature victim = new ConverterOfTemperature();
        checkResult(victim.makeItFahrenheit(0.0) == 32.0, "makeItFahrenheitTest");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILED !");
        }
    }
}
