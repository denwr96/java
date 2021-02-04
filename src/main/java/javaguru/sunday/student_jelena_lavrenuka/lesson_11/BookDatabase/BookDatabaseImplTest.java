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


import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.*;

@CodeReview(approved = true)
class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.saveTest();
        test.deleteByIDTest1();
        test.deleteByIDTest2();
        test.deleteBookTest1();
        test.deleteBookTest2();
        test.findByIdTest();
        test.findByAuthorTest();
        test.findByTitleTest();
        test.countAllBooksTest();
        test.deleteByAuthorTest();
        test.findTest1();
        test.findTest2();
        test.findUniqueAuthorsTest();
        test.findUniqueTitlesTest();
        test.findUniqueBooksTest();
        test.containsTest1();
        test.containsTest2();
        test.authorToBooksMapTest();
        test.eachAuthorBookCountTest();
    }

    Book book1 = new Book("Mark Twain", "The Adventures of Tom Sawyer", "2000");
    Book book2 = new Book("Lewis Carroll", "Alice in Wonderland", "1988");
    Book book3 = new Book("Arthur Conan Doyle", "Sherlock Holmes", "1758");
    Book book4 = new Book("Mark Twain", "The Adventures of Huckleberry Finn", "2011");
    Book book5 = new Book("Mark Twein", "The Adventures of Huckleberry Finn", "2011");
    Book book6 = new Book("Mark Twain", "The Adventures of Huckleberry Finn", "2011");
    Book book7 = new Book("Mark Twain", "The Adventures of Tom Sawyer", "2000");
    Book book8 = new Book("Arthur Conan Doyle", "The Voice of Science", "1450");

    public void saveTest(){
        BookDatabase victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        long expectedResult = 3;
        long actualResult = victim.save(book3);
        testResult(actualResult, expectedResult, "saveTest");
    }

    public void deleteByIDTest1(){
        BookDatabase victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        boolean result = victim.delete(3L);
        testResult(result, "deleteByIDTest1");
    }

    public void deleteByIDTest2(){
        BookDatabase victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        boolean result = !victim.delete(4L);
        testResult(result, "deleteByIDTest2");
    }

    public void deleteBookTest1(){
        BookDatabase victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        boolean result = victim.delete(book1);
        testResult(result, "deleteBookTest1");
    }

    public void deleteBookTest2(){
        BookDatabase victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book2);
        victim.save(book3);
        boolean result = !victim.delete(book1);
        testResult(result, "deleteBookTest2");
    }

    public void findByIdTest(){
        BookDatabase victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        Optional<Book> testBook = victim.findById(4L);
        boolean result = testBook.get().equals(book4);
        testResult(result, "findByIdTest");
    }

    public void findByAuthorTest(){
        BookDatabase victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        List<Book> testList = victim.findByAuthor("Mark Twain");
        int expectedResult = 2;
        int actualResult = testList.size();
        testResult(actualResult, expectedResult, "findByAuthorTest");
    }

    public void findByTitleTest(){
        BookDatabase victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        List<Book> testList = victim.findByTitle("Alice in Wonderland");
        int expectedResult = 1;
        int actualResult = testList.size();
        testResult(actualResult, expectedResult, "findByTitleTest");
    }

    public void countAllBooksTest(){
        BookDatabase victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        int expectedResult = 4;
        int actualResult = victim.countAllBooks();
        testResult(actualResult, expectedResult, "countAllBooksTest");
    }

    public void deleteByAuthorTest(){
        BookDatabase victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        victim.deleteByAuthor("Mark Twain");
        int expectedResult = 2;
        int actualResult = victim.countAllBooks();
        testResult(actualResult, expectedResult, "deleteByAuthorTest");
    }

    public void deleteByTitleTest(){
        BookDatabase victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        victim.deleteByAuthor("Sherlock Holmes");
        int expectedResult = 1;
        int actualResult = victim.countAllBooks();
        testResult(actualResult, expectedResult, "deleteByTitleTest");
    }

    public void findTest1(){
        BookDatabase victim = new BookDatabaseImpl(new ArrayList<>());
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Mark Twain");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("The Adventures of Tom Sawyer");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        List<Book> test = victim.find(searchCriteria);
        int expectedResult = 1;
        int actualResult = test.size();
        testResult(actualResult, expectedResult, "findTest1");
    }

    public void findTest2(){
        BookDatabase victim = new BookDatabaseImpl(new ArrayList<>());
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Mark Twain");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("The Adventures of Tom Sawyer");
        SearchCriteria searchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        List<Book> test = victim.find(searchCriteria);
        int expectedResult = 2;
        int actualResult = test.size();
        testResult(actualResult, expectedResult, "findTest2");
    }

    public void findUniqueAuthorsTest(){
        BookDatabase victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        Set<String> testList = victim.findUniqueAuthors();
        int actualResult = testList.size();
        int expectedResult = 3;
        testResult(expectedResult, actualResult, "findUniqueAuthorsTest");
    }

    public void findUniqueTitlesTest(){
        BookDatabase victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        victim.save(book5);
        Set<String> testList = victim.findUniqueTitles();
        int actualResult = testList.size();
        int expectedResult = 4;
        testResult(expectedResult, actualResult, "findUniqueTitlesTest");
    }

    public void findUniqueBooksTest(){
        BookDatabase victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        victim.save(book6);
        victim.save(book7);
        Set<Book> testList = victim.findUniqueBooks();
        int actualResult = testList.size();
        int expectedResult = 4;
        testResult(expectedResult, actualResult, "findUniqueBooksTest");
    }

    public void containsTest1(){
        BookDatabase victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        testResult(victim.contains(book1), "containsTest1");
    }

    public void containsTest2(){
        BookDatabase victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        testResult(!victim.contains(book5), "containsTest2");
    }

    public void authorToBooksMapTest(){
        BookDatabase victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        victim.save(book8);
        Map<String, List<Book>> actualMap = victim.getAuthorToBooksMap();
        List<Book> markTwainBookList = List.of(book1,book4);
        List<Book> lewisCarrollBookList = List.of(book2);
        List<Book> arthurConanDoyleBookList = List.of(book3,book8);
        Map<String, List<Book>> expectedMap = new HashMap<>();
        expectedMap.put("Mark Twain", markTwainBookList);
        expectedMap.put("Lewis Carroll", lewisCarrollBookList);
        expectedMap.put("Arthur Conan Doyle", arthurConanDoyleBookList);
        if(actualMap.equals(expectedMap)){
            System.out.println("authorToBooksMapTest is OK");
        }else{
            System.out.println("authorToBooksMapTest is failed");
        }
    }

    public void eachAuthorBookCountTest(){
        BookDatabase victim = new BookDatabaseImpl(new ArrayList<>());
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        victim.save(book8);
        Map<String, Integer> actualMap = victim.getEachAuthorBookCount();
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("Mark Twain", 2);
        expectedMap.put("Lewis Carroll", 1);
        expectedMap.put("Arthur Conan Doyle", 2);
        if(actualMap.equals(expectedMap)){
            System.out.println("eachAuthorBookCountTest is OK");
        }else{
            System.out.println("eachAuthorBookCountTest is failed");
        }
    }

    public void testResult(long actualResult, long expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }

    public void testResult(int actualResult, int expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }

    public void testResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }
}
