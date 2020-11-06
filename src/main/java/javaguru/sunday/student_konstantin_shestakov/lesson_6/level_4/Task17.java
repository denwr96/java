package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_6.level_4;

class Task17 {

    public static void main(String[] args) {
        int i = 1;

        while (i > 0) {
            System.out.println("while loop");

            for ( ; i > 0; i++) {
                System.out.println("for loop");
                continue;
            }
            continue;
        }
    }
}
