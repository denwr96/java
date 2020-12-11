package main.java.javaguru.sunday.student_sergej_savkin.lesson_9.level_2_intern.task_8;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

/*
protected модификатор доступа означает, что он виден только внутри заключающего класса и
любых подклассов, а также в любом месте пакета заключающего класса. Ни одно тело не знает,
какие классы будут подклассом защищенного класса. Модификатор доступа protected имеет
смысл только при использовании во внетреннем классе
 */
@CodeReview(approved = true)
class ProtectedClass {

    private String title;
    private String author;


}
