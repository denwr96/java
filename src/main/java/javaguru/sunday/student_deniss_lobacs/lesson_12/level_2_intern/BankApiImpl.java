package javaguru.sunday.student_deniss_lobacs.lesson_12.level_2_intern;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.List;
import java.util.Optional;

@CodeReview(approved = true)
@CodeReviewComment(comment = "credentials != null - это конечно хорошо, вот только у вас список ролей может быть null, и тогда случится nullPointer. Вам стоило поменять местами .equals," +
        "чтобы обезопасить себя от nullPointer")
public class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
        if (credentials != null && !credentials.getRoles().contains(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException("User not authorised to read clients");
        }

        for (BankClient client : clients) {
            if (client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }

}
