package main.java.javaguru.sunday.student_liana_shirmane.level_12.level_2;
//task13


import java.util.List;
import java.util.Optional;

public class BankApiImplTest {
    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.shouldFindUid();
    }


   private List<BankClient> clients = List.of(
            new BankClient("1", "User One"),
            new BankClient("2", "User Two"),
            new BankClient("3", "User Three")
    );

    void shouldFindUid(){
        BankApiImpl victim = new BankApiImpl(clients);
            UserCredentials invalidUserCredentials = new UserCredentials(List.of(Role.ADMIN));
            try {
                victim.findByUid(invalidUserCredentials, "2");
            } catch (
            AccessDeniedException e) {
                System.out.println("Test has passed!");
            }
    }
}
