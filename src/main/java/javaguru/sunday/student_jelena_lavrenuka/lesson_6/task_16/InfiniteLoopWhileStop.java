package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_6.task_16;

class InfiniteLoopWhileStop {
    public static void main(String[] args) {
        int i = 1;
        while (i > 0) {
            System.out.println("You are beautiful");
            i++;
            if (i == 5)
                break;
        }
    }
}
