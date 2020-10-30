package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_4.supertask_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FizzBuzzDemo {
    public static void main(String[] args) {
        FizzBuzz test = new FizzBuzz();
        String result = test.fizzBuzzdetect(67);
        System.out.println(result);
    }
}
