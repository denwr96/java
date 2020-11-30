package main.java.javaguru.sunday.student_artjom_proshkin.lesson_9.level_5_middle;

//Task_17
//Task_33
class Trader {

    private String fullName;
    private String city;
    private String country;


    Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "{fullName ='" + fullName + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
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
