package main.java.javaguru.sunday.student_natalia_kochkina.lesson_10.level_1;

//Task_3

public interface MyList {

    //добавить в массив элемент element под индексом i
    void add(int i, int element);

    //вернуть индекс какого-либо элемента массива
    int returnI(int element);

    //вернуть элемент массива, который находится под индексом i
    int returnElement(int i);

    //удалить из массива какой-либо элемент
    void deleteElement(int element);

    //удалить из массива элемент под индексом i
    void deleteEndex(int i);

    //посчитать, сколько раз элемент element встречатеся в массиве
    int quantity(int element);

}
