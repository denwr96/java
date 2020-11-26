package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_4;

// Task 17

class Trader {

    private String fullName;
    private String city;
    private String country;

    Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    Trader(String country) {
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
