package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_3.level_6;

class Guitar {

    String brand;
    int strings;
    String color;

    Guitar(String brand,
                int strings,
                String color) {
        this.brand = brand;
        this.strings = strings;
        this.color = color;
    }

    String getBrand() {
        return this.brand;
    }

    int getNumberOfStrings() {
        return this.strings;
    }

    String getColor() {
        return this.color;
    }
}
