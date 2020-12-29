package javaguru.sunday.student_jelena_lavrenuka.lesson_12.API;


// lesson_12 task_7
// lesson_12 task_8
// lesson_12 task_9
// lesson_12 task_10
// lesson_12 task_11
// lesson_12 task_12
// lesson_12 task_13
// lesson_12 task_14
// lesson_12 task_15
// lesson_12 task_16
// lesson_12 task_17

import java.util.Optional;

interface BankApi {
    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}
