package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_3.level_6_middle.task_24;

import java.util.Scanner;

class Bike {

    String color;
    boolean mount;
    int speed;

    Bike(String bikeColor, boolean bikeMount, int bikeSpeed) {
        this.color = bikeColor;
        this.mount = bikeMount;
        this.speed = bikeSpeed;
    }

    void bikeMount() { // Залазим на лесопед
            mount = true;
            System.out.println("Mount status: " + mount);
        }

    void bikeDismount() { // Слазим с лесопеда
        mount = false;
        System.out.println("Mount status: " + mount);
        }

    void bikeSpeedIncrease() { // Ускоряемся
        speed = speed + 3;
        System.out.println("Speed: " + speed);
    }

    void bikeSpeedDecrease() { // Замедляемся
        speed = speed - 3;
        System.out.println("Speed: " + speed);
    }

        void bikeChangeColor() { // Перекрашиваем лесопед
            if (speed == 0 & mount == false) {
                System.out.println("Enter bike's new color: ");
                Scanner scanner = new Scanner(System.in);
                String bikeColor = scanner.nextLine();
                this.color = bikeColor;
                System.out.println("Bike color is " + color);
            }

            else {
                System.out.println("You can't repaint while bike is on the move!!");
            }
        }
}


