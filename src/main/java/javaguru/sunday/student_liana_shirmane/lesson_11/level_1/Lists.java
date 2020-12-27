package javaguru.sunday.student_liana_shirmane.lesson_11.level_1;
//task1

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
@CodeReview(approved = true)
class Lists {
    List<String> productDataBase = new ArrayList<>();
    List<String> birthdayList = new LinkedList<>();
}

//    ArrayList следует использовать, когда в приоритете доступ по индексу,
//        так как эти операции выполняются за константное время.
//        Добавление в конец списка в среднем тоже выполняется за
//        константное время. Кроме того в ArrayList нет дополнительных
//        расходов на хранение связки между элементами.Минусы в скорости
//        вставки/удаления элементов находящихся не в конце списка, так
//        как при этой операции все элементы правее добавляемого/удаляемого сдвигаются.

//    LinkedList удобен когда важнее быстродействие операций вставки/удаления,
//        которые в LinkedList выполняются за константное время. Операции доступа
//        по индексу производятся перебором с начала или конца (смотря что ближе)
//        до нужного элемента. Дополнительные затраты на хранение связки между элементами.
