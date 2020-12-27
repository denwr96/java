package javaguru.sunday.student_artjom_proshkin.lesson_10.level_4_junior.task_12;

class KelvinConverterTest {

    public static void main(String[] args) {
        KelvinConverterTest test = new KelvinConverterTest();
        test.convertToKelvinTest1();
        test.convertToKelvinTest2();

    }

    void convertToKelvinTest1(){
        KelvinConverter victim = new KelvinConverter();
        checkResult(victim.convert(0.0) == 273.15, "convertToKelvinTest1");
    }

    void convertToKelvinTest2(){
        KelvinConverter victim = new KelvinConverter();
        checkResult(victim.convert(-273.15) == 0, "convertToKelvinTest2");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILED !");
        }
    }
}
