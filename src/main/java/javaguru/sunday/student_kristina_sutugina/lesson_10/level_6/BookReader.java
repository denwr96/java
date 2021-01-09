package javaguru.sunday.student_kristina_sutugina.lesson_10.level_6;
//task 14

import java.util.ArrayList;

interface BookReader {
    boolean addBook(Book book);
    boolean checkIsAuthorAndName(Book book);
    boolean deleteBook(Book book);
   ArrayList<String> allBooks();
    ArrayList<Book> searchByAuthor(String author);

}
