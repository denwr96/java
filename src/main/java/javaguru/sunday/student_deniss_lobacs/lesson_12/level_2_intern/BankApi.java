package javaguru.sunday.student_deniss_lobacs.lesson_12.level_2_intern;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Optional;

@CodeReview(approved = true)
public interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}
