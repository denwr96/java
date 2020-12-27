package javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern;

import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_3_junior.SearchCriteria;
import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_3_junior.search_criteria.AuthorSearchCriteria;
import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_3_junior.search_criteria.TitleSearchCriteria;
import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_3_junior.search_criteria.YearOfIssueSearchCriteria;

import java.util.Optional;

// task 6-14, task 22-26 , task 28-29
public class BookDatabaseTest {

    public static void main(String[] args) {
        BookDatabaseTest bookDatabaseTest = new BookDatabaseTest();
        bookDatabaseTest.deleteBookTestShouldBeOk();
        bookDatabaseTest.deleteBookTestShouldBeFail();
        bookDatabaseTest.deleteBookByObjectTestShouldBeTrue();
        bookDatabaseTest.deleteBookByObjectTestShouldBeFail();
        bookDatabaseTest.optionalFindByIdTestShouldBeOk();
        bookDatabaseTest.optionalFindByIdTestShouldBeFail();
        bookDatabaseTest.findByAuthorTestShouldBeOk();
        bookDatabaseTest.findByAuthorTestShouldBeFail();
        bookDatabaseTest.findByTitleTestShouldBeOk();
        bookDatabaseTest.findByTitleTestShouldBeFail();
        bookDatabaseTest.countAllBooksTestShouldBeOk();
        bookDatabaseTest.countAllBooksTestShouldBeFail();
        bookDatabaseTest.deleteByAuthorTestShouldBeOk();
        bookDatabaseTest.deleteByAuthorTestShouldBeFail();
        bookDatabaseTest.deleteByTitleTestShouldBeOk();
        bookDatabaseTest.deleteByTitleTestShouldBeFail();
        bookDatabaseTest.titleSearchCriteriaBooksListShouldBeOk();
        bookDatabaseTest.authorSearchCriteriaBooksListShouldBeOk();
        bookDatabaseTest.yearOfIssueSearchCriteriaBooksListShouldBeOk();
        bookDatabaseTest.findUniqueAuthorsTestShouldBeOk();
        bookDatabaseTest.findUniqueAuthorsTestShouldBeFail();
        bookDatabaseTest.findUniqueTitlesTestShouldBeOk();
        bookDatabaseTest.findUniqueTitlesTestShouldBeFail();
        bookDatabaseTest.findUniqueBooksTestShouldBeOk();
        bookDatabaseTest.findUniqueBooksTestShouldBeFail();
        bookDatabaseTest.containsBookTestShouldBeOk();
        bookDatabaseTest.containsBookTestShouldBeFail();
        bookDatabaseTest.getAuthorToBooksMapTest();
        bookDatabaseTest.getEachAuthorBookCountTest();
    }

