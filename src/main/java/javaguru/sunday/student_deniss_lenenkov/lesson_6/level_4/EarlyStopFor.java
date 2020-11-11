package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_6.level_4;

public class EarlyStopFor {
    public static void main(String[] args) {

        for(int i = 1; i < 100; i++){
            if (i == 4){
                break;
            }
            System.out.println("i: " + i);
        }
    }
}
