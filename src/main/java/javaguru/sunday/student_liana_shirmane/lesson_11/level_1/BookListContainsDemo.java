package main.java.javaguru.sunday.student_liana_shirmane.lesson_11.level_1;
//task5

import java.util.ArrayList;

public class BookListContainsDemo {
    public static void main(String[] args) {
        BookListContainsDemo bookListContainsDemo = new BookListContainsDemo();
        bookListContainsDemo.checkList();
    }

    Book book1 = new Book("Leo Tolstoy", "War and Peace");
    Book book2 = new Book("Aleksandr Pushkin", "Evgeniy Onegin");
    Book book3 = new Book("Aleksandr Pushkin", "Pikovaya dama");

    public void checkList() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);


        if (bookList.contains(book3)) {
            System.out.println(book3.toString() + " is in the list");
        }
    }
}
