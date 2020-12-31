package javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5_6;
//task33

import java.util.List;
import java.util.Scanner;

class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the author of the book");
        String author = scanner.nextLine();
        List<Book> bookByAuthor = bookDatabase.findByAuthor(author);
        System.out.println("Your book is " + bookByAuthor);

    }

}