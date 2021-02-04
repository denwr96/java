package javaguru.sunday.student_liana_shirmane.lesson_12.level_2;
//task10
//task11

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Optional;

@CodeReview(approved = true)
interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials,
                                   String uid) throws AccessDeniedException;

}
