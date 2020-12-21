package main.java.javaguru.sunday.student_sergej_savkin.lesson_11.level_1_intern.task_4;

import java.util.LinkedList;
import java.util.List;

class ArrayLIstOfBooksDemo {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<>();
        books.add(new Book("Harry Potter", "Johan Rolling", 350));
        books.add(new Book("Harry Potter", "Johan Rolling", 350));
        books.add(new Book("Harry Potter", "Johan Rolling", 350));

        System.out.println(books.toString());

    }
}
