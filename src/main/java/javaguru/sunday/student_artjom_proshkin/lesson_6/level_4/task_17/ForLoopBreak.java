package javaguru.sunday.student_artjom_proshkin.lesson_6.level_4.task_17;

class ForLoopBreak {

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i += 25) {
            System.out.println(i);
            if (i == 175) {
                break;
            }
        }
    }
}
