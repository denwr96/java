package javaguru.sunday.student_deniss_lobacs.lesson_12.level_2_intern;

import java.util.Optional;

public interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}
