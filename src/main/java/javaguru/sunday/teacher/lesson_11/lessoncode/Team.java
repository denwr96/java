package main.java.javaguru.sunday.teacher.lesson_11.lessoncode;

import java.util.Objects;

public class Team {

    private String city;
    private String department;

    public Team(String city, String department) {
        this.city = city;
        this.department = department;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(city, team.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city);
    }

    @Override
    public String toString() {
        return "Team{" +
                "city='" + city + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
