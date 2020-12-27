package javaguru.sunday.teacher.lesson_4.lessoncode;

public class Car {

    public String man;
    public int speed;
    public int openDoors;
    public int maxDoors;
    public boolean engine;

    public Car(String man, int maxDoors) {
        this.man = man;
        this.speed = 0;
        this.openDoors = 0;
        this.maxDoors = maxDoors;
        this.engine = false;
    }

    public void setOpenDoors(int numberOfDoorsToOpen) {
        //Можно ли открыть столько дверей? && Не откроем ли мы больше дверей, чем возможно?
//        if (maxDoors >= numberOfDoorsToOpen && (openDoors + numberOfDoorsToOpen) <= maxDoors) {
//            openDoors = numberOfDoorsToOpen;
//        } else {
//            System.out.println("There is no available doors");
//        }

        if (numberOfDoorsToOpen >= maxDoors || (openDoors + numberOfDoorsToOpen) >= maxDoors) {
            openDoors = maxDoors;
        } else {
            openDoors = openDoors + numberOfDoorsToOpen;
        }
    }

    public void accelerate() {
        if (engine && openDoors == 0) {
            speed = speed + 10;
            //speed+=10;
        } else {
            System.out.println("Engine is OFF OR Doors are open");
        }
    }

    public void startStopEngine() {
//        engine = !engine;
//        true -> false;
//        false -> true;
        if (engine) {
            engine = false;
        } else {
            engine = true;
        }
    }

}
