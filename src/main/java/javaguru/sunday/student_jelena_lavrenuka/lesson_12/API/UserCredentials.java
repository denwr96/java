package javaguru.sunday.student_jelena_lavrenuka.lesson_12.API;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;

@CodeReview(approved = true)
class UserCredentials {

    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }

    public List<Role> getRoles() {
        return roles;
    }
}

