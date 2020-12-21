package main.java.javaguru.sunday.teacher.lesson_12.lessoncode.level_6_middle.level2;

import java.util.Optional;

public interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}
