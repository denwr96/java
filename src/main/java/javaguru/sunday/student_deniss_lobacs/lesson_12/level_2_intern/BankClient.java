package javaguru.sunday.student_deniss_lobacs.lesson_12.level_2_intern;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class BankClient {

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
