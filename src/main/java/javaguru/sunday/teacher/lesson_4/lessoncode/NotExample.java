package javaguru.sunday.teacher.lesson_4.lessoncode;

public class NotExample {

    public static void main(String[] args) {

        boolean rain = true;
        boolean wind = true;
        boolean umbrella = true;

        if (rain && wind && umbrella) {
            System.out.println("Я лечу на курсы");
        } else if (rain && umbrella) {
            System.out.println("Я иду на JAVAGURU!");
        } else if (rain && !umbrella) {
            System.out.println("Сижу дома, туплю в экран");
        } else if (!rain) {
            System.out.println("Дождя нет! Я иду на JAVAGURU!");
        }
    }
}
