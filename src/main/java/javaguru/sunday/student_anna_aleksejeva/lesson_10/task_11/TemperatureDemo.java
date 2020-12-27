package javaguru.sunday.student_anna_aleksejeva.lesson_10.task_11;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class TemperatureDemo {

    public static void main(String[] args) {
        TemperatureDemo myTDemo = new TemperatureDemo();
        myTDemo.infoTemp(67.0);
    }

    public void infoTemp(double temperature) {
        Fahrenheit myTDemo = new Fahrenheit();
        double fahrenheit = myTDemo.temperature(temperature);
        Kelvins myTDemo1 = new Kelvins();
        double kelvins = myTDemo1.temperature(temperature);
        System.out.println("Celsius " + temperature);
        System.out.println("Fahrenhein " + fahrenheit);
        System.out.println("Kelvins " + kelvins);
    }
}
