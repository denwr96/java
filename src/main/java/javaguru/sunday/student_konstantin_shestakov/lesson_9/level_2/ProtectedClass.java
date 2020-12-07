package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// Task 8
// Модификатор protected — переменные, методы и конструкторы, которые объявляются как protected в суперклассе,
// могут быть доступны только для подклассов в другом пакете или для любого класса в пакете класса protected.
//
//Модификатор доступа protected в Java не может быть применен к классу и интерфейсам. Методы и поля могут быть объявлены как protected,
// однако методы и поля в интерфейсе не могут быть объявлены как protected.
//
//Доступ protected дает подклассу возможность использовать вспомогательный метод или переменную, предотвращая неродственный класс от попыток использовать их.
@CodeReview(approved = true)
class ProtectedClass {

    private String title;
    private String author;

}
