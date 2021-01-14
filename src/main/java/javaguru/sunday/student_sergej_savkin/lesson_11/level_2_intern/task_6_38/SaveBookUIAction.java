package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;


//task31
@CodeReview(approved = true)
class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter author: ");
        String author = scanner.next();
        System.out.println("Please enter book title: ");
        String bookTitle = scanner.next();
        Book book = new Book(author, bookTitle);
        bookDatabase.save(book);
    }

}
