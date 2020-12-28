package javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5_6;
//task31

import java.util.Scanner;

class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the title of the book");
        String bookTitle = scanner.nextLine();
        System.out.println("Please enter the author of the book");
        String author = scanner.nextLine();
        System.out.println("Please enter year of issue");
        String yearOfIssue = scanner.nextLine();
        Book book = new Book(author, bookTitle,yearOfIssue);
        bookDatabase.save(book);
    }

}
