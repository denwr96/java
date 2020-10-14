package main.java.javaguru.sunday.student_artjom_proshkin.lesson_3.level_5_middle;

// Task_18
// Task_19
// Task_20
// Task_21
// Task_22

class Dog {

    String dogName;
    int dogAge;
    String dogColour;

    Dog(String dogName){this.dogName = dogName;}
    Dog(String dogName,int dogAge){this.dogName = dogName; this.dogAge = dogAge;}
    Dog(String dogName,int dogAge, String dogColour){
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColour = dogColour;}

    void voice3 (){
        System.out.print(dogName + " ");
        System.out.print(dogName + " ");
        System.out.println(dogName + " ");
    }

    void voice (){
        System.out.println(dogName + " " + dogAge + " " + dogColour);
    }

    void happyBirthday(){
        dogAge = dogAge + 1;
    }

    void changeColour(String newColour){
        dogColour = newColour;
    }

}
