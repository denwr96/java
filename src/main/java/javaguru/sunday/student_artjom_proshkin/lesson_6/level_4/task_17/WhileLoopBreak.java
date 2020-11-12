package main.java.javaguru.sunday.student_artjom_proshkin.lesson_6.level_4.task_17;

class WhileLoopBreak {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            System.out.println(i);
            i += 5;
            if (i == 25) {
                break;
            }
        }
    }
}
