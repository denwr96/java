package javaguru.sunday.student_sergej_savkin.lesson_12.level_2_intern.task_7_17;

import java.util.Optional;

//task10
//task11

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}
