package javaguru.sunday.student_konstantin_shestakov.lesson_2.level_senior.super_task_5;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class CommentTypes {

    public static void main(String[] args) {

        //однострочный комментарий
        System.out.println("В Java присутствует несколько вариантов комментировать код:\n1) Построчный комментарий - начинается с '//' (вводить без '').\nПример:\n// Текст однострочного комментария\n");

        /* Начало многострочного комментария, строка 1
    строка 2
    ...
     завершающая строка многострочного комментария */
        System.out.println("2) Многострочный комментарий - начинается с '/*' заканчивается '*/' (вводить без '').\nПример: \n/* Начало многострочного комментария, строка 1\nстрока комментария 2\n...\nзавершающая строка комментария */");

    }

}
