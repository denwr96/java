package javaguru.sunday.student_liana_shirmane.lesson_12.level_2;
//task9

import java.util.Objects;

class BankClient {

    private String uid;
    private String fullName;

   BankClient(String uid, String fullName){
       this.uid = uid;
       this.fullName = fullName;
   }

    public String getFullName() {
        return fullName;
    }

    public String getUid() {
        return uid;
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


}