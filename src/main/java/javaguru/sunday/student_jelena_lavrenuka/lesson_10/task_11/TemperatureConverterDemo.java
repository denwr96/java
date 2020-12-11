package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_11;

public class TemperatureConverterDemo {
    public static void main(String[] args) {
        TemperatureConverterDemo myDemo = new TemperatureConverterDemo();
        myDemo.printInformation(15.0);
    }

    public void printInformation(double temperature){
        FahrenheitConverter myDemo = new FahrenheitConverter();
        double fahrenheitResult = myDemo.temperatureConverter(temperature);
        KelvinsConverter myDemo1 = new KelvinsConverter();
        double kelvinsResult = myDemo1.temperatureConverter(temperature);
        System.out.println("Celsius degree " + temperature);
        System.out.println("Fahrenheit degree " + fahrenheitResult);
        System.out.println("Kelvins degree " + kelvinsResult);
    }
}
