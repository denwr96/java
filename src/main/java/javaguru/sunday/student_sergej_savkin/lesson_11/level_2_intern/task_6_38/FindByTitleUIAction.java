package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;
import java.util.Scanner;

//task34

@CodeReview(approved = true)
class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book title: ");
        String title = scanner.next();
        List<Book> foundByTitle = bookDatabase.findByTitle(title);
        for (Book book : foundByTitle) {
            System.out.println(book.toString());
        }
    }
}
