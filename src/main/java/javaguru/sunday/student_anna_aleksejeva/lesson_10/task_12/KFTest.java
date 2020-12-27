package javaguru.sunday.student_anna_aleksejeva.lesson_10.task_12;

import javaguru.sunday.teacher.annotations.CodeReview;

/* не понимаю, почему не работает FahrenheitTest */
@CodeReview(approved = true)
class KFTest {

    public static void main(String[] args) {
        KFTest test = new KFTest();
        test.kelvinTest();
        test.fahrenheitTest();
    }

    public void kelvinTest() {
        KelvinConverter victim = new KelvinConverter();
        double expectedRes = 340.15;
        double actualRes = victim.convert(67.0);
        testRes(actualRes, expectedRes, "KelvinTest ");
    }

    public void fahrenheitTest() {
        FahrenheitConverter victim = new FahrenheitConverter();
        double expectedRes = 152.6;
        double actualRes = victim.convert(67.0);
        testRes(actualRes, expectedRes, "FahrenheitTest ");
    }

    public void testRes(double actualRes, double expectedRes, String name) {
        if (expectedRes == actualRes) {
            System.out.println(name + "Passed!");
        } else {
            System.out.println(name + "Failed!! ");
        }
    }
}
