package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

// lesson_11 task_6
// lesson_11 task_7
// lesson_11 task_8
// lesson_11 task_9
// lesson_11 task_10
// lesson_11 task_11
// lesson_11 task_12
// lesson_11 task_13
// lesson_11 task_14
// lesson_11 task_15
// lesson_11 task_16
// lesson_11 task_17
// lesson_11 task_18
// lesson_11 task_19
// lesson_11 task_20
// lesson_11 task_21
// lesson_11 task_22
// lesson_11 task_23
// lesson_11 task_24
// lesson_11 task_25
// lesson_11 task_26
// lesson_11 task_27
// lesson_11 task_28
// lesson_11 task_29
// lesson_11 task_30
// lesson_11 task_31
// lesson_11 task_32
// lesson_11 task_33
// lesson_11 task_34
// lesson_11 task_35
// lesson_11 task_36
// lesson_11 task_37
// lesson_11 task_38

import java.util.*;

class BookDatabaseImpl implements BookDatabase {
    long counter = 1;
    List<Book> bookDatabase;

    public BookDatabaseImpl(List<Book> bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public Long save(Book book) {
        book.setId(counter);
        counter++;
        bookDatabase.add(book);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book bookBase : bookDatabase) {
            if (bookBase.getId().equals(bookId)) {
                bookDatabase.remove(bookBase);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (Book bookBase : bookDatabase) {
            if (bookBase.equals(book)) {
                bookDatabase.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : bookDatabase) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> bookListToReturn = new ArrayList<>();
        for (Book findBookByAuthor : bookDatabase) {
            if (findBookByAuthor.getAuthor().equals(author)) {
                bookListToReturn.add(findBookByAuthor);
            }
        }
        return bookListToReturn;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> bookListToReturn = new ArrayList<>();
        for (Book findBookByTitle : bookDatabase) {
            if (findBookByTitle.getTitle().equals(title)) {
                bookListToReturn.add(findBookByTitle);
            }
        }
        return bookListToReturn;
    }

    @Override
    public int countAllBooks() {
        return bookDatabase.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        bookDatabase.removeIf(deleteBookByAuthor -> deleteBookByAuthor.getAuthor().equals(author));
    }

    @Override
    public void deleteByTitle(String title) {
        bookDatabase.removeIf(deleteBookByTitle -> deleteBookByTitle.getAuthor().equals(title));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> bookListToReturn = new ArrayList<>();
        for (Book book : bookDatabase) {
            if (searchCriteria.match(book)) {
                bookListToReturn.add(book);
            }
        }
        return bookListToReturn;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> listOfAuthors = new HashSet<>();
        for (Book findUniqueAuthors : bookDatabase) {
            listOfAuthors.add(findUniqueAuthors.getAuthor());
        }
        return listOfAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> listOfTitles = new HashSet<>();
        for (Book findUniqueTitles : bookDatabase) {
            listOfTitles.add(findUniqueTitles.getTitle());
        }
        return listOfTitles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(bookDatabase);
    }

    @Override
    public boolean contains(Book book) {
        for (Book containsBook : bookDatabase) {
            if(containsBook.equals(book)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> authorToBooksMap = new HashMap<>();
        Set<String> authorsList = findUniqueAuthors();
        for (String author : authorsList) {
            authorToBooksMap.put(author, findByAuthor(author));
        }
        return authorToBooksMap;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> eachAuthorBookCount = new HashMap<>();
        Set<String> authorsList = findUniqueAuthors();
        for (String author : authorsList) {
            eachAuthorBookCount.put(author, findByAuthor(author).size());
        }
        return eachAuthorBookCount;
    }
}
