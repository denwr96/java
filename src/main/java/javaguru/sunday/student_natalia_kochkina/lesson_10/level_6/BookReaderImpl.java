package main.java.javaguru.sunday.student_natalia_kochkina.lesson_10.level_6;

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

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.ArrayList;
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

    ArrayList<Book> library = new ArrayList<>();

    @Override
    public boolean checkAuthor(Book book) {
        String author = book.getAuthor(book);
        return !author.equals("");
    }

    @Override
    public boolean checkTheSameBook(Book book) {
        for (Book myBook: library) {
            if (book.equals(myBook)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addBook(Book book) {
        boolean checkTheSame = checkTheSameBook(book);
        boolean authorCheck = checkAuthor(book);
        if (checkTheSame && authorCheck) {
            library.add(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteBook(Book book) {
        if (!checkTheSameBook(book)) {
            library.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<String> listOfTheBooks() {
        ArrayList<String> myBooks = new ArrayList<>();
        for (Book myBook: library) {
            String authorAndTitle = myBook.getTitle(myBook) + " [" + myBook.getAuthor(myBook) + "]";
            myBooks.add(authorAndTitle);
        }
        return myBooks;
    }

    @Override
    public ArrayList<Book> findBookByAuthor(String author){
        ArrayList<Book> booksOfThisAuthor = new ArrayList<>();
        for (Book myBook: library) {
            String thisAuthor = myBook.getAuthor(myBook);
            if (thisAuthor.equals(author)) {
                booksOfThisAuthor.add(myBook);
            }
        }
        return  booksOfThisAuthor;
    }

    @Override
    public ArrayList<Book> findBookByFirstLettersOfAuthor(String author) {
        ArrayList<Book> booksOfThisAuthor = new ArrayList<>();
        char[] usersAuthorByLetters = author.toCharArray();
        for (Book myBook: library) {
            String thisAuthor = myBook.getAuthor(myBook);
            char[] thisAuthorByLetters = thisAuthor.toCharArray();
            if ((usersAuthorByLetters[0] == thisAuthorByLetters[0]) &&
                    (usersAuthorByLetters[1] == thisAuthorByLetters[1]) &&
                    (usersAuthorByLetters[2] == thisAuthorByLetters[2]) &&
                    (usersAuthorByLetters[3] == thisAuthorByLetters[3])) {
                booksOfThisAuthor.add(myBook);
            }
        }
        return  booksOfThisAuthor;
    }

    public ArrayList<Book> findBookByTitle(String title) {
        ArrayList<Book> booksWithThisTitle = new ArrayList<>();
        for (Book myBook: library) {
            String thisTitle = myBook.getTitle(myBook);
            if (thisTitle.equals(title)) {
                booksWithThisTitle.add(myBook);
            }
        }
        return  booksWithThisTitle;
    }

    @Override
    public  ArrayList<Book> findBookByFirstLettersOfTitle(String title) {
        ArrayList<Book> booksWithSameTitle = new ArrayList<>();
        char[] usersTitleByLetters = title.toCharArray();
        for (Book myBook: library) {
            String thisTitle = myBook.getTitle(myBook);
            char[] thisTitleByLetters = thisTitle.toCharArray();
            if ((usersTitleByLetters[0] == thisTitleByLetters[0]) &&
                    (usersTitleByLetters[1] == thisTitleByLetters[1]) &&
                    (usersTitleByLetters[2] == thisTitleByLetters[2]) &&
                    (usersTitleByLetters[3] == thisTitleByLetters[3])) {
                booksWithSameTitle.add(myBook);
            }
        }
        return  booksWithSameTitle;
    }

    @Override
    public boolean bookWasRead(Book book){
        for (Book myBook: library) {
            if (book.equals(myBook)) {
                myBook.bookWasReadBecomeTrue();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean bookWasNotRead(Book book){
        for (Book myBook: library) {
            if (book.equals(myBook)) {
                myBook.bookWasReadBecomeFalse();
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<String> booksIWasRead() {
        ArrayList<String> booksWasRead = new ArrayList<>();
        for (Book myBook: library) {
            boolean wasRead = myBook.getWasBookRead();
            if (wasRead) {
                String author = myBook.getAuthor(myBook);
                String title = myBook.getTitle(myBook);
                String myStringBook = title + " [" + author + "]";
                booksWasRead.add(myStringBook);
            }
        }
        return booksWasRead;
    }

    @Override
    public ArrayList<String> booksIWasNotRead(){
        ArrayList<String> booksWasNotRead = new ArrayList<>();
        for (Book myBook: library) {
            boolean wasRead = myBook.getWasBookRead();
            if (!wasRead) {
                String author = myBook.getAuthor(myBook);
                String title = myBook.getTitle(myBook);
                String myStringBook = title + " [" + author + "]";
                booksWasNotRead.add(myStringBook);
            }
        }
        return booksWasNotRead;
    }
}
