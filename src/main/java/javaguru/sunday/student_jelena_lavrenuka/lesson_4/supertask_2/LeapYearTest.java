package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_4.supertask_2;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest test = new LeapYearTest();
        test.shouldBeLeapYear();
    }

    public void shouldBeLeapYear(){
        LeapYear victim = new LeapYear();
        boolean actualResult = victim.isLeapYear(2020);
        boolean expectedResult = true;
        if(actualResult == expectedResult){
            System.out.println("Test is ok, it is leap year");
        } else {
            System.out.println("Test is failed, it isn't leap year");
        }
    }
}
