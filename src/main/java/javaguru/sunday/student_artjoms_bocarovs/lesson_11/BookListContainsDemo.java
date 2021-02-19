package javaguru.sunday.student_artjoms_bocarovs.lesson_11;

import java.util.ArrayList;

public class BookListContainsDemo {

    public static void main(String[] args) {
        BookListContainsDemo bookListContainsDemo = new BookListContainsDemo();
        bookListContainsDemo.checkList();
    }

    Book firstBook = new Book("Li Jakoka", "Karjera Menedzera");
    Book secondBook = new Book("DJ.K. Rouling", "Harry Potter");
    Book thirdBook = new Book("Genri Ford", "My Life");

    public void checkList() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(firstBook);
        bookList.add(secondBook);
        bookList.add(thirdBook);


        if (bookList.contains(thirdBook)) {
            System.out.println(thirdBook.toString() + " is in the list");
        }
    }
}
