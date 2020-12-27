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

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {
        if (!credentials.hasRole(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException ("User is not authorised to read clients");
        }
        for (BankClient client : clients) {
            if (client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }
}
