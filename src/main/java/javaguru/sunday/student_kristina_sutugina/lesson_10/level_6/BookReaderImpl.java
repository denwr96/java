package javaguru.sunday.student_kristina_sutugina.lesson_10.level_6;
//task 14
//task 15
//task 16
//task 17
//task 18

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.ArrayList;
import java.util.List;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Необходимо использовать интерфейс List, а не конкретную имплементацию.")
class BookReaderImpl implements BookReader {


   List<Book> bookList = new ArrayList<>();
   // private List<Book> list;
 // public BookReaderImpl(List<Book> list) {
      // this.list = list;
  // }
    @Override
    public boolean addBook(Book book) {
        if(!bookList.contains(book)) {
            bookList.add(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkIsAuthorAndName(Book book) {
        if(!bookList.contains(book)){
           if((book.getBookName() != null && !book.getBookName().isEmpty()) && (book.getAuthor() != null && !book.getAuthor().isEmpty())){
               this.bookList.add(book);
               return true;
           }
        }
        return false;
    }

    @Override
    public boolean deleteBook(Book book) {
        if(bookList.contains(book)){
            this.bookList.remove(book);
            return true;
        }
        
        return false;
    }

    @Override
    public ArrayList<String> allBooks() {
        ArrayList<String> books = new ArrayList<>();
        for(Book book: bookList){
            books.add(book.toString());
        }
        return books;
    }

    @Override
    public ArrayList<Book> searchByAuthor(String author) {
        ArrayList<Book> search = new ArrayList<>();
        for(Book book: bookList){
           if(author.equals(book.getAuthor())) search.add(book);
        }
        return search;
    }


}
