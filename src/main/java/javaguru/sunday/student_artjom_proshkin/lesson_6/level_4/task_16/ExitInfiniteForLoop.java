package javaguru.sunday.student_artjom_proshkin.lesson_6.level_4.task_16;


class ExitInfiniteForLoop {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if (i == 12) {
                System.out.println("Bye");
                break;
            }
        }
    }
}
