package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15;

// Level 4: Task 23 --> Task 26 from line 101

import java.util.*;

public class BookDatabaseV2Impl implements BookDatabaseV2 {

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

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> uniqueAuthors = new HashSet<>();
        for (Book bookInList : bookList) {
            uniqueAuthors.add(bookInList.getAuthor());
        }
        return uniqueAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> uniqueTitles = new HashSet<>();
        for (Book bookInList : bookList) {
            uniqueTitles.add(bookInList.getTitle());
        }
        return uniqueTitles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> uniqueBooks = new HashSet<>();
        uniqueBooks.addAll(bookList);
        return uniqueBooks;
    }

    @Override
    public boolean contains(Book book) {
        return bookList.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> mapOfBooksByKeyAuthor = new HashMap<>();
        Set<String> authors = findUniqueAuthors();
        for (Book bookInList : bookList) {
            for (String author : authors) {
                mapOfBooksByKeyAuthor.put(author, findByAuthor(author));
            }
        }
        return mapOfBooksByKeyAuthor;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> mapOfBookCountByKeyAuthor = new HashMap<>();
        Set<String> authors = findUniqueAuthors();
        for (Book bookInList : bookList) {
            for (String author : authors) {
                mapOfBookCountByKeyAuthor.put(author, findByAuthor(author).size());
            }
        }
        return mapOfBookCountByKeyAuthor;
    }

}
