package main.java.javaguru.sunday.student_natalia_kochkina.lesson_6.level_4;

//Task_16

public class BreakWithWhileExample {

    public static void main(String[] args) {
        int i = 1;
        while (i > 0) {
            System.out.println(i);
            i++;
            if (i == 10 ) {
                break;
            }
        }
    }
}
