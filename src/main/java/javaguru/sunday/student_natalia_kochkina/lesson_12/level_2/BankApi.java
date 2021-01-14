package javaguru.sunday.student_natalia_kochkina.lesson_12.level_2;

//Task_10, 11

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}

