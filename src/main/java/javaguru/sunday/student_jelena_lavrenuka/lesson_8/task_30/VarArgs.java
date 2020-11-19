package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_8.task_30;

class VarArgs {
    public int sumOfAll(int...numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
}
