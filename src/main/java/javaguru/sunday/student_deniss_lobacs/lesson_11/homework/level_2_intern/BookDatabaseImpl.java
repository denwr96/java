package javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern;

// task 6-14, task 22-26 , task 28-29

import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_3_junior.SearchCriteria;

import java.util.*;

public class BookDatabaseImpl implements BookDatabase {

    private List<Book> booksStorage;

    public BookDatabaseImpl(List<Book> booksStorage) {
        this.booksStorage = booksStorage;
    }

    public BookDatabaseImpl() {
    }

    @Override
    public Long save(Book book) {
        long id = 1;
        if (booksStorage.size() != 0) {
            Book lastBook = booksStorage.get(booksStorage.size() - 1);//
            id = lastBook.getId() + 1;
        }
        book.setId(id);
        booksStorage.add(book);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book books : booksStorage) {
            if (books.getId().equals(bookId)) {
                booksStorage.remove(books);
                return true;
            }
        }
        return false;
    }

    public boolean delete(Book book) {
        if (booksStorage.contains(book)) {
            this.booksStorage.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        Book resultBook = null;
        for (Book books : booksStorage) {
            if (books.getId().equals(bookId)) {
                resultBook = books;
            }
        }
        return Optional.ofNullable(resultBook);
    }


    @Override
    public List<Book> findByAuthor(String author) {
        ArrayList<Book> searchMatches = new ArrayList<>();
        for (Book books : booksStorage) {
            if (author.equals(books.getAuthor()))
                searchMatches.add(books);
        }
        return searchMatches;
    }

    @Override
    public List<Book> findByTitle(String title) {
        ArrayList<Book> searchMatches = new ArrayList<>();
        for (Book books : booksStorage) {
            if (title.equals(books.getTitle()))
                searchMatches.add(books);
        }
        return searchMatches;
    }

    @Override
    public int countAllBooks() { // +
        return booksStorage.size();
    }

    @Override
    public void deleteByAuthor(String author) { // +
        booksStorage.removeIf(books -> books.getAuthor().equals(author));
    }

    @Override
    public void deleteByTitle(String title) { // +
        booksStorage.removeIf(books -> books.getTitle().equals(title));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        ArrayList<Book> searchMatches = new ArrayList<>();
        for (Book books : booksStorage) {
            if (searchCriteria.match(books))
                searchMatches.add(books);
        }
        return searchMatches;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> uniqueAuthors = new HashSet<>();
        for (Book books : booksStorage) {
            uniqueAuthors.add(books.getAuthor());
        }
        return uniqueAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> uniqueTitles = new HashSet<>();
        for (Book books : booksStorage) {
            uniqueTitles.add(books.getTitle());
        }
        return uniqueTitles;
    }

    @Override
    public Set<Book> findUniqueBooks() { // +
        return new HashSet<>(booksStorage);
    }

    @Override
    public boolean contains(Book book) {
        return booksStorage.contains(book);

    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> getAuthorToBooksMap = new HashMap<>();
        Set<String> authorList = findUniqueAuthors();
        for (String author : authorList) {
            getAuthorToBooksMap.put(author, findByAuthor(author));
        }
        return getAuthorToBooksMap;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> eachAuthorBookCount = new HashMap<>();
        Set<String> authorList = findUniqueAuthors();
        for (String author : authorList) {
            eachAuthorBookCount.put(author, findByAuthor(author).size());
        }
        return eachAuthorBookCount;
    }

}