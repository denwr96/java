package main.java.javaguru.sunday.teacher.lesson_8.lessoncode.interfaces;

public class SingerDemo {

    public static void main(String[] args) {
        Singer elvisPresley = new ElvisPresley();
        Singer michaelJackson = new MichaelJackson();
        Singer britneySpears = new BritneySpears();
//
//        elvisPresley.sing();
//        michaelJackson.sing();
//        britneySpears.sing();

        Singer[] singers = new Singer[3];
        singers[0] = new ElvisPresley();
        singers[1] = new MichaelJackson();
        singers[2] = new BritneySpears();

        for (Singer singer : singers) {
            singer.sing();
        }
    }
}
