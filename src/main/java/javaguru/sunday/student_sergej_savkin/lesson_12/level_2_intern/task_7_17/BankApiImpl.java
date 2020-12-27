package javaguru.sunday.student_sergej_savkin.lesson_12.level_2_intern.task_7_17;

//task12

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {
        if(credentials !=null && !credentials.getRoles().contains(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException("User doesn't have such credentials");
        }
        for (BankClient client : clients) {
            if(client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }
        return Optional.empty();

    }

}
