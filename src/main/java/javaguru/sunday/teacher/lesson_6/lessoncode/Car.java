package javaguru.sunday.teacher.lesson_6.lessoncode;

public class Car {

    private boolean engine;
    private SpeedOmeter speedOmeter = new SpeedOmeter();

    public void changeSpeed(int newSpeed) {
        if (engine) {
            if (newSpeed > speedOmeter.getSpeed()) {
                for (int i = speedOmeter.getSpeed(); i < newSpeed; i++) {
                    speedOmeter.setSpeed(speedOmeter.getSpeed() + 1);
                }
            } else {
                for (int i = speedOmeter.getSpeed(); i > newSpeed; i--) {
                    speedOmeter.setSpeed(speedOmeter.getSpeed() - 1);
                }
            }
        }
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getSpeed() {
        return speedOmeter.getSpeed();
    }

    public SpeedOmeter getSpeedOmeter() {
        return speedOmeter;
    }

    public void setSpeedOmeter(SpeedOmeter speedOmeter) {
        this.speedOmeter = speedOmeter;
    }
}
