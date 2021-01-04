package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.ui_action;


// Task 38 (level 6)

import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.BookDatabase;
import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.search_criteria.OrSearchCriteria;
import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.search_criteria.TitleSearchCriteria;
import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.search_criteria.YearOfIssueSearchCriteria;
import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.search_criteria.AndSearchCriteria;
import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.search_criteria.AuthorSearchCriteria;

import java.util.Scanner;

public class FindUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, choose search criteria: 1 - year of issue;\n" +
                "2 - author OR title; 3 - author OR year of issue; 4 - title OR year of issue;\n" +
                "5 - author AND title; 6 - author AND year of issue; 7 - title AND year of issue");
        int userInput = scanner.nextInt();

        switch (userInput) {
             case 1:
                String userInputYearOfIssue = scanner.next();
                System.out.println("List of books with chosen year of issue:");
                System.out.println(bookDatabase.find(new YearOfIssueSearchCriteria(userInputYearOfIssue)));
                break;
            case 2:
                System.out.println("Please, input author:");
                String userInputAuthor = scanner.next();

                System.out.println("Please, input title:");
                String userInputTitle = scanner.next();

                System.out.println(bookDatabase.find(new OrSearchCriteria(new AuthorSearchCriteria(userInputAuthor), new TitleSearchCriteria(userInputTitle))));
                break;
            case 3:
                System.out.println("Please, input author:");
                userInputAuthor = scanner.next();

                System.out.println("Please, input year of issue:");
                userInputYearOfIssue = scanner.next();

                System.out.println(bookDatabase.find(new OrSearchCriteria(new AuthorSearchCriteria(userInputAuthor), new YearOfIssueSearchCriteria(userInputYearOfIssue))));
                break;
            case 4:
                System.out.println("Please, input title:");
                userInputTitle = scanner.next();

                System.out.println("Please, input year of issue:");
                userInputYearOfIssue = scanner.next();

                System.out.println(bookDatabase.find(new OrSearchCriteria(new TitleSearchCriteria(userInputTitle), new YearOfIssueSearchCriteria(userInputYearOfIssue))));
                break;
            case 5:
                System.out.println("Please, input author:");
                userInputAuthor = scanner.next();

                System.out.println("Please, input title:");
                userInputTitle = scanner.next();

                System.out.println(bookDatabase.find(new AndSearchCriteria(new AuthorSearchCriteria(userInputAuthor), new TitleSearchCriteria(userInputTitle))));
                break;
            case 6:
                System.out.println("Please, input author:");
                userInputAuthor = scanner.next();

                System.out.println("Please, input year of issue:");
                userInputYearOfIssue = scanner.next();

                System.out.println(bookDatabase.find(new AndSearchCriteria(new AuthorSearchCriteria(userInputAuthor), new YearOfIssueSearchCriteria(userInputYearOfIssue))));
                break;
            case 7:
                System.out.println("Please, input title:");
                userInputTitle = scanner.next();

                System.out.println("Please, input year of issue:");
                userInputYearOfIssue = scanner.next();

                System.out.println(bookDatabase.find(new AndSearchCriteria(new TitleSearchCriteria(userInputTitle), new YearOfIssueSearchCriteria(userInputYearOfIssue))));
                break;
            default:
                System.out.println("Unknown input");
        }
    }
}
