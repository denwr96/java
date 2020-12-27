package javaguru.sunday.student_sergej_savkin.lesson_12.level_2_intern.task_7_17;


import java.util.List;
import java.util.Optional;

//task13

class BankApiImplTest {
    public static void main(String[] args) {
        BankApiImplTest bankApiImplTest = new BankApiImplTest();
        bankApiImplTest.findByUidTestOne();
        bankApiImplTest.findByUidTestTwo();
    }

    public void findByUidTestOne() {
        List<BankClient> clients = List.of(
                new BankClient("1", "Roman"),
                new BankClient("2", "Monika"),
                new BankClient("3", "Vladislav")
        );
        BankApiImpl test = new BankApiImpl(clients);
        UserCredentials invalidUserCredentials = new UserCredentials(List.of(Role.OBSERVER));
        try {
            test.findByUid(invalidUserCredentials, "2");
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
            System.out.println("findByUidTestOne OK!");
        }
    }

    public void findByUidTestTwo() {
        List<BankClient> clients = List.of(
                new BankClient("1", "Roman"),
                new BankClient("2", "Monika"),
                new BankClient("3", "Vladislav")
        );
        BankApiImpl test = new BankApiImpl(clients);
        UserCredentials validUserCredentials = new UserCredentials(List.of(Role.CAN_SEARCH_CLIENTS));
        BankClient expectedResult = new BankClient("2", "Monika");
        try {
            Optional<BankClient> result = test.findByUid(validUserCredentials, "2");
            result.ifPresent(bankClient -> check(bankClient.equals(expectedResult), "findByUidTestTwo"));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }

    public void check(boolean condition, String testName) {
        if(condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}
