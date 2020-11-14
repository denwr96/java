package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_7.task_10;

class PowerCalculator {
    public int PowerCalculator (int number, int degree){
        int result = 1;
        for (int i = 0; i < degree; i++) {
            result = result * number;
        } return result;
    }
}
