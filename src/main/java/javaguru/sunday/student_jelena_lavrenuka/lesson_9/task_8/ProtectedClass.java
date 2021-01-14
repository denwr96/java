package javaguru.sunday.student_jelena_lavrenuka.lesson_9.task_8;

import javaguru.sunday.teacher.annotations.CodeReview;

// защищенный класс не может стать родительским
// protected класс или член класса доступен из любого места в текущем классе или пакете или в производных классах,
// даже если они находятся в других пакетах
@CodeReview(approved = true)
class ProtectedClass {
    private String title;
    private String author;
}
