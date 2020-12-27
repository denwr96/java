package javaguru.sunday.student_nataliya_sinitsa.lesson8.level2.task7;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Father {

    String name;
    String surname;
    String occupation;
    String eyeColour;
    String hairColour;
    int age;

    Father (String surname, String eyeColour, String hairColour) {
        this.surname = surname;
        this.eyeColour = eyeColour;
        this.hairColour = hairColour;

    }

    public void getInfoAboutPerson() {
        System.out.println("Name is: " + name);
        System.out.println("Surname is: " + surname);
        System.out.println("Occupation is: " + occupation);
        System.out.println("Eye colour is: " + eyeColour);
        System.out.println("Hair colour is: " + hairColour);
        System.out.println("Age is: " + age);
    }

}
