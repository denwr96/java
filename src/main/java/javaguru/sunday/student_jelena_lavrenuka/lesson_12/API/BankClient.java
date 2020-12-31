package javaguru.sunday.student_jelena_lavrenuka.lesson_12.API;

import java.util.Objects;

class BankClient {


    private String uid;
    private String fullName;

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankClient that = (BankClient) o;
        return uid.equals(that.uid) &&
                fullName.equals(that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, fullName);
    }

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }
}
