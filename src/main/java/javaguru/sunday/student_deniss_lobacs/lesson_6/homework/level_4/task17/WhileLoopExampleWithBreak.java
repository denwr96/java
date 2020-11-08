package main.java.javaguru.sunday.student_deniss_lobacs.lesson_6.homework.level_4.task17;

public class WhileLoopExampleWithBreak {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            i++;
            System.out.println(i);
            if (i == 50) {
                break;
            }
        }
    }
}
