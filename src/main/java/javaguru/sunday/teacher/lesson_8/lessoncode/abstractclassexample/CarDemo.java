package javaguru.sunday.teacher.lesson_8.lessoncode.abstractclassexample;

public class CarDemo {

    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla X", 100);

        tesla.drive();
        tesla.fillFuel();
        tesla.start();
        tesla.openDoors();

    }
}
