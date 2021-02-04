package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

import javaguru.sunday.teacher.annotations.CodeReview;

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

@CodeReview(approved = true)
class BookDatabaseImplTest {
    public static void main(String[] args) {

        BookDatabaseImplTest bookDatabaseImplTest = new BookDatabaseImplTest();
        bookDatabaseImplTest.deleteTest();
        bookDatabaseImplTest.deleteTestTwo();
        bookDatabaseImplTest.findByIdTest();
        bookDatabaseImplTest.findByIdFailTest();
        bookDatabaseImplTest.findByAuthorTest();
        bookDatabaseImplTest.findByTitleTest();
        bookDatabaseImplTest.countAllBooksTest();
        bookDatabaseImplTest.deleteByAuthorTest();
        bookDatabaseImplTest.deleteByTitleTest();
        bookDatabaseImplTest.searchCriteriaTest();
        bookDatabaseImplTest.findUniqueAuthorsTest();
        bookDatabaseImplTest.findUniqueTitleTest();
        bookDatabaseImplTest.findUniqueBooksTest();
        bookDatabaseImplTest.containsTest();
        bookDatabaseImplTest.getAuthorToBooksMapTest();
        bookDatabaseImplTest.getEachAuthorBookCountTest();
    }

    public void deleteTest(){
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(new Book("Author1", "Title1"));
        check(test.delete(new Book("Author1", "Title1")), "deleteTest");
    }

    public void deleteTestTwo() {
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(new Book("Author1", "Title1"));
        check(test.delete(test.id = 1), "deleteTestTwo");
    }

    public void findByIdTest() {
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(new Book("Author1", "Title1"));
        check(Optional.of(new Book("Author1", "Title1")), test.findById(test.id = 1), "findByIdTest");
    }

    public void findByIdFailTest() {
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(new Book("Author2", "Title1"));
        check(Optional.empty(), test.findById(test.id = 2), "findByIdFailTest");
    }

    public void findByAuthorTest() {
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(new Book("Johan Rolling", "Harry Potter"));
        test.save(new Book("Pushkin", "Ruslan i Ljudmila"));
        test.save(new Book("Pushkin", "Evgenij Onegin"));
        test.save(new Book("Pushkin", "Pikovaja Dama"));
        List<Book> expectedList = new LinkedList<>();
        expectedList.add(new Book("Pushkin", "Ruslan i Ljudmila"));
        expectedList.add(new Book("Pushkin", "Evgenij Onegin"));
        expectedList.add(new Book("Pushkin", "Pikovaja Dama"));
        check(expectedList, test.findByAuthor("Pushkin"), "findByAuthorTest");
    }

    public void findByTitleTest() {
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(new Book("Johan Rolling", "Harry Potter"));
        test.save(new Book("Somebody", "Harry Potter"));
        test.save(new Book("Pushkin", "Ruslan i Ljudmila"));
        test.save(new Book("Pushkin", "Evgenij Onegin"));
        test.save(new Book("Pushkin", "Pikovaja Dama"));
        List<Book> expectedList = new LinkedList<>();
        expectedList.add(new Book("Johan Rolling", "Harry Potter"));
        expectedList.add(new Book("Somebody", "Harry Potter"));
        check(expectedList, test.findByTitle("Harry Potter"), "findByTitleTest");
    }

    public void countAllBooksTest() {
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(new Book("Johan Rolling", "Harry Potter"));
        test.save(new Book("Somebody", "Harry Potter"));
        test.save(new Book("Pushkin", "Ruslan i Ljudmila"));
        test.save(new Book("Pushkin", "Evgenij Onegin"));
        test.save(new Book("Pushkin", "Pikovaja Dama"));
        check(test.countAllBooks(), 5, "countAllBooksTest");
    }

    public void deleteByAuthorTest(){
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(new Book("Johan Rolling", "Harry Potter"));
        test.save(new Book("Somebody", "Harry Potter"));
        test.save(new Book("Pushkin", "Ruslan i Ljudmila"));
        test.save(new Book("Pushkin", "Evgenij Onegin"));
        test.save(new Book("Pushkin", "Pikovaja Dama"));
        test.deleteByAuthor("Pushkin");
        List<Book> expectedList = new LinkedList<>();
        expectedList.add(new Book("Johan Rolling", "Harry Potter"));
        expectedList.add(new Book("Somebody", "Harry Potter"));
        check(expectedList, test.books, "deleteByAuthorTest");
    }

    public void deleteByTitleTest(){
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(new Book("Johan Rolling", "Harry Potter"));
        test.save(new Book("Somebody", "Harry Potter"));
        test.save(new Book("Pushkin", "Ruslan i Ljudmila"));
        test.save(new Book("Pushkin", "Evgenij Onegin"));
        test.save(new Book("Pushkin", "Pikovaja Dama"));
        test.deleteByTitle("Harry Potter");
        List<Book> expectedList = new LinkedList<>();
        expectedList.add(new Book("Pushkin", "Ruslan i Ljudmila"));
        expectedList.add(new Book("Pushkin", "Evgenij Onegin"));
        expectedList.add(new Book("Pushkin", "Pikovaja Dama"));
        check(expectedList, test.books, "deleteByTitleTest");
    }

