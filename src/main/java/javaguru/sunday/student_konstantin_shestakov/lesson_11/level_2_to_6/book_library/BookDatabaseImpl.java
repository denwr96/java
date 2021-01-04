package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library;


// Task 6 - 14 (level 2);
// Task 22 (level 3);
// Task 23 - 26 (level 4);
// Task 28, 29 (level 5);

import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.search_criteria.SearchCriteria;

import java.util.*;

public class BookDatabaseImpl implements BookDatabase {

    List<Book> booksLibrary = new ArrayList<>();
    Long id = 0L;

    @Override
    public Long save(Book book) {
        id++;
        booksLibrary.add(book);
        book.setId(id);
        return id;
    }

    @Override
    public boolean delete(Long bookId) {
        for (int i = 0; i < booksLibrary.size() ; i++) {
            if (booksLibrary.get(i).getId().equals(bookId)) {
                booksLibrary.remove(booksLibrary.get(i));
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (int i = 0; i < booksLibrary.size() ; i++) {
            if (booksLibrary.get(i).equals(book)) {
                booksLibrary.remove(booksLibrary.get(i));
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId){
        for (Book book : booksLibrary) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> booksFound = new ArrayList<>();

        for (Book book : booksLibrary) {
            if (book.getAuthor().equals(author)) {
                booksFound.add(book);
            }
        }
        return booksFound;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> booksFound = new ArrayList<>();

        for (Book book : booksLibrary) {
            if (book.getTitle().equals(title)) {
                booksFound.add(book);
            }
        }
        return booksFound;
    }

    @Override
    public int countAllBooks() {
        return booksLibrary.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        for (int i = booksLibrary.size() - 1; i >= 0; i--) {

            if (booksLibrary.get(i).getAuthor().equals(author)) {
                booksLibrary.remove(booksLibrary.get(i));
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        for (int i = booksLibrary.size() - 1; i >= 0; i--) {

            if (booksLibrary.get(i).getTitle().equals(title)) {
                booksLibrary.remove(booksLibrary.get(i));
            }
        }
    }

    public List<Book> getBooksLibrary() {
        return booksLibrary;
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> booksFound = new ArrayList<>();

        for (Book book : booksLibrary) {
            if (searchCriteria.match(book)) {
                booksFound.add(book);
            }
        }
        return booksFound;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> authorsFound = new HashSet<>();

        for (Book book : booksLibrary) {
            authorsFound.add(book.getAuthor());
        }
        return authorsFound;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> titlesFound = new HashSet<>();

        for (Book book : booksLibrary) {
            titlesFound.add(book.getTitle());
        }
        return titlesFound;
    }

    @Override
    public Set<Book> findUniqueBooks() { // objekt ili title
        return new HashSet<>(booksLibrary);
    }

    public boolean contains(Book book) {
        for (Book value : booksLibrary) {
            if (value.equals(book)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> authorToBooksMap = new HashMap<>();
        Set<String> authorsFound = findUniqueAuthors();

        for (String author : authorsFound) {
            authorToBooksMap.put(author, findByAuthor(author));
        }
        return authorToBooksMap;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> authorBooksCountMap = new HashMap<>();
        Set<String> authorsFound = findUniqueAuthors();

        for (String author : authorsFound) {
            authorBooksCountMap.put(author, findByAuthor(author).size());
        }
        return authorBooksCountMap;
    }

}


