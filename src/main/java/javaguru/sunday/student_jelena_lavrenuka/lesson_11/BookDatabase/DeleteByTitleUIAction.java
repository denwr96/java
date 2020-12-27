package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

import java.util.Scanner;

public class DeleteByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book's title");
        bookDatabase.deleteByTitle(scanner.nextLine());
    }
}
