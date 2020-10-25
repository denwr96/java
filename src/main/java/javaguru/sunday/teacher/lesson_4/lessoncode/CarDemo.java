package main.java.javaguru.sunday.teacher.lesson_4.lessoncode;

public class CarDemo {

    public static void main(String[] args) {

        Car myCar = new Car("KIA", 5);

        System.out.println("Engine: " + myCar.engine);
        myCar.accelerate();
        myCar.startStopEngine();

        System.out.println("Engine: " + myCar.engine);

        System.out.println("Currently opened doors" + myCar.openDoors);
        myCar.setOpenDoors(3);
        System.out.println("Currently opened doors" + myCar.openDoors);
        myCar.setOpenDoors(3);
        System.out.println("Currently opened doors" + myCar.openDoors);
        myCar.openDoors = 0;
        myCar.accelerate();
        System.out.println("Car speed" + myCar.speed);

    }
}
