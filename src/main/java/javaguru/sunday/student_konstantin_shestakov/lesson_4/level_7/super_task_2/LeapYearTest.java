package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_4.level_7.super_task_2;

class LeapYearTest {

    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.notLeapYearIfNotDivBy4();
        leapYearTest.leapYearIfDivBy4andNotDivBy100();
        leapYearTest.leapYearIfDivBy4andDivBy100andDivBy400();
        leapYearTest.notLeapYearIfDivBy4andDivBy100andDivBy400();
    }

    public void notLeapYearIfNotDivBy4() {
        LeapYear leapYear = new LeapYear();
        checkResults(!leapYear.isLeapYear(1),"Если год не делится на 4, значит он обычный. Test 1");
    }

    public void leapYearIfDivBy4andNotDivBy100() {
        LeapYear leapYear = new LeapYear();
        checkResults(leapYear.isLeapYear(4),"Год делится на 4, но не делится на 100, год високосный. Test 2");
    }

    public void leapYearIfDivBy4andDivBy100andDivBy400() {
        LeapYear leapYear = new LeapYear();
        checkResults(leapYear.isLeapYear(400),"Год делится на 4, делится на 100, делится на 400, он високосный. Test 3");
    }

    public void notLeapYearIfDivBy4andDivBy100andDivBy400() {
        LeapYear leapYear = new LeapYear();
        checkResults(!leapYear.isLeapYear(100),"Иначе год обычный. Test 4");
    }


    private void checkResults(boolean leapYear, String testName) {
        if (leapYear) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }
}

