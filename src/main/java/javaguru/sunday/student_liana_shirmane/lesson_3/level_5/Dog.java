package main.java.javaguru.sunday.student_liana_shirmane.lesson_3.level_5;
//task18
//task19
//task20
//task21
//task22
class Dog {
    String dogName;
    int dogAge;
    String dogColor;
    Dog(String dogName, int dogAge, String dogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }
    void makeVoice()
    {
        System.out.println("Voice: " +dogName +" " +dogName + " " +dogName);
    }

    void makeVoiceTwo()
    {
        System.out.println("Dog name: " + dogName +" Dog age: " + dogAge);
    }
    void happyBirthday() {
        dogAge = dogAge + 1;
    }
    void makeVoiceThree()
    {
        System.out.println("Dog name: " + dogName +" Dog age: " + dogAge);
    }
    void makeVoiceFour()
    {
        System.out.println("Dog name: " + dogName +" Dog age: " + dogAge +" Dog color: " + dogColor);
    }
    void changeColor(String newColor) {
        this.dogColor = newColor;
    }
}

