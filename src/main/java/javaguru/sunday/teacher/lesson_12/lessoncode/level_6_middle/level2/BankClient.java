package javaguru.sunday.teacher.lesson_12.lessoncode.level_6_middle.level2;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankClient that = (BankClient) o;
        return Objects.equals(uid, that.uid) &&
                Objects.equals(fullName, that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, fullName);
    }

    @Override
    public String toString() {
        return "BankClient{" +
                "uid='" + uid + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
