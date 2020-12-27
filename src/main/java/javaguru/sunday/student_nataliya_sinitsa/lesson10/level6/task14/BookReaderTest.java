package javaguru.sunday.student_nataliya_sinitsa.lesson10.level6.task14;

//Task 14 -> 25

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@CodeReview(approved = true)
class BookReaderTest {

    public static void main(String[] args) {

        BookReaderTest test = new BookReaderTest();

        test.shouldBeTrueAddBook();
        test.shouldBeFalseAddBook();
        test.shouldBeFalseAddBookNull();

        test.shouldBeTrueRemoveBook();
        test.shouldBeFalseRemoveBook();

        test.shouldShowBookList();

        test.shouldReturnBookListByAuthor();
        test.shouldReturnBookListByPartOfAuthorName();

        test.shouldReturnBookListByTitle();
        test.shouldReturnBookListByPartOfTitle();

        test.shouldPassMarkingBookAsRead();
        test.shouldFailMarkingBookAsRead();

        test.shouldPassMarkingBookAsUnread();
        test.shouldFailMarkingBookAsUnread();

        test.shouldShowReadBookList();
        test.shouldShowUnreadBookList();

    }

    public void shouldBeTrueAddBook() {
        BookReaderImpl victim = new BookReaderImpl();
        Book firstBook = new Book("George Orwell", "1984");
        Book secondBook = new Book("Ethel Lilian Voynich", "An Interrupted Friendship");
        Book thirdBook = new Book("Ethel Lilian Voynich", "The Gadfly");
        victim.bookList.add(firstBook);
        victim.bookList.add(secondBook);
        check(victim.addBook(thirdBook), "shouldBeTrueAddBook");
    }

    public void shouldBeFalseAddBook() {
        BookReaderImpl victim = new BookReaderImpl();
        Book firstBook = new Book("George Orwell", "1984");
        Book secondBook = new Book("Ethel Lilian Voynich", "An Interrupted Friendship");
        Book thirdBook = new Book("Ethel Lilian Voynich", "An Interrupted Friendship");
        victim.bookList.add(firstBook);
        victim.bookList.add(secondBook);
        check(!victim.addBook(thirdBook), "shouldBeFalseAddBook");
    }

    public void shouldBeFalseAddBookNull() {
        BookReaderImpl victim = new BookReaderImpl();
        Book firstBook = new Book("George Orwell", "1984");
        Book secondBook = new Book("Ethel Lilian Voynich", "An Interrupted Friendship");
        Book thirdBook = new Book();
        victim.bookList.add(firstBook);
        victim.bookList.add(secondBook);
        check(!victim.addBook(thirdBook), "shouldBeFalseAddBookNull");
    }

    public void shouldBeTrueRemoveBook() {
        BookReaderImpl victim = new BookReaderImpl();
        Book firstBook = new Book("George Orwell", "1984");
        Book secondBook = new Book("Ethel Lilian Voynich", "An Interrupted Friendship");
        Book thirdBook = new Book("Ethel Lilian Voynich", "The Gadfly");
        victim.bookList.add(firstBook);
        victim.bookList.add(secondBook);
        victim.bookList.add(thirdBook);
        Book bookToRemove = new Book("Ethel Lilian Voynich", "The Gadfly");
        check(victim.removeBook(bookToRemove), "shouldBeTrueRemoveBook");
    }

    public void shouldBeFalseRemoveBook() {
        BookReaderImpl victim = new BookReaderImpl();
        Book firstBook = new Book("George Orwell", "1984");
        Book secondBook = new Book("Ethel Lilian Voynich", "An Interrupted Friendship");
        victim.bookList.add(firstBook);
        victim.bookList.add(secondBook);
        Book bookToRemove = new Book("Ethel Lilian Voynich", "The Gadfly");
        check(!victim.removeBook(bookToRemove), "shouldBeFalseRemoveBook");
    }

    public void shouldShowBookList() {
        BookReaderImpl victim = new BookReaderImpl();
        Book firstBook = new Book("George Orwell", "1984");
        Book secondBook = new Book("Ethel Lilian Voynich", "An Interrupted Friendship");
        Book thirdBook = new Book("Ethel Lilian Voynich", "The Gadfly");
        victim.bookList.add(firstBook);
        victim.bookList.add(secondBook);
        victim.bookList.add(thirdBook);
        List<String> actualBookList = victim.availableBooks();
        List<String> expectedBookList = new ArrayList<>() {{
            add("1984 [George Orwell]");
            add("An Interrupted Friendship [Ethel Lilian Voynich]");
            add("The Gadfly [Ethel Lilian Voynich]");
        }};
        check(actualBookList.equals(expectedBookList), "shouldShowBookList");
    }

    public void shouldReturnBookListByAuthor() {
        BookReaderImpl victim = new BookReaderImpl();
        Book firstBook = new Book("George Orwell", "1984");
        Book secondBook = new Book("Ethel Lilian Voynich", "An Interrupted Friendship");
        Book thirdBook = new Book("Ethel Lilian Voynich", "The Gadfly");
        victim.bookList.add(firstBook);
        victim.bookList.add(secondBook);
        victim.bookList.add(thirdBook);
        check(victim.bookListByAuthor("Ethel Lilian Voynich").toString().
                equals("[An Interrupted Friendship [Ethel Lilian Voynich], The Gadfly [Ethel Lilian Voynich]]"),
                "shouldReturnBookListByAuthor");
    }

