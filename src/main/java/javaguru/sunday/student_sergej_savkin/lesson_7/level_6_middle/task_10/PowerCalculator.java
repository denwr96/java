package javaguru.sunday.student_sergej_savkin.lesson_7.level_6_middle.task_10;


import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class PowerCalculator {
    public int raiseNumberToPower(int number, int power) {
        int result = 0;
        for (int i = 0; i < power; i++) {
            result = number * number;
        }
        return result;
    }

}
