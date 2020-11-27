package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_8.task_30;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class VarArgsTest {
    public static void main(String[] args) {
        VarArgs test = new VarArgs();
        System.out.println(test.sumOfAll(5, 5, 7, 5));
    }
}
