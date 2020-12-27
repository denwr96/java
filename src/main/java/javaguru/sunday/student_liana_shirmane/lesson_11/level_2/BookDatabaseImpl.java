package javaguru.sunday.student_liana_shirmane.lesson_11.level_2;
//task6
//task7
//task8
//task9
//task10
//task11
//task12
//task13
//task14

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@CodeReview(approved = true)
class BookDatabaseImpl implements BookDatabase {

    List<Book> bookDatabase;

    public BookDatabaseImpl(List<Book> bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    long counter = 1;

    long countBooks = 0;

    @Override
    public Long save(Book book) {
        book.setId(counter);
        counter++;
        bookDatabase.add(book);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (int i = 0; i < bookDatabase.size(); i++) {
            if (bookDatabase.get(i).getId().equals(bookId)) {
                bookDatabase.remove(bookDatabase.get(i));
                return true;
            }

        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (int i = 0; i < bookDatabase.size(); i++)
            if (bookDatabase.get(i).equals(book)) {
                bookDatabase.remove(book);
                return true;
            }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : bookDatabase) {
            if (book.getId().equals(bookId)) return Optional.of(book);
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        ArrayList<Book> selectedBooks = new ArrayList<>();
        for (Book findByAuthor : bookDatabase) {
            if (findByAuthor.getAuthor().equals(author)) {
                selectedBooks.add(findByAuthor);
            }

        }
        return selectedBooks;
    }

    @Override
    public List<Book> findByTitle(String title) {
        ArrayList<Book> selectedBooks = new ArrayList<>();
        for (Book findBookByTitle : bookDatabase) {
            if (findBookByTitle.getTitle().contains(title)) {
                selectedBooks.add(findBookByTitle);
            }

        }
        return selectedBooks;
    }

    @Override
    public int countAllBooks() {
        return bookDatabase.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        bookDatabase.removeIf(findByAuthor -> findByAuthor.getAuthor().equals(author));
    }

    @Override
   public void deleteByTitle(String title){
        bookDatabase.removeIf(findByTitle -> findByTitle.getTitle().equals(title));
    }

    public void printBookList() {
        for (Book book : bookDatabase) {
            System.out.println(book.toString());
        }
    }
}

