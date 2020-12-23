package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library;

// Task 6, 7, 8, 9, 10, 11, 12, 13, 14 (level 2);
// Task 22 (level 3);
// Task 23 - 26 (level 4);

import main.java.javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.search_criteria.*;

import java.util.*;

class BookDatabaseImplTest {

    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.deleteByIDTest();
        test.deleteObjectTest();
        test.deleteBooleanReturnTests();
        test.findByIdTest();
        test.findByIdNullPointExceptionTest();
        test.findByAuthorTest();
        test.findByTitleTest();
        test.countAllBooksTest();
        test.deleteByAuthorTest();
        test.deleteByTitleTest();
        test.findTests();
        test.findUniqueAuthorsTest();
        test.findUniqueTitlesTest();
        test.findUniqueBooksTest();
        test.containsBookTest();
        test.getAuthorToBooksMapTest();
        test.getEachAuthorBookCountTest();
    }

    void deleteByIDTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Author", "Title");
        Book book2 = new Book("Author 2", "Title 2");

        bookDatabase.save(book);
        bookDatabase.save(book2);

        bookDatabase.delete(2L);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book);
        checkResults(bookDatabase.getBooksLibrary().containsAll(expectedResult), "Delete book by ID test");
    }

    void deleteObjectTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Author", "Title");
        Book book2 = new Book("Author 2", "Title 2");

        bookDatabase.save(book);
        bookDatabase.save(book2);

        bookDatabase.delete(book2);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book);

        checkResults(bookDatabase.getBooksLibrary().containsAll(expectedResult), "Delete book (object) test");
    }

    void deleteBooleanReturnTests() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Author", "Title");
        Book book2 = new Book("Author 2", "Title 2");

        bookDatabase.save(book);
        bookDatabase.save(book2);

        checkResults(bookDatabase.delete(2L), "Delete book by ID test (boolean return)");
        checkResults(bookDatabase.delete(book), "Delete object book test(boolean return)");
    }

    void findByIdTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Author", "Title");
        Book book2 = new Book("Author 2", "Title 2");

        bookDatabase.save(book);
        bookDatabase.save(book2);
        checkResults(bookDatabase.findById(1L).get().equals(book), "Find by ID test");
    }

    void findByIdNullPointExceptionTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Author", "Title");
        Book book2 = new Book("Author 2", "Title 2");

        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.findById(3L);
        System.out.println("Null pointer exception test = OK");
    }

    void findByAuthorTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Author", "Title");
        Book book2 = new Book("Author 2", "Title 2");
        Book book3 = new Book("Author", "Title 3");
        Book book4 = new Book("Author 4", "Title");

        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book);
        expectedResult.add(book3);

        checkResults(bookDatabase.findByAuthor("Author").containsAll(expectedResult), "Find by author test");
    }

    void findByTitleTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Author", "Title");
        Book book2 = new Book("Author 2", "Title 2");
        Book book3 = new Book("Author", "Title 3");
        Book book4 = new Book("Author 4", "Title");

        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book);
        expectedResult.add(book4);

        checkResults(bookDatabase.findByTitle("Title").containsAll(expectedResult), "Find by title test");
    }

    void countAllBooksTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Author", "Title");
        Book book2 = new Book("Author 2", "Title 2");
        Book book3 = new Book("Author", "Title 3");
        Book book4 = new Book("Author 4", "Title");

        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        checkResults(bookDatabase.countAllBooks() == 4, "Count all books test");
    }

    void deleteByAuthorTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Author", "Title");
        Book book2 = new Book("Author 2", "Title 2");
        Book book3 = new Book("Author", "Title 3");
        Book book4 = new Book("Author 4", "Title");

        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.deleteByAuthor("Author");

        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book2);
        expectedResult.add(book4);

        checkResults((bookDatabase.getBooksLibrary().containsAll(expectedResult)), "Delete by author test");
    }

    void deleteByTitleTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Author", "Title");
        Book book2 = new Book("Author 2", "Title 2");
        Book book3 = new Book("Author", "Title 3");
        Book book4 = new Book("Author 4", "Title");

        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.deleteByTitle("Title");

        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book2);
        expectedResult.add(book3);

        checkResults((bookDatabase.getBooksLibrary().containsAll(expectedResult)), "Delete by title test");
    }

    void findTests() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Author", "Title");
        Book book2 = new Book("Author 2", "Title 2");
        Book book3 = new Book("Author", "Title 3");
        Book book4 = new Book("Author 4", "Title");

        bookDatabase.save(book);
        book.yearOfIssue = "1998";
        bookDatabase.save(book2);
        book2.yearOfIssue = "100";
        bookDatabase.save(book3);
        book3.yearOfIssue = "1800";
        bookDatabase.save(book4);
        book4.yearOfIssue = "1998";

        List<Book> expectedResultAuthorSearchCriteria = new ArrayList<>();
        expectedResultAuthorSearchCriteria.add(book);
        expectedResultAuthorSearchCriteria.add(book3);

        checkResults(bookDatabase.find(new AuthorSearchCriteria("Author")).containsAll(expectedResultAuthorSearchCriteria), "Find test (author search criteria)");

        List<Book> expectedResultTitleSearchCriteria = new ArrayList<>();
        expectedResultTitleSearchCriteria.add(book);
        expectedResultTitleSearchCriteria.add(book4);

        checkResults(bookDatabase.find(new TitleSearchCriteria("Title")).containsAll(expectedResultTitleSearchCriteria), "Find test (title search criteria)");

        List<Book> expectedResultYearOfIssueSearchCriteria = new ArrayList<>();
        expectedResultYearOfIssueSearchCriteria.add(book);
        expectedResultYearOfIssueSearchCriteria.add(book4);

        checkResults(bookDatabase.find(new YearOfIssueSearchCriteria("1998")).containsAll(expectedResultYearOfIssueSearchCriteria), "Find test (year search criteria)");

        List<Book> expectedResultAndSearchCriteria = new ArrayList<>();
        expectedResultAndSearchCriteria.add(book);

        checkResults(bookDatabase.find(new AndSearchCriteria(new TitleSearchCriteria("Title"), new AuthorSearchCriteria("Author"))).containsAll(expectedResultAndSearchCriteria), "Find test (and search criteria)");

        List<Book> expectedResultOrSearchCriteria = new ArrayList<>();
        expectedResultOrSearchCriteria.add(book);
        expectedResultOrSearchCriteria.add(book3);
        expectedResultOrSearchCriteria.add(book4);

        checkResults(bookDatabase.find(new OrSearchCriteria(new TitleSearchCriteria("Title"), new AuthorSearchCriteria("Author"))).containsAll(expectedResultOrSearchCriteria), "Find test (or search criteria)");
    }

    void findUniqueAuthorsTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Author", "Title");
        Book book2 = new Book("Author 2", "Title 2");
        Book book3 = new Book("Author", "Title 3");
        Book book4 = new Book("Author 4", "Title");

        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("Author");
        expectedResult.add("Author 2");
        expectedResult.add("Author 4");

        checkResults(bookDatabase.findUniqueAuthors().containsAll(expectedResult), "Find unique authors test");
    }

    void findUniqueTitlesTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Author", "Title");
        Book book2 = new Book("Author 2", "Title 2");
        Book book3 = new Book("Author", "Title 3");
        Book book4 = new Book("Author 4", "Title");

        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("Title 3");
        expectedResult.add("Title 2");
        expectedResult.add("Title");

        checkResults((bookDatabase.findUniqueTitles().containsAll(expectedResult)), "Find unique titles test");
    }

    void findUniqueBooksTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Author", "Title");
        Book book2 = new Book("Author 2", "Title 2");
        Book book3 = new Book("Author", "Title 3");
        Book book4 = new Book("Author 4", "Title");

        bookDatabase.save(new Book("Author", "Title"));
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(book);
        expectedResult.add(new Book("Author 2", "Title 2"));
        expectedResult.add(book3);
        expectedResult.add(book4);

        checkResults(bookDatabase.findUniqueBooks().containsAll(expectedResult), "Find unique books (object) test");
    }

    void containsBookTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Author", "Title");
        Book book2 = new Book("Author 2", "Title 2");
        Book book3 = new Book("Author", "Title 3");
        Book book4 = new Book("Author 4", "Title");

        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        checkResults(bookDatabase.contains(book), "Contains book test");
    }

    void getAuthorToBooksMapTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Author", "Title");
        Book book2 = new Book("Author 2", "Title 2");
        Book book3 = new Book("Author", "Title 3");
        Book book4 = new Book("Author 4", "Title");

        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        Map<String, List<Book>> expectedResult = new HashMap<>();
        List<Book> authorBooks = new ArrayList<>();
        authorBooks.add(book);
        authorBooks.add(book3);
        expectedResult.put("Author", authorBooks);

        List<Book> author2Books = new ArrayList<>();
        author2Books.add(book2);
        expectedResult.put("Author 2", author2Books);

        List<Book> author3Books = new ArrayList<>();
        author3Books.add(book4);
        expectedResult.put("Author 4", author3Books);

        checkResults(bookDatabase.getAuthorToBooksMap().equals(expectedResult), "Author to books map test");

    }

    void getEachAuthorBookCountTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Author", "Title");
        Book book2 = new Book("Author 2", "Title 2");
        Book book3 = new Book("Author", "Title 3");
        Book book4 = new Book("Author 4", "Title");

        bookDatabase.save(book);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("Author", 2);
        expectedResult.put("Author 2", 1);
        expectedResult.put("Author 4", 1);

        checkResults(bookDatabase.getEachAuthorBookCount().equals(expectedResult), "Author to books map test");

    }

    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
