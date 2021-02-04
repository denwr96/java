package javaguru.sunday.student_jelena_lavrenuka.lesson_12.task_18;

import javaguru.sunday.teacher.annotations.CodeReview;

//NullPointerException - это исключения, возникающие при попытке использовать ссылку,
// которая не указывает ни на одно место в памяти (null),
// как если бы она ссылалась на объект.
// Вызов метода по ссылке null или попытка получить доступ к полю ссылки null
// вызовут метод NullPointerException
@CodeReview(approved = true)
class NullPointerExceptionDemo {
    public static void main(String[] args) {
        int[] myArray = {2,6,4};
        System.out.println(myArray[4]);
    }
}

