package main.java.javaguru.sunday.student_liana_shirmane.lesson_9.level_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//task33
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

    @Override
    public String toString() {
        return "Trader (" +
                "fullName='" + fullName + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ')';
    }
}