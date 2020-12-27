package javaguru.sunday.student_emin_pjatnickis.lesson_3.homework.level_4;

// level_4

import javaguru.sunday.teacher.annotations.CodeReview;

// Task_14
@CodeReview(approved = true)
public class BookDemo {

    public static void main(String[] args) {

        Book myBook = new Book("Principles");

        String bookTitle = myBook.getTitle();

        System.out.println ("Book title = " + bookTitle);
    }

}
