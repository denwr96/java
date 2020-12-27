package javaguru.sunday.student_jelena_lavrenuka.lesson_8.task_3;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Person {
    private String fullName;
    private int age;
    private String address;

    public Person(String fullName, int age, String address) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }
}
