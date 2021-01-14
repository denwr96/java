package javaguru.sunday.student_jelena_lavrenuka.lesson_12.API;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Создавать роль can not search client было не обязательно." +
        "отсутствие роли can search client уже говорит о том, что этот юзер не может искать клиентов")
enum Role {
    CAN_NOT_SEARCH_CLIENTS,
    CAN_SEARCH_CLIENTS
}

