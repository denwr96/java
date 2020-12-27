package javaguru.sunday.student_jelena_lavrenuka.lesson_11.task_4;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
// позволяет хранить дубликаты
class Duplicates {
    public static void main(String[] args) {
        Duplicates demo = new Duplicates();
        demo.duplicatesInList();
    }
    public void duplicatesInList(){
        List <String> myJokeCollection = new ArrayList<>();
        myJokeCollection.add("А у Вас вся спина белая");
        myJokeCollection.add("Парниша хо хо");
        myJokeCollection.add("Не учите меня жить");
        myJokeCollection.add("А у Вас вся спина белая");
        myJokeCollection.add("Парниша хо хо");
        for (String collectionToPrint:myJokeCollection) {
            System.out.println(collectionToPrint);

        }
    }
}
