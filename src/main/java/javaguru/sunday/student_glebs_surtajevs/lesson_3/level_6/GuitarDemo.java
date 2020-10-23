package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_3.level_6;

class GuitarDemo {
    public static void main(String[] args) {

        Guitar guitar = new Guitar("Fender", 6, "White");
        String brand = guitar.getBrand();
        int strings = guitar.getNumberOfStrings();
        String color = guitar.getColor();
        System.out.println("Guitar brand = " + brand);
        System.out.println("Number of strings = " + strings);
        System.out.println("Guitar color = " + color);
    }
}
