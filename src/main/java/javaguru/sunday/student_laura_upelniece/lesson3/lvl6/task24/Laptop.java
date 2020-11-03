package main.java.javaguru.sunday.student_laura_upelniece.lesson3.lvl6.task24;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import org.graalvm.compiler.lir.CompositeValue;

@CodeReview(approved = true)
public class Laptop {
    String laptopOwner;
    boolean powerOn;
    boolean screenOpen;


    public Laptop(String owner, boolean power, boolean open) {
        System.out.println("Owner: " + owner);
        this.laptopOwner = owner;
        this.powerOn = power;
        this.screenOpen = open;

    }

    void checkState() {
        System.out.print("State: ");

        if (powerOn && screenOpen) {
            System.out.println("laptop is on and open");
        } else if (powerOn) {
            System.out.println("laptop is on, but closed");
        } else if (screenOpen) {
            System.out.println("laptop is off and open");
        } else {
            System.out.println("laptop is off and closed");
        }

    }

    void turnOn() {
        if (!powerOn) {
            System.out.println("...turning on the laptop...");
            powerOn = true;
        } else {
            System.out.println("Laptop is already on");
        }
    }

    void turnOff() {
        System.out.println("...turning off the laptop...");
               if (powerOn) { powerOn = false;
                   } else {
                   System.out.println("Power is already off");
               }
    }

    void closeLaptop() {
        screenOpen = !screenOpen;
    }

    void openLaptop() {
        if (!screenOpen) {
            screenOpen = true; }
        }

    }




