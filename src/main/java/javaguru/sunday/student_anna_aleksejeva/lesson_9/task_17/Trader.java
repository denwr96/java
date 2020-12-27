package javaguru.sunday.student_anna_aleksejeva.lesson_9.task_17;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Trader {

    private String fullName;
    private String city;
    private String companyName;

    public Trader(String fullName, String city, String companyName) {
        this.fullName = fullName;
        this.city = city;
        this.companyName = companyName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCompanyName() {
        return companyName;
    }
}

