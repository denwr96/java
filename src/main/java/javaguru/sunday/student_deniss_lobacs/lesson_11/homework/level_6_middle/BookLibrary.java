package main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_6_middle;

import main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.BookDatabase;
import main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.BookDatabaseImpl;
import main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_6_middle.UIAction.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// task36, task38
public class BookLibrary {
    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        menuNumberToActionMap = new HashMap();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new CountAllBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new FindUniqueAuthorsUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new FindUniqueTitlesUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new FindUniqueBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(12, new ContainsBookUIAction(bookDatabase));
        menuNumberToActionMap.put(13, new GetAuthorToBooksMapUIAction(bookDatabase));
        menuNumberToActionMap.put(14, new GetEachAuthorBookCountUIAction(bookDatabase));
        menuNumberToActionMap.put(15, new FindUIAction(bookDatabase));
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter menu number: ");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Good by!");
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
