package main.java.javaguru.sunday.student_artjom_proshkin.lesson_9.level_5_middle;


//Task_28
class FraudRule5Test {

    public static void main(String[] args) {
        FraudRule5Test test = new FraudRule5Test();
        test.moreThanThousandFromGermanyTest();
        test.lessThanThousandFromGermanyTest();
    }

    FraudRule5 victim = new FraudRule5("GermanyMoreThousandFraud");

    void moreThanThousandFromGermanyTest (){
        Trader testTrader = new Trader("Van Beethoven","Bonn", "Germany");
        Transaction testTransaction = new Transaction(testTrader,1001);
        checkResult(victim.isFraud(testTransaction),"moreThanThousandFromGermanyTest");
    }

    void lessThanThousandFromGermanyTest (){
        Trader testTrader = new Trader("Van Beethoven","Bonn", "Germany");
        Transaction testTransaction = new Transaction(testTrader,999);
        checkResult(!victim.isFraud(testTransaction),"lessThanThousandFromGermanyTest");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILED !");
        }
    }
}
