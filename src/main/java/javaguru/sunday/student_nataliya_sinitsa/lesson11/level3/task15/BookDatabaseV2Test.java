package javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.*;
@CodeReview(approved = true)
public class BookDatabaseV2Test {

    public static void main(String[] args) {

        BookDatabaseV2Test test = new BookDatabaseV2Test();

        test.shouldGetSetOfUniqueAuthors();
        test.shouldGetSetOfUniqueTitles();
        test.shouldGetSetOfUniqueBooks();
        test.shouldReturnTrueForContains();
        test.shouldReturnFalseForContains();
        test.shouldReturnMapByKeyAuthor();
        test.shouldReturnMapWithBookCountByKeyAuthor();

    }

    Book bookOne = new Book("George Orwell", "1984", "1991");
    Book bookTwo = new Book("Ethel Lilian Voynich", "An Interrupted Friendship", "1968");
    Book bookThree = new Book("Ethel Lilian Voynich", "The Gadfly", "1968");
    Book bookFour = new Book("Test", "1984", "1968");

    public void shouldGetSetOfUniqueAuthors() {
        BookDatabaseV2Impl victim = new BookDatabaseV2Impl();
        victim.bookList.clear();
        victim.bookList.add(bookOne);
        victim.bookList.add(bookTwo);
        victim.bookList.add(bookThree);
        victim.bookList.add(bookFour);
        Set<String> actualSet = victim.findUniqueAuthors();
        Set<String> expectedSet = new HashSet<>();
        expectedSet.add("George Orwell");
        expectedSet.add("Ethel Lilian Voynich");
        expectedSet.add("Test");
        check(actualSet.equals(expectedSet), "shouldGetSetOfUniqueAuthors");
    }

    public void shouldGetSetOfUniqueTitles() {
        BookDatabaseV2Impl victim = new BookDatabaseV2Impl();
        victim.bookList.clear();
        victim.bookList.add(bookOne);
        victim.bookList.add(bookTwo);
        victim.bookList.add(bookThree);
        victim.bookList.add(bookFour);
        Set<String> actualSet = victim.findUniqueTitles();
        Set<String> expectedSet = new HashSet<>();
        expectedSet.add("1984");
        expectedSet.add("An Interrupted Friendship");
        expectedSet.add("The Gadfly");
        check(actualSet.equals(expectedSet), "shouldGetSetOfUniqueTitles");
    }

    public void shouldGetSetOfUniqueBooks() {
        BookDatabaseV2Impl victim = new BookDatabaseV2Impl();
        victim.bookList.clear();
        victim.bookList.add(bookOne);
        victim.bookList.add(bookTwo);
        victim.bookList.add(bookThree);
        victim.bookList.add(bookOne);
        victim.bookList.add(bookTwo);
        Set<Book> actualSet = victim.findUniqueBooks();
        Set<Book> expectedSet = new HashSet<>();
        expectedSet.add(bookOne);
        expectedSet.add(bookTwo);
        expectedSet.add(bookThree);
        check(actualSet.equals(expectedSet), "shouldGetSetOfUniqueBooks");
    }

    public void shouldReturnTrueForContains() {
        BookDatabaseV2Impl victim = new BookDatabaseV2Impl();
        victim.bookList.clear();
        victim.bookList.add(bookOne);
        check(victim.contains(bookOne), "shouldReturnTrueForContains");
    }

    public void shouldReturnFalseForContains() {
        BookDatabaseV2Impl victim = new BookDatabaseV2Impl();
        victim.bookList.clear();
        victim.bookList.add(bookOne);
        check(!victim.contains(bookTwo), "shouldReturnFalseForContains");
    }

    public void shouldReturnMapByKeyAuthor() {
        BookDatabaseV2Impl victim = new BookDatabaseV2Impl();
        victim.bookList.clear();
        victim.bookList.add(bookOne);
        victim.bookList.add(bookTwo);
        victim.bookList.add(bookThree);
        Map<String, List<Book>> actualMap = victim.getAuthorToBooksMap();
        Map<String, List<Book>> expectedMap = new HashMap<>();
        List<Book> listOrwell = new ArrayList<>() {{
            add(bookOne);
        }};
        List<Book> listVoynich = new ArrayList<>() {{
            add(bookTwo);
            add(bookThree);
        }};
        expectedMap.put("George Orwell", listOrwell);
        expectedMap.put("Ethel Lilian Voynich", listVoynich);
        check(actualMap.equals(expectedMap), "shouldReturnMapByKeyAuthor");
    }

    public void shouldReturnMapWithBookCountByKeyAuthor() {
        BookDatabaseV2Impl victim = new BookDatabaseV2Impl();
        victim.bookList.clear();
        victim.bookList.add(bookOne);
        victim.bookList.add(bookTwo);
        victim.bookList.add(bookThree);
        Map<String, Integer> actualMap = victim.getEachAuthorBookCount();
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("George Orwell", 1);
        expectedMap.put("Ethel Lilian Voynich", 2);
        check(actualMap.equals(expectedMap), "shouldReturnMapWithBookCountByKeyAuthor");
    }

    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}

