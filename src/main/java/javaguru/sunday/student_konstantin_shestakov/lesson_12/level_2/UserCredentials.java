package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_2;


// Task 8, 15, 16

import java.util.List;

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
