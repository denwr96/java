package javaguru.sunday.student_konstantin_shestakov.lesson_6.level_x.super_task_1;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "+ за старание, но засчитать не могу. Работа не выполнена в ООП стиле.")
class InsurancePolicyPremiumCalculator {

    public static void main(String[] args) {
        Policy policyOne = new Policy("Vasily Major", true, true);
        policyOne.mainInsuranceObjects[0] = "Дом (улица 24-45)";
        policyOne.mainInsuranceObjectsPrice[0] = 300000;
        policyOne.mainInsuranceObjects[1] = "Квартира  (улица 15)";
        policyOne.mainInsuranceObjectsPrice[1] = 100000;
        policyOne.additionalInsuranceObjects[0] = "TV";
        policyOne.additionalInsuranceObjectsPrice[0] = 1000;
        policyOne.additionalInsuranceObjects[1] = "Холодильник";
        policyOne.additionalInsuranceObjectsPrice[1] = 1000;
        policyOne.printInfo();
        policyOne.calculate(policyOne);
        System.out.println("Policy price = " + policyOne.policyPrice);
        System.out.println("---------------------");

        Policy policyTwo = new Policy("Gennady Pasechnik", true, true);
        policyTwo.mainInsuranceObjects[0] = "Дом (улица 27-15)";
        policyTwo.mainInsuranceObjectsPrice[0] = 200000;
        policyTwo.mainInsuranceObjects[1] = "Квартира (улица 20)";
        policyTwo.mainInsuranceObjectsPrice[1] = 50000;
        policyTwo.additionalInsuranceObjects[0] = "Пасека";
        policyTwo.additionalInsuranceObjectsPrice[0] = 500;
        policyTwo.additionalInsuranceObjects[1] = "Печь";
        policyTwo.additionalInsuranceObjectsPrice[1] = 500;
        policyTwo.printInfo();
        policyTwo.calculate(policyTwo);
        System.out.println("Policy price = " + policyTwo.policyPrice);
        System.out.println("---------------------");
    }
}
