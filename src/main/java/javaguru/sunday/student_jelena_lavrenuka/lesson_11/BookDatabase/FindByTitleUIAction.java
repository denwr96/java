package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

import java.util.List;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book's title");
        List<Book> findByTitleUIAction = bookDatabase.findByTitle(scanner.nextLine());
        for (Book book : findByTitleUIAction) {
            System.out.println(book.toString());
        }
    }
}
