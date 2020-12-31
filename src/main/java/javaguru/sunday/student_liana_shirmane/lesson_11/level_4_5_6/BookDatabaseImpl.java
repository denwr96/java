package javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5_6;
//task23
//task24
//task25
//task26
//task27
//task28
//task29

import java.util.*;

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
    public void deleteByTitle(String title) {
        bookDatabase.removeIf(findByTitle -> findByTitle.getTitle().equals(title));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        ArrayList<Book> selectedBooks = new ArrayList<>();
        for (Book book : bookDatabase) {
            if (searchCriteria.match(book)) {
                selectedBooks.add(book);
            }

        }
        return selectedBooks;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> findUniqueAuthors = new HashSet<>();
        for (Book book : bookDatabase) {
            findUniqueAuthors.add(book.getAuthor());
        }
        return findUniqueAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> findUniqueTitles = new HashSet<>();
        for (Book book : bookDatabase) {
            findUniqueTitles.add(book.getTitle());
        }
        return findUniqueTitles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(bookDatabase);
    }

    @Override
    public boolean contains(Book book) {
        return bookDatabase.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
            Map<String, List<Book>> authorToBooksMap = new HashMap<>();
            Set<String> uniqueAuthorsSet = findUniqueAuthors();
            for (String author : uniqueAuthorsSet) {
                authorToBooksMap.put(author, findByAuthor(author));
            }
            return authorToBooksMap;
        }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> authorBookCount = new HashMap<>();
        Set<String> findUniqueAuthors = findUniqueAuthors();
        for (String author : findUniqueAuthors){
            authorBookCount.put(author, findByAuthor(author).size());
        }
        return authorBookCount;
    }


    public void printBookList() {
        for (Book book : bookDatabase) {
            System.out.println(book.toString());
        }
    }

}

