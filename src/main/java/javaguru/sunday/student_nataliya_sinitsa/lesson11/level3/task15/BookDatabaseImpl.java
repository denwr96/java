package javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15;

//Task 6 --> Task 14

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {

    Long id = 0L;

    @Override
    public Long save(Book book) {
        id = id + 1;
        book.setId(id);
        bookList.add(book);
        return id;
    }

    @Override
    public boolean delete(Long bookId) {
        for  (Book bookInList : bookList) {
            if (bookInList.getId().equals(bookId)) {
                bookList.remove(bookInList);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for  (Book bookInList : bookList) {
            if (bookInList.equals(book)) {
                bookList.remove(bookInList);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book bookInList : bookList) {
            if (bookInList.getId().equals(bookId)) {
                return Optional.of(bookInList);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> listByAuthor = new ArrayList<>();
        for (Book bookInList : bookList) {
            if (bookInList.getAuthor().equals(author)) {
                listByAuthor.add(bookInList);
            }
        }
        return listByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> listByTitle = new ArrayList<>();
        for (Book bookInList : bookList) {
            if (bookInList.getTitle().equals(title)) {
                listByTitle.add(bookInList);
            }
        }
        return listByTitle;
    }

    @Override
    public int countAllBooks() {
        return bookList.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        bookList.removeIf(bookInList -> bookInList.getAuthor().equals(author));
    }

    @Override
    public void deleteByTitle(String title) {
        bookList.removeIf(bookInList -> bookInList.getTitle().equals(title));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> listBySearchCriteria = new ArrayList<>();
        for (Book bookInList : bookList) {
            if (searchCriteria.match(bookInList)) {
                listBySearchCriteria.add(bookInList);
            }
        }
        return listBySearchCriteria;
    }

}

