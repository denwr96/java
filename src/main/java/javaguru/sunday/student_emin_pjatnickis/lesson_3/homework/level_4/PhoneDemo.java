package javaguru.sunday.student_emin_pjatnickis.lesson_3.homework.level_4;

// level_4

import javaguru.sunday.teacher.annotations.CodeReview;

// Task_15
@CodeReview(approved = true)
public class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}
