package main.java.javaguru.sunday.student_deniss_lobacs.lesson_3.homework.level_6_middle.task24;

public class Car {

    String mark;
    String model;
    int year;

    public Car(String carMark,String carModel , int carYear){

        this.mark = carMark;
        this.model = carModel;
        this.year = carYear;
    }

    public void displayInfo() {

        System.out.println("Mark: " + mark);
        System.out.println("Model: " + model);

    }

    public void taxiCheak() {

        if(year < 2010) System.out.println("Ваша не машина годится для работы в такси");
        else System.out.println("Ваша машина годится для работы в такси");

   }
}
