package javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5_6;
//task38

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class DeleteByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the author name of the book you would like to delete");
        String author = scanner.nextLine();
        bookDatabase.deleteByAuthor(author);
        System.out.println("Book is deleted");

    }

}