package main.java.javaguru.sunday.student_artjom_proshkin.lesson_3.level_6_middle.task_24;

class RefrigeratorDemo {
    public static void main(String[] args) {

        Refrigerator beko = new Refrigerator("Beko","White");
        System.out.println(beko.brand +" " + beko.colour);
//        System.out.println(beko.brand +" "+ beko.colour +" "+ beko.doorState +" "+ beko.lightState);
        beko.doorOpen();
//        System.out.println(beko.brand +" "+ beko.colour +" "+ beko.doorState +" "+ beko.lightState);
        beko.doorClose();
//        System.out.println(beko.brand +" "+ beko.colour +" "+ beko.doorState +" "+ beko.lightState);


    }
}
