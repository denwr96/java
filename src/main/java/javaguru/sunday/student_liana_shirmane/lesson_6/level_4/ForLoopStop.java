package main.java.javaguru.sunday.student_liana_shirmane.lesson_6.level_4;
//task17
public class ForLoopStop {
    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            if (i == 5)
                continue;
            System.out.println(i);
        }
    }
}

