package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;


import java.util.Scanner;

class DeleteByBookUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByBookUIAction(BookDatabase bookDatabase) {
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
        Book bookToDelete = new Book(author, title, yearOfTheIssue);
        bookDatabase.delete(bookToDelete);
    }
}
