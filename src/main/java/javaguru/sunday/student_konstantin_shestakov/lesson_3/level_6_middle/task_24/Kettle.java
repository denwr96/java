package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_3.level_6_middle.task_24;

class Kettle {

    boolean turnOn;
    int waterTemperature;
    double waterVolume;

    Kettle(boolean kettleTurnOn, int kettleWaterTemperature, double kettleWaterVolume) {
        this.turnOn = kettleTurnOn;
        this.waterTemperature = kettleWaterTemperature;
        this.waterVolume = kettleWaterVolume;
    }

    void boil() { // Кипятим воду
        turnOn = true;
        System.out.println("Kettle TurnOn status: " + turnOn);
        for (; waterTemperature < 101; waterTemperature = waterTemperature + 20) {
            System.out.println("Water temperature: " + waterTemperature);
        }
        turnOn = false;
        System.out.println("Kettle TurnOn status: " + turnOn);
    }

    void pour() { // Разливаем воду по чашкам
        waterVolume = waterVolume - 0.3;
        System.out.println("Pouring water into cup, remaining water volume: " + (Math.round(waterVolume * 100.00) / 100.00) + "L");
    }

//    void kettleTurnOn() {
//        turnOn = true;
//        System.out.println("Kettle TurnOn status: " + turnOn);
//    }
//
//    void kettleTurnOff() {
//        turnOn = false;
//        System.out.println("Kettle TurnOn status: " + turnOn);
//    }
}