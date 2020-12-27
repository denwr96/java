package javaguru.sunday.student_nataliya_sinitsa.lesson11.level1.task5;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.LinkedList;
import java.util.List;
@CodeReview(approved = true)
public class BookListContainsDemo {

   List<Book> bookList = new LinkedList<>();

    public static void main(String[] args) {

        BookListContainsDemo demo = new BookListContainsDemo();

        Book newBook1 = new Book("A.S.P.", "R. & L.");
        Book newBook2 = new Book("M. B.", "M. & M.");

        demo.addToList(newBook2);

        System.out.println(newBook1.isInList());
        System.out.println(newBook2.isInList());

    }

    public void addToList(Book bookToAdd) {
        bookList.add(bookToAdd);
        bookToAdd.setInList(true);
    }

}
