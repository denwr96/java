package javaguru.sunday.student_kristina_sutugina.lesson_10.level_6;
//task 14

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.ArrayList;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Необходимо использовать интерфейс List, а не конкретную имплементацию.")
interface BookReader {
    boolean addBook(Book book);
    boolean checkIsAuthorAndName(Book book);
    boolean deleteBook(Book book);
   ArrayList<String> allBooks();
    ArrayList<Book> searchByAuthor(String author);

}
