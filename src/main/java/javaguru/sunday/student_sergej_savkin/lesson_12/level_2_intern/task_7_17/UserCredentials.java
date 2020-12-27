package main.java.javaguru.sunday.student_sergej_savkin.lesson_12.level_2_intern.task_7_17;

import java.util.List;

//task8

class UserCredentials {

    private List<Role> roles;

    UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }
}
