package main.java.javaguru.sunday.teacher.lesson_12.lessoncode.level_6_middle;

import java.util.ArrayList;

public class BookClient {

    public static void main(String[] args) {
        BookReader bookReader = new BookReaderImpl(new ArrayList<>());

        try {
            bookReader.addBook(new Book("A", "B"));
            bookReader.addBook(new Book("A", "B"));
        } catch (BookAlreadyExistsException e) {
            System.out.println(e.getMessage());
//            throw new RuntimeException("Something...");
        }


        try {
            bookReader.addBook(null);
        } catch (InputParameterValidationException e) {
            System.out.println(e.getMessage());
        } catch (BookAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        ArrayList<String> books = bookReader.getBooks();
    }
}
