package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_12.API;

// lesson_12 task_7
// lesson_12 task_8
// lesson_12 task_9
// lesson_12 task_10
// lesson_12 task_11
// lesson_12 task_12
// lesson_12 task_13
// lesson_12 task_14
// lesson_12 task_15
// lesson_12 task_16
// lesson_12 task_17

import java.util.List;
import java.util.Optional;

class BankApiImplTest {
    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.findByUidTest1();
        test.findByUidTest2();
    }

    public void findByUidTest1(){
        List<BankClient> listOfClients = List.of(
                new BankClient("1", "Jelena"),
                new BankClient("2", "Roman"),
                new BankClient("3", "Aniel")
        );
        BankApi victim = new BankApiImpl(listOfClients);
        UserCredentials invalidUserCredentials = new UserCredentials(List.of(Role.CAN_NOT_SEARCH_CLIENTS));
        try {
            victim.findByUid(invalidUserCredentials, "3");
        } catch (AccessDeniedException e){
            System.out.println(e.getMessage());
            System.out.println("findByUidTest1 is OK");
            System.out.println("");
        }
    }

    public void findByUidTest2(){
        List<BankClient> listOfClients = List.of(
                new BankClient("1", "Jelena"),
                new BankClient("2", "Roman"),
                new BankClient("3", "Aniel")
        );
        BankApi victim = new BankApiImpl(listOfClients);
        UserCredentials validUserCredentials = new UserCredentials(List.of(Role.CAN_SEARCH_CLIENTS));
        BankClient expectedResult = new BankClient("2", "Roman");
        try {
            Optional<BankClient> result = victim.findByUid(validUserCredentials, "2");
            result.ifPresent(bankClient -> testResult(bankClient.equals(expectedResult), "findByUidTest2"));
        }catch (AccessDeniedException e){
            System.out.println(e.getMessage());
        }
    }

    public static boolean testResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
            return condition;
        } else {
            System.out.println(testName + " = FAIL");
            return !condition;
        }
    }
}
