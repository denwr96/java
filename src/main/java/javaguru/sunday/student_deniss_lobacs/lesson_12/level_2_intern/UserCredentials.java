package javaguru.sunday.student_deniss_lobacs.lesson_12.level_2_intern;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;
@CodeReview(approved = true)
public class UserCredentials {
    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

}
