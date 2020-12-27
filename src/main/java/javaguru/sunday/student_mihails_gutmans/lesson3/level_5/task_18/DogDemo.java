package javaguru.sunday.student_mihails_gutmans.lesson3.level_5.task_18;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DogDemo {

    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.voice(); // Task_18

        Dog mySecondDog = new Dog(5);
        mySecondDog.secondVoice(); // Task_19

        myDog.setAge(2);
        myDog.happyBirthday();
        System.out.println(myDog.getAge()); // proverka
        myDog.happyBirthday();
        System.out.println(myDog.getAge()); // proverka //Task_20 . Vopros : kak sdelatj tozhe smaoje bez "set" a vvodja peremennuju ? - Но вы же тут не делаете set? не совсем понял, что вы хотели спросить. Лучше спрашивать в телеге

        Dog myThirdDog = new Dog(7, "brown");
        myThirdDog.thirdVoice(); // Task_21

        Dog myFourthDog = new Dog (5,"white");
        myFourthDog.secondVoice();
        myFourthDog.changeColor("black");
        myFourthDog.secondVoice();
        System.out.println(myFourthDog.getThisColor()); // Task_22 ( ja tak ponimaju proberku nuzhno bilo sdelatj
        // otdeljno metodom sravnitj String v peremennoj objekta i posle ispolzovnaija metoda smeni cveta .
        // No u menja ne poluchilosj sdelatj eto cherez boolen ..


        //boolean notChangedColour = ( myFourthDog.this.colour == myFourthDog.getThisColor()){
        //    System.out.println(notChangedColour);}

    }
}
