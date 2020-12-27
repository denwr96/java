package javaguru.sunday.student_nataliya_sinitsa.lesson8.level2.task7;

import javaguru.sunday.teacher.annotations.CodeReview;

//вызов конструктора родительского класса через "super"
@CodeReview(approved = true)
class Child extends Father {

    String schoolName;

    public Child(String childName, String surname, String schoolName, String eyeColour, String hairColour, int childAge) {
        super(surname, eyeColour, hairColour);
        this.name = childName;
        this.schoolName = schoolName;
        this.age = childAge;
    }

    @Override
    public void getInfoAboutPerson() {
        System.out.println("Name is: " + name);
        System.out.println("Surname is: " + surname);
        System.out.println("School name is: " + schoolName);
        System.out.println("Eye colour is: " + eyeColour);
        System.out.println("Hair colour is: " + hairColour);
        System.out.println("Age is: " + age);
    }
}
