package javaguru.sunday.student_kristina_sutugina.lesson_6.level_1;
//Task_3
//нет codeReview
class FizzBuzz {

    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            System.out.println("FizzBuzz");
            return "FizzBuzz";
        } else if (number% 3 == 0) {
            System.out.println("Fizz");
            return "Fizz";
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
            return "Buzz";
        } else {
            System.out.println("" + number);
            return Integer.toString(number);

        }
    }
}