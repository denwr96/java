package javaguru.sunday.student_sergej_savkin.lesson_9.level_4_junior.task_17_33;

import javaguru.sunday.teacher.annotations.CodeReview;

//task17
//task18
//task19
//task20
//task21
//task29
//task30
//task31
//task32
//task33
@CodeReview(approved = true)
class FraudDetectorTest {

    public static void main(String[] args) {

        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();

        fraudDetectorTest.isFraudTestOne();
        System.out.println();
        fraudDetectorTest.isFraudTestTwo();
        System.out.println();
        fraudDetectorTest.isFraudTestThree();
        System.out.println();
        fraudDetectorTest.isFraudTestFour();
        System.out.println();
        fraudDetectorTest.isFraudTestFive();
        System.out.println();
        fraudDetectorTest.isFraudTestSix();
        System.out.println();
        fraudDetectorTest.isFraudTestSeven();
        System.out.println();
        fraudDetectorTest.isFraudTestEight();
        System.out.println();
        fraudDetectorTest.isFraudTestNine();

    }

    FraudRule[] fraudRules = new FraudRule[5];

    public FraudRule[] setFraudRules(FraudRule[] fraudRules) {
        fraudRules[0] = new FraudRule1("BanPokemon");
        fraudRules[1] = new FraudRule2("moreThan1000000");
        fraudRules[2] = new FraudRule3("BanSidney");
        fraudRules[3] = new FraudRule4("BanJamaica");
        fraudRules[4] = new FraudRule5("BanGermany");
        return fraudRules;
    }

    public void isFraudTestOne() {
        FraudDetector test = new FraudDetector(setFraudRules(fraudRules));
        System.out.println("TestOne - expected rulename - BanPokemon");
        test.isFraud(new Transaction(new Trader("Pokemon","Riga", "Latvia"), 100), fraudRules);

    }

    public void isFraudTestTwo() {
        FraudDetector test = new FraudDetector(setFraudRules(fraudRules));
        System.out.println("TestTwo - no rulename");
        test.isFraud(new Transaction(new Trader("notPokemon","Riga", "Latvia"), 100), fraudRules);
    }

    public void isFraudTestThree() {
        FraudDetector test = new FraudDetector(setFraudRules(fraudRules));
        System.out.println("TestThree - expected Rulename - moreThan1000000");
        test.isFraud(new Transaction(new Trader("notPokemon","Riga", "Latvia"), 1000001), fraudRules);
    }

    public void isFraudTestFour() {
        FraudDetector test = new FraudDetector(setFraudRules(fraudRules));
        System.out.println("TestFour - no rulename");
        test.isFraud(new Transaction(new Trader("notPokemon","Riga", "Latvia"), 100000), fraudRules);
    }

    public void isFraudTestFive() {
        FraudDetector test = new FraudDetector(setFraudRules(fraudRules));
        System.out.println("TestFive - expected Rulename - BanSidney");
        test.isFraud(new Transaction(new Trader("notPokemon","Sidney", "Australia"), 100000), fraudRules);
    }

    public void isFraudTestSix() {
        FraudDetector test = new FraudDetector(setFraudRules(fraudRules));
        System.out.println("TestSix - no rulename");
        test.isFraud(new Transaction(new Trader("notPokemon","Melbourne", "Australia"), 100000), fraudRules);
    }

    public void isFraudTestSeven() {
        FraudDetector test = new FraudDetector(setFraudRules(fraudRules));
        System.out.println("TestSeven - expected Rulename - BanJamaica");
        test.isFraud(new Transaction(new Trader("notPokemon","Kingston", "Jamaica"), 100000), fraudRules);
    }

    public void isFraudTestEight() {
        FraudDetector test = new FraudDetector(setFraudRules(fraudRules));
        System.out.println("TestEight - no rulename");
        test.isFraud(new Transaction(new Trader("notPokemon","Riga", "Latvia"), 100000), fraudRules);
    }

    public void isFraudTestNine() {
        FraudDetector test = new FraudDetector(setFraudRules(fraudRules));
        System.out.println("TestNine - expected Rulename - BanGermany");
        test.isFraud(new Transaction(new Trader("notPokemon","Berlin", "Germany"), 100000), fraudRules);
    }

}
