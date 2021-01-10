package javaguru.sunday.student_deniss_lobacs.lesson_12.level_2_intern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class BankApiImplTest {

    private BankApiImpl victim;

    @Before
    public void setUp() throws Exception {
        List<BankClient> clients = getBankClients();
        victim = new BankApiImpl(clients);

    }

    @Test
    public void testFindByUid_Success() {
        UserCredentials validUserCredentials = new UserCredentials(List.of(Role.CAN_SEARCH_CLIENTS));
        String expectedResult = "Alex";
        try {
            Optional<BankClient> result = victim.findByUid(validUserCredentials, "1");
            result.ifPresent(bankClient -> assertEquals(expectedResult, bankClient.getFullName()));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(expected = AccessDeniedException.class)
    public void testFindByUid_ThrowException() throws AccessDeniedException {
        UserCredentials validUserCredentials = new UserCredentials(List.of(Role.CAN_SEARCH_CLIENTS));
        victim.findByUid(validUserCredentials, "1");
    }

    private List<BankClient> getBankClients() {
        return List.of(
                new BankClient("1", "Alex"),
                new BankClient("2", "Irina"),
                new BankClient("3", "Victor")
        );
    }
}