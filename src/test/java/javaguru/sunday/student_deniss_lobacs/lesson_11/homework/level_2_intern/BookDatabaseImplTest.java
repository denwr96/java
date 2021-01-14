package java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern;

import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.Book;
import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.BookDatabaseImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    BookDatabaseImpl victim;

    @Before
    public void setUp() throws Exception {

        victim = new BookDatabaseImpl(new ArrayList<>());
    }

    @Test
    public void testIfIdIsCorrectAfterSaveBook() {
        Book testBook1 = new Book("A", "B");
        Long returnedId = victim.save(testBook1);
        Assert.assertEquals(Long.valueOf(1), returnedId);
    }

    @Test
    public void testIfBookWasSaved() {
        List<Book> victimList = new ArrayList<>();
        victim = new BookDatabaseImpl(victimList);
        Book testBook1 = new Book("A", "B");
        victim.save(testBook1);
        assertEquals(1, victimList.size());
    }

    @Test
    public void testIfSavedBookIsCorrect() {
        List<Book> victimList = new ArrayList<>();
        victim = new BookDatabaseImpl(victimList);
        Book testBook1 = new Book("A", "B");
        victim.save(testBook1);
        assertTrue(victimList.contains(testBook1));
    }

    @Test
    public void testIfStorageIdWorksCorrectly() {
        List<Book> victimList = initDefaultTestBooks();
        victim = new BookDatabaseImpl(victimList);

        Book testBook3 = new Book("A", "B");
        Long resultId = victim.save(testBook3);
        assertEquals(Long.valueOf(3), resultId);

    }

    private List<Book> initDefaultTestBooks() {
        List<Book> victimList = new ArrayList<>();
        Book testBook1 = new Book("A", "B");
        testBook1.setId(1L);
        Book testBook2 = new Book("A", "B");
        testBook2.setId(2L);
        victimList.add(testBook1);
        victimList.add(testBook2);
        return victimList;
    }

    @Test
    public void testDeleteExistingBook() {
        List<Book> books = initDefaultTestBooks();
        victim = new BookDatabaseImpl(books);
        assertTrue(victim.delete(1L));
    }

    @Test
    public void testDeleteNonExistingBook() {
        List<Book> books = initDefaultTestBooks();
        victim = new BookDatabaseImpl(books);

        Book testBookToBeDeleted = new Book("Deleted", "Deleted");
        assertFalse(victim.delete(testBookToBeDeleted));
    }

    @Test
    public void findById() {
    }

    @Test
    public void countAllBooks() {
    }

    @Test
    public void testGetAuthorToBooksMap() {
        List<Book> bookStorage = new ArrayList<>();
        bookStorage.add(new Book("Author1", "Title1"));
        bookStorage.add(new Book("Author1", "Title2"));
        bookStorage.add(new Book("Author1", "Title3"));
        bookStorage.add(new Book("Author1", "Title4"));
        bookStorage.add(new Book("Author2", "Title5"));
        bookStorage.add(new Book("Author2", "Title6"));
        bookStorage.add(new Book("Author2", "Title7"));
        bookStorage.add(new Book("Author3", "Title8"));
        bookStorage.add(new Book("Author4", "Title9"));
        bookStorage.add(new Book("Author4", "Title10"));
        bookStorage.add(new Book("Author4", "Title11"));



        victim = new BookDatabaseImpl(bookStorage);
        Map<String, List<Book>> resultMap = victim.getAuthorToBooksMap();

        Set<String> authors = resultMap.keySet();
        assertTrue(authors.contains("Author1"));
        assertTrue(authors.contains("Author2"));
        assertTrue(authors.contains("Author3"));
        assertTrue(authors.contains("Author4"));

        List<Book> authorBook = resultMap.get("Author2");
        for (Book book : authorBook) {
            assertTrue(book.getAuthor().equals("Author2"));
        }

        Map<String, List<Book>> expectedMap = bookStorage.stream()
                .collect(Collectors.groupingBy(Book::getAuthor));

        assertEquals(expectedMap, resultMap);

    }
}