package javaguru.sunday.student_nataliya_sinitsa.lesson9.level4task17;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task 17 --> Task 21
@CodeReview(approved = true)
class Trader {

    private String fullName;
    private String city;
    private String country;

    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

}
