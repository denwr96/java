package javaguru.sunday.teacher.lesson_8.lessoncode.abstractclassexample;

public class ElectricCar extends Car {

    private int batteryCapacity;

    public ElectricCar(String model, int batteryCapacity) {
        super(model);
        this.batteryCapacity = batteryCapacity;
    }



    @Override
    void start() {
        if (batteryCapacity > 0) {
            System.out.println("Electrical car started...");
        } else {
            System.out.println("Low capacity");
        }
    }

    @Override
    void fillFuel() {
        batteryCapacity++;
    }

    @Override
    void openDoors() {

    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
