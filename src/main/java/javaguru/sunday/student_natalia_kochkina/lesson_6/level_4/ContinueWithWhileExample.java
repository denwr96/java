package main.java.javaguru.sunday.student_natalia_kochkina.lesson_6.level_4;

//Task_17

public class ContinueWithWhileExample {

    public static void main(String[] args) {

        int i = 0;
        while (i < 5) {
            i++;
            if (i == 3)
                continue;
            System.out.println(i);
        }
    }
}
