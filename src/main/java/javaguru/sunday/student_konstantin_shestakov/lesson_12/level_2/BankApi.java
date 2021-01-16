package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_2;

// Task 10

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Optional;
@CodeReview(approved = true)
interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}
