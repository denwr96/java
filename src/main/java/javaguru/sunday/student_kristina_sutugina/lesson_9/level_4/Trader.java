package javaguru.sunday.student_kristina_sutugina.lesson_9.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//33
@CodeReview(approved = true)
class Trader {

    private String fullName;
    private String city;

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "fullName='" + fullName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}





