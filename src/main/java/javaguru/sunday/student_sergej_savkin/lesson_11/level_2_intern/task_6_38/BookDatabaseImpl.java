package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.*;

//task6
//task7
//task8
//task9
//task10
//task11
//task12
//task13
//task14
//task22
//task23
//task24
//task25
//task26
//task28
//task29

@CodeReview(approved = false)
@CodeReviewComment(comment = "CountAllBooks надо переделать. Зачем вы делаете ппереход по всем элементам? если есть метод size?")
class BookDatabaseImpl implements BookDatabase {

    List<Book> books = new ArrayList<>();
    long id = 0;

    @Override
    public Long save(Book book) {
        books.add(book);
        book.setId(++id);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getId().equals(bookId)) {
                books.remove(books.get(i));
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).equals(book)) {
                books.remove(books.get(i));
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> foundByAuthorBookList = new LinkedList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                foundByAuthorBookList.add(book);
            }
        }
        return foundByAuthorBookList;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> foundByTitleList = new LinkedList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                foundByTitleList.add(book);
            }
        }
        return foundByTitleList;
    }

    @Override
    public int countAllBooks() {
        int bookCounter = 0;
        for (Book book: books) {
            bookCounter++;
        }
        return bookCounter;
    }

    @Override
    public void deleteByAuthor(String author) {
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getAuthor().equals(author)) {
                books.remove(books.get(i));
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getTitle().equals(title)) {
                books.remove(books.get(i));
            }
        }
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> foundBySearchCriteriaList = new LinkedList<>();
        for (Book book : books) {
            if (searchCriteria.match(book)) {
                foundBySearchCriteriaList.add(book);
            }
        }
        return foundBySearchCriteriaList;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> foundUniqueAuthors = new HashSet<>();
        for (Book book : books) {
            foundUniqueAuthors.add(book.getAuthor());
        }
        return foundUniqueAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> foundUniqueTitles = new HashSet<>();
        for (Book book : books) {
            foundUniqueTitles.add(book.getTitle());
        }
        return foundUniqueTitles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> foundUniqueBooks = new HashSet<>();
        foundUniqueBooks.addAll(books);
        return foundUniqueBooks;
    }

    @Override
    public boolean contains(Book book) {
        return books.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> authorToBooksMap = new HashMap<>();
        Set<String> authorList = findUniqueAuthors();
        for (String author : authorList) {
            authorToBooksMap.put(author, findByAuthor(author));
        }
        return authorToBooksMap;
    }

    public int getAuthorUniqueBookCount(String author) {
        Set<Book> authorUniqueBook = new HashSet<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                authorUniqueBook.add(book);
            }
        }
        return authorUniqueBook.size();
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> eachAuthorBookCount = new HashMap<>();
        Set<String> authorList = findUniqueAuthors();
        for (String author : authorList) {
            eachAuthorBookCount.put(author, getAuthorUniqueBookCount(author));
        }
        return eachAuthorBookCount;
    }

}
