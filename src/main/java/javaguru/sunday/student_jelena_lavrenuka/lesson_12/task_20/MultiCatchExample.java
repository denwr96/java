package javaguru.sunday.student_jelena_lavrenuka.lesson_12.task_20;

import javaguru.sunday.teacher.annotations.CodeReview;

// ArithmeticException extends RuntimeException -> RuntimeException extends Exception
// нет необходимости ArithmeticException класс ловить отдельным блоком,
// так как эта ошибка уже будет поймана классом родителем Exception
@CodeReview(approved = true)
class MultiCatchExample {
    public static void main(String[] args) {
        try {

        } catch (Exception e) {

        }
    }
}


