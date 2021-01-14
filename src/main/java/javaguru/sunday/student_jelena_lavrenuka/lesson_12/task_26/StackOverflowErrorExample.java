package javaguru.sunday.student_jelena_lavrenuka.lesson_12.task_26;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class StackOverflowErrorExample {
    public static void main(String[] args) {
        StackOverflowErrorExample.recursivePrint(1);
    }

    public static void recursivePrint(int num) {
        System.out.println("Number: " + num);

        if(num == 0)
            return;
        else
            recursivePrint(++num);
    }
}
