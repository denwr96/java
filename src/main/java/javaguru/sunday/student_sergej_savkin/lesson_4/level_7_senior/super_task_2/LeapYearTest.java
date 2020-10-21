package main.java.javaguru.sunday.student_sergej_savkin.lesson_4.level_7_senior.super_task_2;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.shouldBeRegularIfNotDividedBy4();
        leapYearTest.shouldBeLeapYearIfDividedBy4AndNotDividedBy100();
        leapYearTest.shouldBeLeapYearIfDividedBy4AndDivided100AndDividedBy400();
        leapYearTest.shouldBeRegularYearIfDividedBy4AndDividedBy100AndNotDividedBy400();
    }

    public void shouldBeRegularIfNotDividedBy4(){
        LeapYear leapYear = new LeapYear();
        checkResult(!leapYear.isLeapYear(1), "shouldBeRegularIfNotDividedBy4");
    }

    public void shouldBeLeapYearIfDividedBy4AndNotDividedBy100(){
        LeapYear leapYear = new LeapYear();
        checkResult(leapYear.isLeapYear(120), "shouldBeLeapYearIfDividedBy4AndNotDividedBy100");
    }

    public void shouldBeLeapYearIfDividedBy4AndDivided100AndDividedBy400(){
        LeapYear leapYear = new LeapYear();
        checkResult(leapYear.isLeapYear(400), "shouldBeLeapYearIfDividedBy4AndDivided100AndDividedBy400");
    }

    public void shouldBeRegularYearIfDividedBy4AndDividedBy100AndNotDividedBy400(){
        LeapYear leapYear = new LeapYear();
        checkResult(!leapYear.isLeapYear(100), "shouldBeRegularYearIfDividedBy4AndDividedBy100AndNotDividedBy400");
    }

    public void checkResult(boolean condition, String testName){
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
