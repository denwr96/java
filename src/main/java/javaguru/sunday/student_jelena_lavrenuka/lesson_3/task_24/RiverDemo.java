package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_3.task_24;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class RiverDemo {
    public static void main(String[] args) {

        River myRiver = new River("Daugava", 1020);
        myRiver.information();
        myRiver.information2();
        System.out.println("Is River Daugava clean? " + myRiver.isClean);
    }
}
