package javaguru.sunday.student_liana_shirmane.level_12.level_2;
//task10
//task11

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials,
                                   String uid) throws AccessDeniedException;

}
