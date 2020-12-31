package javaguru.sunday.student_sergej_savkin.lesson_11.level_1_intern.task_5;

import java.util.ArrayList;
import java.util.List;


class BookListContainsDemo {


    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("Johan Rolling", "Harry Potter"));

        if(books.contains(new Book("Johan Rolling", "Harry Potter"))) {
            System.out.println("Contains!");
        } else {
            System.out.println("Doesn't contain");
        }
    }
}
