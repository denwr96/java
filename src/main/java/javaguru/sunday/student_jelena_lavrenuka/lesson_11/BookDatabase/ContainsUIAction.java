package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

import java.util.Scanner;

class ContainsUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public ContainsUIAction (BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book's author");
        String author = scanner.nextLine();
        System.out.println("Please enter book's title");
        String title = scanner.nextLine();
        System.out.println("Please enter book's year of the issue");
        String yearOfTheIssue = scanner.nextLine();
        Book containsThisBook = new Book(author, title, yearOfTheIssue);
        bookDatabase.contains(containsThisBook);
    }
}