    public void shouldReturnBookListByPartOfAuthorName() {
        BookReaderImpl victim = new BookReaderImpl();
        Book firstBook = new Book("George Orwell", "1984");
        Book secondBook = new Book("Ethel Lilian Voynich", "An Interrupted Friendship");
        Book thirdBook = new Book("Ethel Lilian Voynich", "The Gadfly");
        victim.bookList.add(firstBook);
        victim.bookList.add(secondBook);
        victim.bookList.add(thirdBook);
        check(victim.bookListByPartOfAuthorName("Ethel").toString().
                        equals("[An Interrupted Friendship [Ethel Lilian Voynich], The Gadfly [Ethel Lilian Voynich]]"),
                "shouldReturnBookListByPartOfAuthorName");
    }

    public void shouldReturnBookListByTitle() {
        BookReaderImpl victim = new BookReaderImpl();
        Book firstBook = new Book("George Orwell", "1984");
        Book secondBook = new Book("Ethel Lilian Voynich", "An Interrupted Friendship");
        Book thirdBook = new Book("Ethel Lilian Voynich", "The Gadfly");
        victim.bookList.add(firstBook);
        victim.bookList.add(secondBook);
        victim.bookList.add(thirdBook);
        check(victim.bookListByTitle("An Interrupted Friendship").toString().
                        equals("[An Interrupted Friendship [Ethel Lilian Voynich]]"),
                "shouldReturnBookListByTitle");
    }

    public void shouldReturnBookListByPartOfTitle() {
        BookReaderImpl victim = new BookReaderImpl();
        Book firstBook = new Book("George Orwell", "1984");
        Book secondBook = new Book("Ethel Lilian Voynich", "The Gadfly");
        Book thirdBook = new Book("Dmytry Kazakov", "Game Over");
        victim.bookList.add(firstBook);
        victim.bookList.add(secondBook);
        victim.bookList.add(thirdBook);
        check(victim.bookListByPartOfTitle("Ga").toString().
                        equals("[The Gadfly [Ethel Lilian Voynich], Game Over [Dmytry Kazakov]]"),
                "shouldReturnBookListByPartOfTitle");
    }

    public void shouldPassMarkingBookAsRead() {
        BookReaderImpl victim = new BookReaderImpl();
        Book firstBook = new Book("George Orwell", "1984");
        victim.bookList.add(firstBook);
        Book bookToMark = new Book("George Orwell", "1984");
        check(victim.markAsRead(bookToMark), "shouldPassMarkingBookAsRead");
    }

    public void shouldFailMarkingBookAsRead() {
        BookReaderImpl victim = new BookReaderImpl();
        Book firstBook = new Book("George Orwell", "1984");
        victim.bookList.add(firstBook);
        Book bookToMark = new Book("George Orwell", "2084");
        check(!victim.markAsRead(bookToMark), "shouldFailMarkingBookAsRead");
    }

    public void shouldPassMarkingBookAsUnread() {
        BookReaderImpl victim = new BookReaderImpl();
        Book firstBook = new Book("George Orwell", "1984");
        victim.bookList.add(firstBook);
        Book bookToMark = new Book("George Orwell", "1984");
        check(victim.markAsRead(bookToMark), "shouldPassMarkingBookAsUnread");
    }

    public void shouldFailMarkingBookAsUnread() {
        BookReaderImpl victim = new BookReaderImpl();
        Book firstBook = new Book("George Orwell", "1984");
        victim.bookList.add(firstBook);
        Book bookToMark = new Book("George Orwell", "2084");
        check(!victim.markAsRead(bookToMark), "shouldFailMarkingBookAsUnread");
    }

    public void shouldShowReadBookList() {
        BookReaderImpl victim = new BookReaderImpl();
        Book firstBook = new Book("George Orwell", "1984");
        Book secondBook = new Book("Ethel Lilian Voynich", "An Interrupted Friendship");
        Book thirdBook = new Book("Ethel Lilian Voynich", "The Gadfly");
        victim.bookList.add(firstBook);
        victim.bookList.add(secondBook);
        victim.bookList.add(thirdBook);
        secondBook.isRead = true;
        check(victim.listOfReadBooks().toString().equals("[An Interrupted Friendship [Ethel Lilian Voynich]]"),
                "shouldShowReadBookList");
    }

    public void shouldShowUnreadBookList() {
        BookReaderImpl victim = new BookReaderImpl();
        Book firstBook = new Book("George Orwell", "1984");
        Book secondBook = new Book("Ethel Lilian Voynich", "An Interrupted Friendship");
        Book thirdBook = new Book("Ethel Lilian Voynich", "The Gadfly");
        victim.bookList.add(firstBook);
        victim.bookList.add(secondBook);
        victim.bookList.add(thirdBook);
        firstBook.isRead = true;
        check(victim.listOfUnreadBooks().toString().
                equals("[An Interrupted Friendship [Ethel Lilian Voynich], The Gadfly [Ethel Lilian Voynich]]"),
                "shouldShowUnreadBookList");
    }

    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
