package javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5_6;
//task34

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;
import java.util.Scanner;
@CodeReview(approved = true)
class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the title of the book");
        String title = scanner.nextLine();
        List<Book> bookByTitle = bookDatabase.findByTitle(title);
        System.out.println("Your book is " + bookByTitle);

    }

}