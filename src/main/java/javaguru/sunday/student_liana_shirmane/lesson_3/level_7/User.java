package main.java.javaguru.sunday.student_liana_shirmane.lesson_3.level_7;

class User {
    String login;
    String password;
    boolean block;
    int attempts;

User(String login, String password){
    this.login = login;
    this.password = password;
}

    void blockUser() {
        block = true;
    }

    int attepmtsDrop() {
        attempts = 0;
        return attempts;
    }
}