    public void searchCriteriaTest(){
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(new Book("Johan Rolling", "Harry Potter"));
        test.save(new Book("Pushkin", "Ruslan i Ljudmila"));
        test.save(new Book("Pushkin", "Evgenij Onegin"));
        test.save(new Book("Pushkin", "Pikovaja Dama"));
        List<Book> expectedList = new LinkedList<>();
        expectedList.add(new Book("Pushkin", "Ruslan i Ljudmila"));
        expectedList.add(new Book("Pushkin", "Evgenij Onegin"));
        expectedList.add(new Book("Pushkin", "Pikovaja Dama"));
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Pushkin");
        check(expectedList, test.find(authorSearchCriteria) , "searchCriteriaTest");
    }

    public void findUniqueAuthorsTest() {
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(new Book("Johan Rolling", "Harry Potter"));
        test.save(new Book("Pushkin", "Ruslan i Ljudmila"));
        test.save(new Book("Pushkin", "Evgenij Onegin"));
        test.save(new Book("Pushkin", "Pikovaja Dama"));
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("Johan Rolling");
        expectedResult.add("Pushkin");
        check(expectedResult, test.findUniqueAuthors(), "findUniqueAuthorsTest");
    }

    public void findUniqueTitleTest() {
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(new Book("Johan Rolling", "Harry Potter"));
        test.save(new Book("Pushkin", "Ruslan i Ljudmila"));
        test.save(new Book("Pushkin", "Ruslan i Ljudmila"));
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("Harry Potter");
        expectedResult.add("Ruslan i Ljudmila");
        check(expectedResult, test.findUniqueTitles(), "findUniqueTitleTest");
    }

    public void findUniqueBooksTest() {
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(new Book("Johan Rolling", "Harry Potter"));
        test.save(new Book("Pushkin", "Ruslan i Ljudmila"));
        test.save(new Book("Pushkin", "Ruslan i Ljudmila"));
        HashSet<Book> expectedResult = new HashSet<>();
        expectedResult.add(new Book("Johan Rolling", "Harry Potter"));
        expectedResult.add(new Book("Pushkin", "Ruslan i Ljudmila"));
        checkTwo(expectedResult, test.findUniqueBooks(), "findUniqueBooksTest");
    }

    public void containsTest(){
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(new Book("Johan Rolling", "Harry Potter"));
        test.save(new Book("Pushkin", "Ruslan i Ljudmila"));
        test.save(new Book("Pushkin", "Evgenij Onegin"));
        test.save(new Book("Pushkin", "Pikovaja Dama"));
        check(test.contains(new Book("Pushkin", "Ruslan i Ljudmila")), "containsTest");
    }

    public void getAuthorToBooksMapTest() {
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(new Book("Johan Rolling", "Harry Potter"));
        test.save(new Book("Pushkin", "Ruslan i Ljudmila"));
        test.save(new Book("Pushkin", "Evgenij Onegin"));
        test.save(new Book("Pushkin", "Pikovaja Dama"));
        Map<String, List<Book>> actualMap;
        actualMap = test.getAuthorToBooksMap();
        Map<String, List<Book>> expectedMap = new HashMap<>();
        List<Book> johanRollingBookList = new LinkedList<>();
        List<Book> pushkinBookList = new LinkedList<>();
        johanRollingBookList.add(new Book("Johan Rolling", "Harry Potter"));
        pushkinBookList.add(new Book("Pushkin", "Ruslan i Ljudmila"));
        pushkinBookList.add(new Book("Pushkin", "Evgenij Onegin"));
        pushkinBookList.add(new Book("Pushkin", "Pikovaja Dama"));
        expectedMap.put("Johan Rolling", johanRollingBookList);
        expectedMap.put("Pushkin", pushkinBookList);
        check(equalMaps(expectedMap, actualMap), "getAuthorToBooksMapTest");
    }

    public void getEachAuthorBookCountTest() {
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(new Book("Johan Rolling", "Harry Potter"));
        test.save(new Book("Pushkin", "Ruslan i Ljudmila"));
        test.save(new Book("Pushkin", "Evgenij Onegin"));
        test.save(new Book("Pushkin", "Pikovaja Dama"));
        Map<String, Integer> actualMap;
        actualMap = test.getEachAuthorBookCount();
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("Johan Rolling", 1);
        expectedMap.put("Pushkin", 3);
        check(equalMapsTwo(expectedMap, actualMap), "getEachAuthorBookCountTest");
    }

    boolean equalMaps(Map<String, List<Book>> expectedMap, Map<String, List<Book>> actualMap) {
        if (expectedMap.size() != actualMap.size())
            return false;
        for (String key: expectedMap.keySet())
            if (!expectedMap.get(key).equals(actualMap.get(key)))
                return false;
        return true;
    }

    boolean equalMapsTwo(Map<String, Integer> expectedMap, Map<String, Integer> actualMap) {
        if (expectedMap.size() != actualMap.size())
            return false;
        for (String key: expectedMap.keySet())
            if (!expectedMap.get(key).equals(actualMap.get(key)))
                return false;
        return true;
    }



    public void checkTwo(Set<Book> expectedResult, Set<Book> actualResult, String testName) {
        if(expectedResult.containsAll(actualResult)) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void check(Set<String> expectedResult, Set<String> actualResult, String testName) {
        if(expectedResult.containsAll(actualResult)) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void check(int actualResult, int expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void check(List<Book> expectedList, List<Book> actualList, String testName) {
        if(actualList.containsAll(expectedList)) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void check(Optional<Book> expectedResult, Optional<Book> actualResult, String testName) {
        if(expectedResult.equals(actualResult)) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void check(boolean condition, String testName) {
        if(condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
