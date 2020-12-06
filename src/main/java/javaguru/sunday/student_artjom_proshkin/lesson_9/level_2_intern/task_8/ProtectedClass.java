package main.java.javaguru.sunday.student_artjom_proshkin.lesson_9.level_2_intern.task_8;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

/*
переменные, методы и конструкторы, которые объявляются как protected в суперклассе,
могут быть доступны только для подклассов в другом пакете или для любого класса
в пакете класса protected.
Доступ protected дает подклассу возможность использовать вспомогательный
метод или переменную, предотвращая неродственный класс от попыток использовать их.

 */
@CodeReview(approved = true)
class ProtectedClass {

    private String title;
    private String author;


}
