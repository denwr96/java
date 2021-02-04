package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter author");
        String booksAuthor = scanner.nextLine();
        System.out.println("Please enter book title");
        String booksTitle = scanner.nextLine();
        System.out.println("Please enter book's year of the issue");
        String yearOfTheIssue = scanner.nextLine();
        bookDatabase.save(new Book(booksAuthor, booksTitle, yearOfTheIssue));
    }

}
