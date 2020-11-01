package main.java.javaguru.sunday.teacher.lesson_6.lessoncode;

public class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setEngine(true);

        myCar.changeSpeed(10);
        System.out.println(myCar.getSpeed());

        myCar.changeSpeed(20);
        System.out.println(myCar.getSpeed());

        myCar.changeSpeed(5);
        System.out.println(myCar.getSpeed());

        CarDemo carDemo = new CarDemo();
        carDemo.stop(myCar.getSpeedOmeter());
        System.out.println(myCar.getSpeed());



    }

    public void stop(SpeedOmeter speedOmeter) {
        speedOmeter.setSpeed(0);
    }
}
