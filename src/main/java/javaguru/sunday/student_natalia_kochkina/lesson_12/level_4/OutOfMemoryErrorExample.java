package javaguru.sunday.student_natalia_kochkina.lesson_12.level_4;

//Task_25

import javaguru.sunday.student_natalia_kochkina.lesson_9.level_1.Book;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        int i = 0;
        while (i < 1000000000) {
            Book book = new Book();
            books.add(book);
            i = i + 1;
        }
    }

}
