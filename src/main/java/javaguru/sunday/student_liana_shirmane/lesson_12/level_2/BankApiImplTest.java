package javaguru.sunday.student_liana_shirmane.lesson_12.level_2;
//task13


import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;
import java.util.Optional;

@CodeReview(approved = true)
public class BankApiImplTest {
    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.shouldNotFindUid();
        test.shouldFindUid();
    }


    private List<BankClient> clients = List.of(
            new BankClient("1", "User One"),
            new BankClient("2", "User Two"),
            new BankClient("3", "User Three")
    );

    void shouldNotFindUid() {
        BankApi victim = new BankApiImpl(clients);
        UserCredentials invalidUserCredentials = new UserCredentials(List.of(Role.ADMIN));
        try {
            victim.findByUid(invalidUserCredentials, "2");
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
            System.out.println("Should not find uid test has passed!");
        }
    }

    void shouldFindUid() {
        BankApi victim = new BankApiImpl(clients);
        UserCredentials validUserCredentials = new UserCredentials(List.of(Role.CAN_SEARCH_CLIENTS));
        BankClient expectedResult = new BankClient("1", "User One");
        try {
            Optional<BankClient> result = victim.findByUid(validUserCredentials, "1");
            result.ifPresent(bankClient -> checkResults(bankClient.equals(expectedResult), "Should find uid test"));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

    }

    public static boolean checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " has passed");
            return condition;
        } else {
            System.out.println(testName + " failed");
            return !condition;
        }
    }


}
