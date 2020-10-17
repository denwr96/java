package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_3.level_6_middle.task_24;

class KettleDemo {

    public static void main(String[] args) {

        Kettle myKettle = new Kettle(false, 20, 4);
        myKettle.boil(); // Кипятим воду
        myKettle.pour(); // Разливаем воду по чашкам
        myKettle.pour();
        myKettle.pour();
    }
}
