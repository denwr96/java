package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_11.task_5;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {
    List<Book> bookList = new ArrayList<>();

    public boolean bookListContainsRequestedBook(Book book){
        if(bookList.contains(book)){
            return true;
        }
        return false;
    }
}
