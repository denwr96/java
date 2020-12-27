package javaguru.sunday.student_kristina_sutugina.lesson_10.level_4.task_11;

public class Test {
    public static void main(String[] args) {
        Test victim = new Test();
        victim.converterKelvinTest();
        victim.converterFahrenheitTest();
    }

    public void converterKelvinTest(){
        Converter converter = new Converter();
        double realResult = converter.convertToKelvin(2);
        double expectedResult = 275.15;
        check(expectedResult, realResult, "converterKelvinTest");
    }
    public void converterFahrenheitTest(){
        Converter converter = new Converter();
        double realResult = converter.convertToFahrenheit(2);
        double expectedResult = 35.6;
        check(expectedResult, realResult, "converterFahrenheitTest");
    }

    public void check(double expectedResult, double realResult, String testName){
        if(expectedResult==realResult){
            System.out.println(testName+ " passed");
        }else{
            System.out.println(testName+ " failed");
        }
    }
}
