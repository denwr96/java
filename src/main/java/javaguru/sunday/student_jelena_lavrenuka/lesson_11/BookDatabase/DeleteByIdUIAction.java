package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book's id");
        bookDatabase.delete(scanner.nextLong());
    }
}
