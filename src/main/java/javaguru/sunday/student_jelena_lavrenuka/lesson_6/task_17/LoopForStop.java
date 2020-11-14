package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_6.task_17;

class LoopForStop {
    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            if (i == 5)
                continue;
            System.out.println(i);
        }
    }
}
