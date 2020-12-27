package javaguru.sunday.student_jelena_lavrenuka.lesson_11.task_3;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
class IntegerListDemo {
    public void integerListDemo() {
        List<Integer> myIntegerList = new ArrayList<Integer>();
        myIntegerList.add(0, 15); //добавление элемента в начало списка
        myIntegerList.add(14);                 //добавление элемента в конец списка
        myIntegerList.size();                  // количество элемкентов в списке (длина)
        myIntegerList.remove(0);         // удалить элемент из списка по интексу
        myIntegerList.remove("15");         // удаляем по объекту
        myIntegerList.isEmpty();               // узнать пустой список или нет

        for (Integer myIntList:myIntegerList) { //обойти список и вывести на консоль каждый элемент
            System.out.println(myIntList);
        }




    }
}
