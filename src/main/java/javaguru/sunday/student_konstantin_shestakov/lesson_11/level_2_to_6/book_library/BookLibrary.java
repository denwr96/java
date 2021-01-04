package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library;


// Task 36, 38 (level 6);

import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.ui_action.UIAction;
import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.ui_action.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BookLibrary {

    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        menuNumberToActionMap = new HashMap();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new CountAllBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new GetBooksLibraryUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new FindUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new FindUniqueAuthorsUIAction(bookDatabase));
        menuNumberToActionMap.put(12, new FindUniqueTitlesUIAction(bookDatabase));
        menuNumberToActionMap.put(13, new FindUniqueBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(14, new ContainsUIAction(bookDatabase));
        menuNumberToActionMap.put(15, new GetAuthorToBooksMapUIAction(bookDatabase));
        menuNumberToActionMap.put(16, new GetEachAuthorBookCountUIAction(bookDatabase));
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter menu number: ");
            System.out.println("1 - save book; 2 - find by ID; 3 - find by author; 4 - find by title; 5 - delete by ID; 6 - count all; 7 - delete by author; 8 - delete by title;\n" +
                    "9 - list of books; 10 - OR/AND search criteria; 11 - unique authors; 12 - unique titles; 13 - unique books (object); 14 - check if contains; 15 - author's books list; 16 - author's book count");
            System.out.println("0 - exit");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Good bye!");
                break;
            } else {
                executeUIAction(userSelectedMenuNumber);
            }
        }
    }

    private void executeUIAction(int userSelectedMenuNumber) {
        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Menu item not exist: " + userSelectedMenuNumber);
        }
    }

}
