package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_2;

// Task 13

import java.util.ArrayList;
import java.util.List;

class BankApiImplTest {
    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.findByUidInvalidUserCredentialsTest();
        test.findByUidValidUserCredentialsTest();

    }

    void findByUidInvalidUserCredentialsTest() {
        List<BankClient> clients = new ArrayList<>(List.of(
                new BankClient("1", "Customer 1"),
                new BankClient("2", "Customer 2"),
                new BankClient("3", "Customer 3")
        ));

        BankApiImpl victim = new BankApiImpl(clients);

        UserCredentials invalidUserCredentials = new UserCredentials(List.of(Role.OBSERVER));
        try {
            victim.findByUid(invalidUserCredentials, "4");
            System.out.println("validUserCredentialsTest has not passed!");
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
            System.out.println("invalidUserCredentialsTest has passed!");
        }
    }

    void findByUidValidUserCredentialsTest() {
        List<BankClient> clients = new ArrayList<>(List.of(
                new BankClient("1", "Customer 1"),
                new BankClient("2", "Customer 2"),
                new BankClient("3", "Customer 3")
        ));

        BankApiImpl victim = new BankApiImpl(clients);

        UserCredentials validUserCredentials = new UserCredentials(List.of(Role.CAN_SEARCH_CLIENTS));
        try {
            victim.findByUid(validUserCredentials, "2");
            System.out.println("validUserCredentialsTest has passed!");
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
            System.out.println("validUserCredentialsTest has not passed!");
        }
    }
}
