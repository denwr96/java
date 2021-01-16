package javaguru.sunday.student_natalia_kochkina.lesson_12.level_2;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_9
@CodeReview(approved = true)
class BankClient {

    private String uid;
    private String fullName;

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }
}