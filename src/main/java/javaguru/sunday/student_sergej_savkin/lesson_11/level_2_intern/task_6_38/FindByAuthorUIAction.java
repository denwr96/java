package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;
import java.util.Scanner;

//task33

@CodeReview(approved = true)
class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book author: ");
        String author = scanner.next();
        List<Book> foundByAuthor = bookDatabase.findByAuthor(author);
        for (Book book : foundByAuthor) {
            System.out.println(book.toString());
        }
    }

}
