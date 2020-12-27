package javaguru.sunday.student_artjom_proshkin.lesson_10.level_4_junior.task_12;

class FahrenheitConverterTest {

    public static void main(String[] args) {
        FahrenheitConverterTest test = new FahrenheitConverterTest();
        test.convertToFahrenheitTest1();
        test.convertToFahrenheitTest2();
    }

    void convertToFahrenheitTest1 (){
        FahrenheitConverter victim = new FahrenheitConverter();
        checkResult(victim.convert(40.0) == 104.0, "convertToFahrenheitTest1");
    }

    void convertToFahrenheitTest2 (){
        FahrenheitConverter victim = new FahrenheitConverter();
        checkResult(victim.convert(-20.0) == -4.0, "convertToFahrenheitTest2");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILED !");
        }
    }
}
