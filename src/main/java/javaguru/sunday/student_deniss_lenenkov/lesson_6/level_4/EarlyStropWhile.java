package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_6.level_4;

public class EarlyStropWhile {

    public static void main(String[] args) {

        int i = 1;
        while (i < 100) {
            if (i == 4) {
                break;
            }
            System.out.println("i: " + i);
            i++;
        }
    }
}