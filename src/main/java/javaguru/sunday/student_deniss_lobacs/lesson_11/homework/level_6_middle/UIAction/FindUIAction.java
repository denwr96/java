package javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_6_middle.UIAction;

import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.BookDatabase;
import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_3_junior.search_criteria.*;

import java.util.Scanner;

public class FindUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose search criteria\n" +
                           "1 - Year of issue\n" +
                           "2 - Author OR Title\n" +
                           "3 - Author OR Year\n" +
                           "4 - Title OR Year\n" +
                           "5 - Author AND Title\n" +
                           "6 - Author AND Year\n" +
                           "7 - Title AND Year");
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Enter year of issue: ");
                String year = scanner.next();
                bookDatabase.find(new YearOfIssueSearchCriteria(year));
                break;
            case 2:
                System.out.println("Enter author of book: ");
                String author  = scanner.next();
                System.out.println("Enter title of book: ");
                String title = scanner.nextLine();
                System.out.println(bookDatabase.find(new OrSearchCriteria(new AuthorSearchCriteria(author), new TitleSearchCriteria(title))));
                break;
            case 3:
                System.out.println("Enter author of book: ");
                author  = scanner.next();
                System.out.println("Enter year of issue: ");
                year = scanner.nextLine();
                System.out.println(bookDatabase.find(new OrSearchCriteria(new AuthorSearchCriteria(author), new YearOfIssueSearchCriteria(year))));
                break;
            case 4:
                System.out.println("Enter author of book: ");
                title = scanner.next();
                System.out.println("Enter year of issue: ");
                year = scanner.nextLine();
                System.out.println(bookDatabase.find(new OrSearchCriteria(new TitleSearchCriteria(title), new YearOfIssueSearchCriteria(year))));
                break;
            case 5:
                System.out.println("Enter author of book: ");
                author = scanner.next();
                System.out.println("Enter title of book: ");
                title = scanner.nextLine();
                System.out.println(bookDatabase.find(new AndSearchCriteria(new AuthorSearchCriteria(author), new TitleSearchCriteria(title))));
                break;
            case 6:
                System.out.println("Enter author of book: ");
                author = scanner.next();
                System.out.println("Enter year of issue: ");
                year = scanner.nextLine();
                System.out.println(bookDatabase.find(new AndSearchCriteria(new AuthorSearchCriteria(author), new YearOfIssueSearchCriteria(year))));
                break;
            case 7:
                System.out.println("Enter title of book: ");
                title = scanner.next();
                System.out.println("Enter year of issue: ");
                year = scanner.nextLine();
                System.out.println(bookDatabase.find(new AndSearchCriteria(new TitleSearchCriteria(title), new YearOfIssueSearchCriteria(year))));
                break;
            default:
                System.out.println("Menu item not exist");
        }
    }
}
