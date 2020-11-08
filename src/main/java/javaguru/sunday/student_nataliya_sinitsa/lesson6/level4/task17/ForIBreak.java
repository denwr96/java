package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson6.level4.task17;

class ForIBreak {

    public static void main(String[] args) {

        System.out.println("Numbers from 10 to 20 above 15");
        for (int i = 20; i > 10; i--) {
            if (i == 15) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("Numbers from 10 to 20 below 15");
        for (int i = 10; i < 20; i++) {
            if (i == 15) {
                break;
            }
            System.out.println(i);
        }

    }

}
