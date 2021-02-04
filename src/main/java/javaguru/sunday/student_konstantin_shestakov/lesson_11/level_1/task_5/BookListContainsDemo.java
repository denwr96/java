package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_1.task_5;


import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;

@CodeReview(approved = true)
class BookListContainsDemo {

    public static void main(String[] args) {
        Book book = new Book("Author", "Book 1");
        Book book2 = new Book("Author 2", "Book 2");
        List<Book> bookList = new ArrayList<>();
        bookList.add(book);
        bookList.add(book2);
        System.out.println(bookList.contains(book));
        System.out.println(bookList.toString());

        for (Book value : bookList) {
            if (value.equals(book)) {
                System.out.println(value.toString());
            }
        }
    }
}
