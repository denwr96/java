package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_6.task_17;

class LoopWhileStop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
