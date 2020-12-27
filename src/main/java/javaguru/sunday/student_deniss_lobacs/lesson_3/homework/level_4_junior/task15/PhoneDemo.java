package javaguru.sunday.student_deniss_lobacs.lesson_3.homework.level_4_junior.task15;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }
}
