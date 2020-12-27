package main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_1_intern;

import java.util.ArrayList;

public class BookListContainsDemo {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        Book myBook = new Book("Principles" , "Alexandr Pushkin");
        System.out.println(bookList.contains(myBook));
        bookList.add(myBook);
        System.out.println(bookList.contains(myBook));
    }

}
