package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson10.level1.task3;

import java.util.List;

interface MyList {

    void changeListSize(int newListSize);
    //меняет размер списка: расширяет до нужного, при уменьшении предупреждает, если элементов больше,
    // чем новый размер списка;

    void emptyList();
    //удаляет все объекты из списка;

    boolean listIsEmpty(List listExample);
    //проверяет, пуст ли список

    void addNextElement(Object newObject);
    //добавяет новый элемент следющим после последнего имеющегося;

    void findAndRemoveDuplicates(List listExample);
    //находит и удаляет повторяющиеся элементы

}
