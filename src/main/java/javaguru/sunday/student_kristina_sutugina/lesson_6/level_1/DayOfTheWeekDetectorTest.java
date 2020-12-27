package javaguru.sunday.student_kristina_sutugina.lesson_6.level_1;
//Task_2
//нет codeReview
class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest victim = new DayOfTheWeekDetectorTest();
        victim.checkNumberOne("checkNumberOne");
        victim.checkNumberTwo("checkNumberTwo");
        victim.checkNumberThree("checkNumberThree");
        victim.checkNumberFour("checkNumberFour");
        victim.checkNumberFive("checkNumberFive");
        victim.checkNumberSix("checkNumberSix");
        victim.checkNumberSeven("checkNumberSeven");
        victim.checkOtherNumbers("checkOtherNumbers");

    }

    public void checkNumberOne(String name) {
        int inputNumber = 1;
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String result = victim.detectDayName(inputNumber);
        if (result.equals("Monday")) {
            System.out.println(name + " test passed");
        } else {
            System.out.println(name + " test failed");
        }
    }

    public void checkNumberTwo(String name) {
        int inputNumber = 2;
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String result = victim.detectDayName(inputNumber);
        if (result.equals("Tuesday")) {
            System.out.println(name + " test passed");
        } else {
            System.out.println(name + " test failed");
        }
    }

    public void checkNumberThree(String name) {
        int inputNumber = 3;
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String result = victim.detectDayName(inputNumber);
        if (result.equals("Wednesday")) {
            System.out.println(name + " test passed");
        } else {
            System.out.println(name + " test failed");
        }
    }

    public void checkNumberFour(String name) {
        int inputNumber = 4;
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String result = victim.detectDayName(inputNumber);
        if (result.equals("Thursday")) {
            System.out.println(name + " test passed");
        } else {
            System.out.println(name + " test failed");
        }
    }

    public void checkNumberFive(String name) {
        int inputNumber = 5;
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String result = victim.detectDayName(inputNumber);
        if (result.equals("Friday")) {
            System.out.println(name + " test passed");
        } else {
            System.out.println(name + " test failed");
        }
    }

    public void checkNumberSix(String name) {
        int inputNumber = 6;
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String result = victim.detectDayName(inputNumber);
        if (result.equals("Saturday")) {
            System.out.println(name + " test passed");
        } else {
            System.out.println(name + " test failed");
        }
    }

    public void checkNumberSeven(String name) {
        int inputNumber = 7;
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String result = victim.detectDayName(inputNumber);
        if (result.equals("Sunday")) {
            System.out.println(name + " test passed");
        } else {
            System.out.println(name + " test failed");
        }
    }
    public void checkOtherNumbers(String name) {
        int inputNumber = 8;
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String result = victim.detectDayName(inputNumber);
        if (result.equals("Wrong")) {
            System.out.println(name + " test passed");
        } else {
            System.out.println(name + " test failed");
        }
    }
}
