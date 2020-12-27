package javaguru.sunday.teacher.lesson_3.lessoncode;

public class Car {

    private String color;        //color
    private String manufacture;  //manufacture
//    public int power;           //power
//    public double engineVolume; //engineVolume
//    public String engineType;   //engineType
    private int speed;            //speed
    public boolean openDoors;
    public boolean engineState;

    public Car() {

    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, String manufacture) {
        this.color = color;
        this.manufacture = manufacture;
    }

    public void startEngine() {
        engineState = true;
    }

    public void speedUp() {
        speed = speed + 1;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