    public void deleteBookTestShouldBeOk() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        Book bookOne = new Book("Principles", "Alex Pushkin");
        booksStorage.save(bookOne);
        checkResults(booksStorage.delete(1L) , "deleteBookTestShouldBeOk");
    }

    public void deleteBookTestShouldBeFail() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        Book bookOne = new Book("Principles", "Alex Pushkin");
        checkResults(booksStorage.delete(1L) , "deleteBookTestShouldBeFail");
    }

    public void deleteBookByObjectTestShouldBeTrue() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        Book bookOne = new Book("Principles", "Alex Pushkin");
        booksStorage.save(bookOne);
        checkResults(booksStorage.delete(bookOne) , "deleteBookByObjectTestShouldBeTrue");
    }

    public void deleteBookByObjectTestShouldBeFail() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        Book bookOne = new Book("Principles", "Alex Pushkin");
        checkResults(booksStorage.delete(bookOne) , "deleteBookByObjectTestShouldBeFail");
    }

    public void optionalFindByIdTestShouldBeOk() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        booksStorage.save(new Book("Alex Pushkin", "Eugene Onegin"));
        Optional<Book> bookOpt = booksStorage.findById(1L);
        checkResults(bookOpt.isPresent(), "optionalFindByIdTestShouldBeOk");
    }

    public void optionalFindByIdTestShouldBeFail() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        booksStorage.save(new Book("Alex Pushkin", "Eugene Onegin"));
        Optional<Book> bookOpt = booksStorage.findById(2L);
        checkResults(bookOpt.isPresent(), "optionalFindByIdTestShouldBeFail");
    }

    public void findByAuthorTestShouldBeOk() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        booksStorage.save(new Book("Alex Pushkin", "Eugene Onegin"));
        checkResults(booksStorage.findByAuthor("Alex Pushkin").size() == 1 , "findByAuthorTestShouldBeOk");
    }

    public void findByAuthorTestShouldBeFail() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        booksStorage.save(new Book("Alex Pushkin", "Eugene Onegin"));
        checkResults(booksStorage.findByAuthor("Alex Pushkin").size() == 0 , "findByAuthorTestShouldBeFail");
    }

    public void findByTitleTestShouldBeOk() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        booksStorage.save(new Book("Alex Pushkin", "Eugene Onegin"));
        checkResults(booksStorage.findByTitle("Eugene Onegin").size() == 1 , "findByAuthorTestShouldBeOk");
    }

    public void findByTitleTestShouldBeFail() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        booksStorage.save(new Book("Alex Pushkin", "Eugene Onegin"));
        checkResults(booksStorage.findByTitle("Eugene Onegin").size() == 0 , "findByTitleTestShouldBeFail");
    }

    public void countAllBooksTestShouldBeOk() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        booksStorage.save(new Book("Alex Pushkin", "Eugene Onegin"));
        booksStorage.save(new Book("Alex Pushkin", "Eugene Onegin"));
        checkResults(booksStorage.countAllBooks() == 2 , "countAllBooksTestShouldBeOk");
    }

    public void countAllBooksTestShouldBeFail() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        checkResults(booksStorage.countAllBooks() == 1 , "countAllBooksTestShouldBeFail");
    }

    public void deleteByAuthorTestShouldBeOk() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        booksStorage.save(new Book("Alex Pushkin", "Eugene Onegin"));
        booksStorage.deleteByAuthor("Alex Pushkin");
        checkResults(booksStorage.countAllBooks() == 0 , "deleteByAuthorTestShouldBeOk");
    }

    public void deleteByAuthorTestShouldBeFail() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        booksStorage.save(new Book("Alex Pushkin", "Eugene Onegin"));
        booksStorage.deleteByAuthor("Ivan Petrov");
        checkResults(booksStorage.countAllBooks() == 0 , "deleteByAuthorTestShouldBeFail");
    }

    public void deleteByTitleTestShouldBeOk() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        booksStorage.save(new Book("Alex Pushkin", "Eugene Onegin"));
        booksStorage.deleteByTitle("Eugene Onegin");
        checkResults(booksStorage.countAllBooks() == 0 , "deleteByTitleTestShouldBeOk");
    }

    public void deleteByTitleTestShouldBeFail() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        booksStorage.save(new Book("Alex Pushkin", "Eugene Onegin"));
        booksStorage.deleteByTitle("War And Peace");
        checkResults(booksStorage.countAllBooks() == 0 , "deleteByTitleTestShouldBeFail");
    }

    public void titleSearchCriteriaBooksListShouldBeOk() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        SearchCriteria searchMatches = new TitleSearchCriteria("Eugene Onegin");
        booksStorage.save(new Book("Alex Pushkin", "Eugene Onegin"));
        booksStorage.save(new Book("Ivan Petrov", "Eugene Onegin"));
        booksStorage.save(new Book("Aleksey Sidorov", "Eugene Onegin"));
        checkResults(booksStorage.find(searchMatches).size() == 3 , "titleSearchCriteriaBooksListShouldBeOk");
    }

    public void authorSearchCriteriaBooksListShouldBeOk() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        SearchCriteria searchMatches = new AuthorSearchCriteria("Alex Pushkin");
        booksStorage.save(new Book("Alex Pushkin", "Book1"));
        booksStorage.save(new Book("Alex Pushkin", "Book2"));
        booksStorage.save(new Book("Alex Pushkin", "Book3"));
        checkResults(booksStorage.find(searchMatches).size() == 3 , "authorSearchCriteriaBooksListShouldBeOk");
    }

    public void yearOfIssueSearchCriteriaBooksListShouldBeOk() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        SearchCriteria searchMatches = new YearOfIssueSearchCriteria("2000");
        booksStorage.save(new Book("Alex Pushkin", "Book1", "2000"));
        booksStorage.save(new Book("Alex Pushkin", "Book2", "19998"));
        booksStorage.save(new Book("Alex Pushkin", "Book3", "2020"));
        checkResults(booksStorage.find(searchMatches).size() == 1 , "yearOfIssueSearchCriteriaBooksListShouldBeOk");
    }

    public void findUniqueAuthorsTestShouldBeOk() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        booksStorage.save(new Book("Alex Pushkin", "Eugene Onegin"));
        booksStorage.save(new Book("Alex Pushkin", "Eugene Onegin"));
        booksStorage.save(new Book("Alex Pushkin", "Eugene Onegin"));
        checkResults(booksStorage.findUniqueAuthors().size() == 1 , "findUniqueAuthorsTestShouldBeOk");
    }

    public void findUniqueAuthorsTestShouldBeFail() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        booksStorage.save(new Book("Alex Pushkin", "Eugene Onegin"));
        booksStorage.save(new Book("Alex Pushkin", "Eugene Onegin"));
        booksStorage.save(new Book("Alex Pushkin", "Eugene Onegin"));
        checkResults(booksStorage.findUniqueAuthors().size() == 3 , "findUniqueAuthorsTestShouldBeFail");
    }

    public void findUniqueTitlesTestShouldBeOk() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        booksStorage.save(new Book("Author1", "Eugene Onegin"));
        booksStorage.save(new Book("Author2", "Eugene Onegin"));
        booksStorage.save(new Book("Author3", "Eugene Onegin"));
        checkResults(booksStorage.findUniqueTitles().size() == 1 , "findUniqueTitlesTestShouldBeOk");
    }

    public void findUniqueTitlesTestShouldBeFail() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        booksStorage.save(new Book("Author1", "Eugene Onegin"));
        booksStorage.save(new Book("Author2", "Eugene Onegin"));
        booksStorage.save(new Book("Author3", "Eugene Onegin"));
        checkResults(booksStorage.findUniqueTitles().size() == 3 , "findUniqueTitlesTestShouldBeFail");
    }

    public void findUniqueBooksTestShouldBeOk() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        booksStorage.save(new Book("Author1", "Eugene Onegin"));
        booksStorage.save(new Book("Author1", "Eugene Onegin"));
        booksStorage.save(new Book("Author1", "Eugene Onegin"));
        checkResults(booksStorage.findUniqueBooks().size() == 1 , "findUniqueTitlesTestShouldBeOk");
    }

    public void findUniqueBooksTestShouldBeFail() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        booksStorage.save(new Book("Author1", "Eugene Onegin"));
        booksStorage.save(new Book("Author1", "Eugene Onegin"));
        booksStorage.save(new Book("Author1", "Eugene Onegin"));
        checkResults(booksStorage.findUniqueBooks().size() == 3 , "findUniqueTitlesTestShouldBeFail");
    }

    public void containsBookTestShouldBeOk() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        Book bookOne = new Book("Principles", "Alex Pushkin");
        booksStorage.save(bookOne);
        checkResults(booksStorage.contains(bookOne) , "findUniqueTitlesTestShouldBeOk");
    }

    public void containsBookTestShouldBeFail() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        Book bookOne = new Book("Principles", "Alex Pushkin");
        checkResults(booksStorage.contains(bookOne) , "findUniqueTitlesTestShouldBeFail");
    }

    public void getAuthorToBooksMapTest() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        booksStorage.save(new Book("Author1", "Book1"));
        booksStorage.save(new Book("Author1", "Book2"));
        booksStorage.save(new Book("Author1", "Book3"));
        var result = booksStorage.getAuthorToBooksMap();
        if (result.size() == 1 && result.get("Author1") != null && result.get("Author1").size() == 3) {
            System.out.println("GetAuthorToBooksMapTest is OK");
        } else {
            System.out.println("GetAuthorToBooksMapTest is OK");
        }
    }

    public void getEachAuthorBookCountTest() {
        BookDatabase booksStorage = new BookDatabaseImpl();
        booksStorage.save(new Book("Author1", "Book1"));
        booksStorage.save(new Book("Author1", "Book2"));
        booksStorage.save(new Book("Author1", "Book3"));
        var result = booksStorage.getEachAuthorBookCount();
        if (result.size() == 1 && result.get("Author1") == 3) {
            System.out.println("GetEachAuthorBookCountTest is OK");
        } else {
            System.out.println("GetEachAuthorBookCountTest is FAILED");
        }
    }

    public boolean checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
            return condition;
        } else {
            System.out.println(testName + " = FAIL");
            return !condition;
        }
    }
}
