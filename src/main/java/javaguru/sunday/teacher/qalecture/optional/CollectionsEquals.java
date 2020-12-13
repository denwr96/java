package main.java.javaguru.sunday.teacher.qalecture.optional;

import main.java.javaguru.sunday.student_deniss_lobacs.lesson2.Book;

import java.util.List;

public class CollectionsEquals {

    public boolean checkCollectionEquals(List<Book> colOne, List<Book> colTwo) {
        return colOne.containsAll(colTwo);
//        for (Book book : colOne) {
//            Book tempBook = colTwo.get(colOne.indexOf(book));
//            if (!book.equals(tempBook)) {
//                return false;
//            }
//        }
//        return true;
    }
}
