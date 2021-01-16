package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_2;


// Task 8, 15, 16

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;
@CodeReview(approved = true)
class UserCredentials {

    private List<Role> roles;

    UserCredentials(List<Role> roles){
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }
}
