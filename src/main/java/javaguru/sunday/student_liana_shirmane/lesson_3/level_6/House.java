package main.java.javaguru.sunday.student_liana_shirmane.lesson_3.level_6;

//task24
class House {
    int floorNumber;
    int flatNumber;
    String color;

    House(int floorNumber, int flatNumber, String color) {
        this.floorNumber = floorNumber;
        this.flatNumber = flatNumber;
        this.color = color;
    }

    void houseInfo() {
        System.out.println("This house has " + floorNumber + " floors " + flatNumber + " flats and it is " + color + " color");
    }
}
