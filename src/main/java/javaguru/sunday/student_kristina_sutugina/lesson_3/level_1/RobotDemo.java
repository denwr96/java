package javaguru.sunday.student_kristina_sutugina.lesson_3.level_1;

//Task_3
//Task_4
//Task_5
//Task_6

 class RobotDemo {
    public static void main(String[] args) {
        // создайте экземпляр класса Robot вызвав конструктор класса
        // сохраните ссылку (указатель) на только, что созданный
        // виртуальный обьект класса Robot в переменную,
        // она нам понадобиться для дальнейшего использования.
        Robot myRobot1 = new Robot ("Rider");

        //В методе main(...) класса RobotDemo вызовите
        //  метод sayHello() у созданного ранее виртуального обьекта.
        // Запустите вашу программу и убедитесь, что созданный вами
        // виртуальный обьект робот напечатал на консоли слово "Hello!".
        myRobot1.sayHello();
        myRobot1.sayYourName();

        Robot myRobot2 = new Robot("John");
        myRobot2.sayHello();
        myRobot2.sayYourName();
    }

}
