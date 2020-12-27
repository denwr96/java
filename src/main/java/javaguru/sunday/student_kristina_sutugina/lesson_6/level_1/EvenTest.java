package main.java.javaguru.sunday.student_kristina_sutugina.lesson_6.level_1;
//нет codeReview
class EvenTest {
    public static void main(String[] args) {
        EvenTest evenTest = new EvenTest();
        evenTest.evenTest();
    }

    public void evenTest() {
        int number = 5;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result) {
            System.out.println("Is even.");
        } else {
            System.out.println("False. Number isn't even.");
        }
    }
}
