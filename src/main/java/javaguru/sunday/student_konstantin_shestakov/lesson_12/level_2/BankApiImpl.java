package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_2;

// Task 12, 15, 16

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;
import java.util.Optional;
@CodeReview(approved = true)
class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
        if (credentials != null && !credentials.hasRole(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException("AccessDeniedException: User can't search clients");
        }
        for (BankClient client : clients) {
            if (client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }
        return Optional.empty();

    }

}
