package javaguru.sunday.student_natalia_kochkina.lesson_12.level_4;

//Task_26

public class StackOverflowErrorExample {

    int number = 1;
    public void recursion()
    {
        number = number + 1;
        recursion();
    }

    public static void main(String[] args) {
        StackOverflowErrorExample stackOverflowErrorExample = new StackOverflowErrorExample();
        stackOverflowErrorExample.recursion();
    }
}
