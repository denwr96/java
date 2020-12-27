package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

import java.util.Scanner;

public class DeleteByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book's author");
        bookDatabase.deleteByAuthor(scanner.nextLine());
    }
}
