package javaguru.sunday.student_natalia_kochkina.lesson_12.level_2;

//Task_10, 11

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Optional;
@CodeReview(approved = true)
interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}

