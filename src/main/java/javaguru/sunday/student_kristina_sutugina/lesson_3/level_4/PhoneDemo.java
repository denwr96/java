package javaguru.sunday.student_kristina_sutugina.lesson_3.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }
}
