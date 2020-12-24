package main.java.javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5;
//task23
//task24
//task25
//task26
//task28
//task29

import java.util.*;


public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest bookDatabaseImplTest = new BookDatabaseImplTest();

        bookDatabaseImplTest.shouldSaveBook();
        bookDatabaseImplTest.shouldDeleteBookById();
        bookDatabaseImplTest.shouldDeleteBook();
        bookDatabaseImplTest.shouldFindById();
        bookDatabaseImplTest.shouldFindByAuthor();
        bookDatabaseImplTest.shouldFindByTitle();
        bookDatabaseImplTest.shouldCountAllBooks();
        bookDatabaseImplTest.shouldRemoveByAuthor();
        bookDatabaseImplTest.shouldRemoveByTitle();
        bookDatabaseImplTest.shouldFindByCriteria();
        bookDatabaseImplTest.shouldFindUniqueAuthors();
        bookDatabaseImplTest.shouldFindUniqueTitles();
        bookDatabaseImplTest.shouldFindUniqueBooks();
        bookDatabaseImplTest.shouldContainBook();
        bookDatabaseImplTest.shouldReturnSetOfAuthors();
        bookDatabaseImplTest.shouldCountAuthors();
    }

    Book book1 = new Book("Leo Tolstoy", "War and Peace", "1867");
    Book book2 = new Book("Aleksandr Pushkin", "Evgeniy Onegin", "1833" );
    Book book3 = new Book("Author", "Some title", "2020");
    Book book4 = new Book("Aleksandr Pushkin", "Pikovaya dama", "1834");
    Book book5 = new Book("Some Author", "War and Peace", "2019" );
    Book book6 = new Book("Some Author","Title", "2020");
    Book book7 = new Book("Author", "Some title", "2020");

    void shouldSaveBook() {
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());

        Long actualResult = victim.save(book1);
        Long expectedResult = 1L;
        check(expectedResult, actualResult, "Save the book to the list");

    }

    void shouldDeleteBookById() {
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);

        boolean actualResult = victim.delete(2L);
        check(true, actualResult, "Delete book by Id from database");
    }

    void shouldDeleteBook() {
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);

        boolean actualResult = victim.delete(book1);
        check(true, actualResult, "Delete book from database");
    }

    void shouldFindById() {
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        if (victim.findById(2L).get().equals(book2)) {
            System.out.println("Find book by ID in the list has passed!");
        } else System.out.println("Find book by ID in the list has failed!");
    }

    void shouldFindByAuthor() {
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book2);
        victim.save(book4);
        victim.save(book1);

        List<Book> testList = victim.findByAuthor("Aleksandr Pushkin");

        List<Book> expectedList = new ArrayList<>();
        expectedList.add(book4);
        expectedList.add(book2);
        boolean actualResult = checkCollectionEquals(testList, expectedList);
        check(true, actualResult, "Find book by author");
    }

    void shouldFindByTitle(){
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book5);
        victim.save(book2);

        List<Book> testList = victim.findByTitle("War and Peace");

        List<Book> expectedList = new ArrayList<>();
        expectedList.add(book5);
        expectedList.add(book1);
        boolean actualResult = checkCollectionEquals(testList, expectedList);
        check(true, actualResult, "Find book by title");
    }

    void shouldCountAllBooks(){
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book5);
        victim.save(book2);
        victim.save(book6);

        int expectedResult = victim.countAllBooks();
        int actualResult = 4;
        check(actualResult, expectedResult, "Count all books");
    }

    void shouldRemoveByAuthor(){
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book2);
        victim.save(book4);
        victim.save(book1);

        victim.deleteByAuthor("Aleksandr Pushkin");

        List<Book> expectedList = new ArrayList<>();
        expectedList.add(book1);
        boolean actualResult = checkCollectionEquals(victim.bookDatabase, expectedList);
        check(true, actualResult, "Remove book by author");
    }

    void shouldRemoveByTitle(){
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book2);
        victim.save(book4);
        victim.save(book1);
        victim.save(book5);

        victim.deleteByTitle("War and Peace");

        List<Book> expectedList = new ArrayList<>();
        expectedList.add(book2);
        expectedList.add(book4);
        boolean actualResult = checkCollectionEquals(victim.bookDatabase, expectedList);
        check(true, actualResult, "Remove book by title");
    }

    void shouldFindByCriteria(){
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book2);
        victim.save(book4);
        victim.save(book1);
        victim.save(book5);
        victim.save(book3);
        victim.save(book6);
        SearchCriteria searchCriteria = new YearOfIssueSearchCriteria("2020");
        victim.find(searchCriteria);

        List<Book> expectedList = new ArrayList<>();
        expectedList.add(book3);
        expectedList.add(book6);
        boolean actualResult = checkCollectionEquals(victim.bookDatabase, expectedList);
        check(true, actualResult, "Find book by criteria");
    }

    void shouldFindUniqueAuthors(){
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book2);
        victim.save(book4);
        victim.save(book1);
        victim.save(book5);
        victim.save(book3);
        victim.save(book6);
        Set<String> actualResult = victim.findUniqueAuthors();
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("Leo Tolstoy");
        expectedResult.add("Aleksandr Pushkin");
        expectedResult.add("Author");
        expectedResult.add("Some Author");
        check(expectedResult, actualResult, "Find unique author");

    }

    void shouldFindUniqueTitles(){
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book4);
        victim.save(book1);
        victim.save(book5);
        Set<String> actualResult = victim.findUniqueTitles();
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("War and Peace");
        expectedResult.add("Pikovaya dama");
        check(expectedResult, actualResult, "Find unique author");
    }

    void shouldFindUniqueBooks(){
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book3);
        victim.save(book7);
        victim.save(book1);
        Set<Book> actualResult = victim.findUniqueBooks();
        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(book3);
        expectedResult.add(book1);
        check(expectedResult, actualResult, "Find unique books");
    }

    void shouldContainBook(){
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book2);
        victim.save(book4);
        victim.save(book1);
        victim.save(book5);
        victim.save(book3);
        victim.save(book6);

        boolean actualResult = victim.contains(book4);
        check(true, actualResult, "Contain book in the list");
    }


    void shouldReturnSetOfAuthors(){
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book2);
        victim.save(book4);
        victim.save(book5);
        victim.save(book6);

        Map<String, List<Book>> actualResult;
        actualResult = victim.getAuthorToBooksMap();
        Map<String, List<Book>> expectedResult = new HashMap<>();
        List<Book> aleksandrPushkinList = new LinkedList<>();
        List<Book> someAuthorList = new LinkedList<>();
        aleksandrPushkinList.add(book2);
        aleksandrPushkinList.add(book4);
        someAuthorList.add(book5);
        someAuthorList.add(book6);
        expectedResult.put("Aleksandr Pushkin", aleksandrPushkinList);
        expectedResult.put("Some Author", someAuthorList);
        boolean testResult = expectedResult.equals(actualResult);
        check(true, testResult, "Test for sets of authors");
    }

    void shouldCountAuthors(){
        BookDatabaseImpl victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book2);
        victim.save(book4);
        victim.save(book5);
        victim.save(book6);

        Map<String, Integer> actualResult;
        actualResult = victim.getEachAuthorBookCount();
        Map<String, Integer> expectedResult = new HashMap<>();
        List<Book> aleksandrPushkinList = new LinkedList<>();
        List<Book> someAuthorList = new LinkedList<>();
        aleksandrPushkinList.add(book2);
        aleksandrPushkinList.add(book4);
        someAuthorList.add(book5);
        someAuthorList.add(book6);
        expectedResult.put("Aleksandr Pushkin", aleksandrPushkinList.size());
        expectedResult.put("Some Author", someAuthorList.size());
        boolean testResult = expectedResult.equals(actualResult);
        check(true, testResult, "Test for authors count");

    }

    public void check(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    public void check(Long expectedResult, Long actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    public void check(Set expectedResult,  Set actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    public boolean checkCollectionEquals(List colOne, List colTwo) {
        return colOne.containsAll(colTwo);
    }

    public void check(int actualResult, int expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

//    public void check(Set<String> expectedResult, Set<String> actualResult, String testName) {
//        if(expectedResult.containsAll(actualResult)) {
//            System.out.println(testName + " has passed!");
//        } else {
//            System.out.println(testName + " failed!");
//            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
//        }
//    }

    public void checkUniqueBooks(Set<Book> expectedResult, Set<Book> actualResult, String testName) {
        if(expectedResult.containsAll(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}