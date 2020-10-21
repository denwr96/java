package main.java.javaguru.sunday.student_kristina_sutugina.lesson_3.level_1;

//Task_1
//Task_2
//Task_5
//Task_11
//Task_12
//Task_13

 class Robot {
     // Добавьте в класс Robot свойство name (в этом свойстве наш виртуальный обьект робот будет запоминать своё имя.)
     String name;

     void sayHello() {
         // тут напишите команду распечатки на консоли строки "Hello!"
         System.out.println("Hello!");
     }

     // В классе робот (Robot) создайте конструктор без параметров:
     Robot() {

     }

     Robot(String robotName) {
         // Это конструктор класса. У этого конструктора один параметр
         // с названием name и типом String. Тоесть при создании робота
         // в его конструктор будут передавать название робота.
         this.name = robotName; // а тут робот запоминает в своем свойстве this.name как его зовут
     }


     void sayYourName() {
         // тут напишите команду распечатки на консоли строки "My name is ROBO"
         // System.out.println("My name is ROBO");

         //Воспользуйтесь свойством класса в методе sayYourName():
         System.out.println("My name is " + this.name);
     }
 }
