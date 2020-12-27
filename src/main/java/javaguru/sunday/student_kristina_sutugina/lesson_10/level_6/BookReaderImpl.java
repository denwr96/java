package main.java.javaguru.sunday.student_kristina_sutugina.lesson_10.level_6;
//task 14
//task 15



import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {


   List<Book> list = new ArrayList<>();
   // private List<Book> list;
 // public BookReaderImpl(List<Book> list) {
      // this.list = list;
  // }
    @Override
    public boolean addBook(Book book) {
        if(!list.contains(book)) {
            list.add(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkIsAuthorAndName(Book book) {
        if(!list.contains(book)){
           if((book.getBookName() != null && !book.getBookName().isEmpty()) && (book.getAuthor() != null && !book.getAuthor().isEmpty())){
               this.list.add(book);
               return true;
           }
        }
        return false;
    }

    @Override
    public boolean deleteBook(Book book) {
        
        return false;
    }


}
