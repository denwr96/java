package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson11.level1.task5;

import java.util.LinkedList;

public class BookListContainsDemo {

    LinkedList<Book> bookList = new LinkedList<>();

    public static void main(String[] args) {

        BookListContainsDemo demo = new BookListContainsDemo();

        Book newBook1 = new Book("A.S.P.", "R. & L.");
        Book newBook2 = new Book("M. B.", "M. & M.");

        demo.addToList(newBook1);

        System.out.println(newBook1.isInList());
        System.out.println(newBook2.isInList());

    }

    public void addToList(Book bookToAdd) {
        bookList.add(bookToAdd);
        bookToAdd.setInList(true);
    }

}
