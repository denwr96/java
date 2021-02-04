package javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5_6;
//task38

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class ContainsUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public ContainsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the title of the book");
        String bookTitle = scanner.nextLine();
        System.out.println("Please enter the author of the book");
        String author = scanner.nextLine();
        System.out.println("Please enter year of issue");
        String yearOfIssue = scanner.nextLine();
        Book book = new Book(author, bookTitle,yearOfIssue);
        if (bookDatabase.contains(book)) {
            System.out.println("Book is in database");
        } else System.out.println("No such book in database");
    }
}