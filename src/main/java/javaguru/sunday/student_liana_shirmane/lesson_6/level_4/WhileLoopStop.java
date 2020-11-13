package main.java.javaguru.sunday.student_liana_shirmane.lesson_6.level_4;
//task17
class WhileLoopStop {
    public static void main(String args[]) {
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
            if ( i == 5)
                continue;

        }
    }
}