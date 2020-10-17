package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson3.level5;

// Task 18 --> Task 22

class Dog {

    private String name;
    private int age;
    private String color;

    public void voice() {
        // System.out.println(this.name + "! " + this.name + "! " + this.name + "!"); //Task 18
        System.out.println("My name is "+ this.name + "," +
                "I'm a smart dog and I'm " + this.age + "!" + " I'm " + this.color + "."); //Task 19
    }

    public void happyBirthday() {
        this.age = age + 1;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }


    public Dog (String dogName, int dogAge, String dogColor) {
        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }

}
