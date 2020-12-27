package javaguru.sunday.teacher.lesson_6.lessoncode;

public class ContinueWithFor {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i = i * 2) {
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }

    }
}
