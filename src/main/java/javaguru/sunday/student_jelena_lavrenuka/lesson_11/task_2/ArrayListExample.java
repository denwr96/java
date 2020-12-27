package javaguru.sunday.student_jelena_lavrenuka.lesson_11.task_2;

// коллекции могут хранить только Объекты.
// примитивные типы имеют классы-обертки. Их и используем в коллекциях.

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
class ArrayListExample {
    List<String> myJokeCollection = new ArrayList<>();
    List<Product> productList= new ArrayList<>();
    List<Integer> listOfIntegers = new ArrayList<>();

}
