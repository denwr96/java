package javaguru.sunday.student_nataliya_sinitsa.lesson9.level5task22;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task 33
@CodeReview(approved = true)
class FraudDetectorV2Demo {

    public static void main(String[] args) {
        FraudDetectorV2Demo test = new FraudDetectorV2Demo();

        test.shouldBeFalseByTraderNameAmountCity();
        System.out.println(" ");
        test.shouldBeTrueByAmount();
        System.out.println(" ");
        test.shouldBeTrueByTraderName();
    }

    public void shouldBeFalseByTraderNameAmountCity() {
        Trader testTraderOne = new Trader("Poke", "London", "UK");
        Transaction testTransactionOne = new Transaction(testTraderOne, 100);
        FraudDetectorV2 victimOne = new FraudDetectorV2();
        victimOne.isFraud(testTransactionOne);
    }

    public void shouldBeTrueByTraderName() {
        Trader testTraderTwo = new Trader("Poke", "London", "UK");
        Transaction testTransactionTwo = new Transaction(testTraderTwo, 1000001);
        FraudDetectorV2 victimTwo = new FraudDetectorV2();
        victimTwo.isFraud(testTransactionTwo);
    }

    public void  shouldBeTrueByAmount() {
        Trader testTraderThree = new Trader("Poke", "Sidney", "Australia");
        Transaction testTransactionThree = new Transaction(testTraderThree, 100);
        FraudDetectorV2 victimThree = new FraudDetectorV2();
        victimThree.isFraud(testTransactionThree);
    }

}
