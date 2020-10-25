package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson3.level6.task24;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Cat {

    private String name;
    public boolean hunger;
    public boolean sleeping;

    public void sayYouName () {
        System.out.println("Meow, it's me, " + this.name + ".");
    }

    public boolean eat () {
        hunger = false;
        System.out.println("I'm not hungry.");
        return hunger;
    }

    public boolean sleep () {
        sleeping = false;
        System.out.println("I've slept.");
        return sleeping;
    }

    Cat (String catName, boolean catIsHungry, boolean catWantsToSleep) {
        this.name = catName;
        this.hunger = catIsHungry;
        this.sleeping = catWantsToSleep;

    }

}
