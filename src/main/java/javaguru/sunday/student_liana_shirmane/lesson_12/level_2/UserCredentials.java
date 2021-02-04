package javaguru.sunday.student_liana_shirmane.lesson_12.level_2;
//task8
//task15
//task16

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;

@CodeReview(approved = true)
class UserCredentials {

    private List<Role> roles;

    public UserCredentials(List<Role> roles){
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }

}

