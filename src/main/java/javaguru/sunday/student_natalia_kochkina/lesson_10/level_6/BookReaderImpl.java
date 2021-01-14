package javaguru.sunday.student_natalia_kochkina.lesson_10.level_6;

//Task_14
//Task_15
//Task_16
//Task_17
//Task_18
//Task_19
//Task_20
//Task_21
//Task_22
//Task_23
//Task_24
//Task_25

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.ArrayList;
import java.util.List;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Такс, добавление книги:" +
        "Переменная myBook - книга не ваша =) Плохой нейминг." +
        "Можно обойтись без лишних переменных checkTheSame, authorCheck," +
        "а проверять сразу в условии if(checkTheSameBook(newBook) && checkAuthor(newBook.getAuthor()) - так будет лучше." +
        "Task_15 - почему нет проверки на название книги? Подсказка, лучше сделать метод validateBook, и там проверить сразу оба атрибута книги через &&" +
        "Удаление книги. Почему проверяете на SameBook? Это путает читателя кода" +
        "просто сделайте метод findBook и используйте его для поиска книги по коллекции." +
        "listOfTheBooks - Очень намудрили. В результирующую коллекцию можно просто добавлять книги без индекса." +
        "    @Override\n" +
        "    public ArrayList<String> listOfTheBooks() {\n" +
        "        ArrayList<String> myBooks = new ArrayList<>();\n" +
        "        for (Book myBook: library) {\n" +
        "            String authorAndTitle = myBook.getTitle(myBook) + \" [\" + myBook.getAuthor(myBook) + \"]\";\n" +
        "            myBooks.add(authorAndTitle);\n" +
        "        }\n" +
        "        return myBooks;\n" +
        "    }" +
        "" +
        "findBookByFirstLettersOfAuthor - ой ой. Вас не туда завернуло. У String" +
        "должен быть метод, .startsWith(), попробуйте его применить" +
        "" +
        "findBookByFirstLettersOfTitle - то же самое" +
        "" +
        "Задания 24 и 25 вас ловят на переиспользовании кода. Неужели нельзя" +
        "переиспользовать этот огромный метод, если все, что изменяется в нем - это условие?")
public class BookReaderImpl implements BookReader {

    List<Book> library = new ArrayList<>();


    @Override
    public boolean checkTheSameBook(Book book) {
        if (library.contains(book)) {
            return false;
        }
        return true;
    }

    @Override
    public boolean validateBook(Book book) {
        String author = book.getAuthor(book);
        String title = book.getTitle(book);
        return (!author.equals("") && !title.equals(""));
    }

    @Override
    public boolean addBook(Book newBook) {
        if(checkTheSameBook(newBook) && validateBook(newBook)) {
            library.add(newBook);
            return true;
        }
        return false;
    }

    @Override
    public Book findBook(Book usersBook) {
        if (library.contains(usersBook)) {
            return usersBook;
        }
        return null;
    }

    @Override
    public boolean deleteBook(Book book) {
        Book removingBook = findBook(book);
        if (removingBook != null) {
            library.remove(removingBook);
            return true;
        }
        return false;
    }

    @Override
    public List<String> booksAuthorAndTitle() {
        List<String> booksAuthorAndTitle = new ArrayList<>();
        for (Book book: library) {
            String authorAndTitle = book.toString();
            booksAuthorAndTitle.add(authorAndTitle);
        }
        return booksAuthorAndTitle;
    }

    @Override
    public List<Book> searchByAuthor(String author){
        List<Book> booksOfThisAuthor = new ArrayList<>();
        for (Book bookInLibrary: library) {
            String thisAuthor = bookInLibrary.getAuthor(bookInLibrary);
            if (thisAuthor.equals(author)) {
                booksOfThisAuthor.add(bookInLibrary);
            }
        }
        return booksOfThisAuthor;
    }

    @Override
    public List<Book> searchByPartOfAuthor(String usersAuthor) {
        List<Book> booksOfThisAuthor = new ArrayList<>();
        for (Book bookInLibrary: library) {
            String thisAuthor = bookInLibrary.getAuthor(bookInLibrary);
            if (thisAuthor.startsWith(usersAuthor)) {
                booksOfThisAuthor.add(bookInLibrary);
            }
        }
        return booksOfThisAuthor;
    }

    public List<Book> searchBookByTitle(String title) {
        List<Book> booksWithThisTitle = new ArrayList<>();
        for (Book bookInLibrary: library) {
            String thisTitle = bookInLibrary.getTitle(bookInLibrary);
            if (thisTitle.equals(title)) {
                booksWithThisTitle.add(bookInLibrary);
            }
        }
        return  booksWithThisTitle;
    }

    @Override
    public  List<Book> searchByPartOfTitle(String usersTitle) {
        List<Book> booksWithThisTitle = new ArrayList<>();
        for (Book bookInLibrary: library) {
            String thisTitle = bookInLibrary.getTitle(bookInLibrary);
            if (thisTitle.startsWith(usersTitle)) {
                booksWithThisTitle.add(bookInLibrary);
            }
        }
        return booksWithThisTitle;
    }

    @Override
    public boolean bookWasRead(Book book){
        for (Book bookInLibrary: library) {
            if ((book.equals(bookInLibrary)) && (!book.isBookWasRead())) {
                bookInLibrary.switchReadState();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean bookWasNotRead(Book book){
        for (Book bookInLibrary: library) {
            if ((book.equals(bookInLibrary)) && (book.isBookWasRead())) {
                bookInLibrary.switchReadState();
                return true;
            }
        }
        return false;
    }

    @Override
    public List<String> booksWasReadList() {
        List<String> finishedBooks = new ArrayList<>();
        for (Book book: library) {
            if (book.isBookWasRead()) {
                String finishedBook = book.toString();
                finishedBooks.add(finishedBook);
            }
        }
        return finishedBooks;
    }

    @Override
    public List<String> unreadBooksList(){
        List<String> unreadBooks = new ArrayList<>();
        for (Book book: library) {
            if (!book.isBookWasRead()) {
                String unreadBook = book.toString();
                unreadBooks.add(unreadBook);
            }
        }
        return unreadBooks;
    }
}

