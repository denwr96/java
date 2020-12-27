package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface MyList {
    void increaseLength (int[] array);
    //увеличение длины массива

    void differentDataType();
    // возможность хранить в массиве денные разных типов

    void addNewObj();
    // добавлять объект(ы) в массив без указания индекса
}
