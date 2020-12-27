package javaguru.sunday.student_konstantin_shestakov.lesson_8.level_2.task_6;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task 5 - Java не поддерживает множественное наследование классов
// Task 6
@CodeReview(approved = true)
class Child extends Mother {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.motherMethod();
        child.fatherMethod();
    }

    public void childMethod(){
        Father father = new Father();
        father.fatherMethod();
    }
}

