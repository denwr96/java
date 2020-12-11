package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson10.level4.tesk12;

class TemperatureConverterTest {

    public static void main(String[] args) {

        TemperatureConverterTest test = new TemperatureConverterTest();
        test.shouldConvertToKelvin1();
        test.shouldConvertToKelvin2();
        test.shouldConvertToFahrenheit1();
        test.shouldConvertToFahrenheit2();

    }

    public void shouldConvertToKelvin1() {
        TemperatureConverter victim = new KelvinConverter();
        check(victim.convert(25) == 298.15, "shouldConvertToKelvin1");
    }

    public void shouldConvertToKelvin2() {
        TemperatureConverter victim = new KelvinConverter();
        check(victim.convert(15.85) == 289, "shouldConvertToKelvin2");
    }

    public void shouldConvertToFahrenheit1() {
        TemperatureConverter victim = new FahrenheitConverter();
        check(victim.convert(0) == 32, "shouldConvertToFahrenheit1");
    }

    public void shouldConvertToFahrenheit2() {
        TemperatureConverter victim = new FahrenheitConverter();
        check(victim.convert(10) == 50, "shouldConvertToFahrenheit2");
    }

    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
