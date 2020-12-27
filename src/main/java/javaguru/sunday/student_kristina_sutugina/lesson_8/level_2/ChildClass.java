package javaguru.sunday.student_kristina_sutugina.lesson_8.level_2;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_7
@CodeReview(approved = true)
class ChildClass extends ParentClass{
    String childName;
    public ChildClass(String motherName, String fatherName, String childName) {
        super(motherName, fatherName);
        this.childName = childName;
    }

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass("Anna", "Joseph", "Alex");

    }
}
