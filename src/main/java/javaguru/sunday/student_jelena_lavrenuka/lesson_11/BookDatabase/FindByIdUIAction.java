package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Optional;
import java.util.Scanner;

@CodeReview(approved = true)
class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book's ID");
        Optional<Book> bookOpt = bookDatabase.findById(scanner.nextLong());
        if (bookOpt.isPresent()) {
            Book book = bookOpt.get();
            printBookInfo(book);
        }
    }
    private static void printBookInfo(Book book) {
        System.out.println(book.toString());
    }
}
