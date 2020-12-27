package javaguru.sunday.student_kristina_sutugina.lesson_9.level_4;

import java.util.Objects;

class Test {
    public static void main(String[] args) {
        Test victim = new Test();
        victim.fraudDetectorRuleOneIsPokemonTest();
        victim.fraudDetectorRuleOneIsNotPokemonTest();
       victim.fraudDetectorRuleTwoAmountExceedsTest();
        victim.fraudDetectorRuleTwoAmountIsFineTest();
        victim.fraudDetectorRuleThreeIsSydneyTest();
        victim.fraudDetectorRuleThreeIsNotSydneyTest();
        victim.isJamaicaTest();
        victim.isNotJamaicaTest();
        victim.fraudDetectorRuleFourIsJamaicaTest();
        victim.fraudDetectorRuleFourIsNotJamaicaTest();
        victim.fraudDetectorRuleFiveIsFraudGermanyTest();
        victim.fraudDetectorRuleFiveIsNotFraudGermanyTest();
    }

    public void fraudDetectorRuleOneIsPokemonTest(){
        Trader trader = new Trader("Pokemon", "Moscow");
        Transaction t = new Transaction(trader, 10);
        FraudRule1 fraud = new FraudRule1("Fraud Detector Test Rule One");
        if(Objects.equals(fraud.isFraud(t), true)){
            System.out.println("FraudDetectorTestRuleOne, Pokemon is caught");
        } else{
            System.out.println("FraudDetectorTestRuleOne, it's not Pokemon");
        }
    }
    public void fraudDetectorRuleOneIsNotPokemonTest(){
        Trader trader = new Trader("Alex", "Moscow");
        Transaction t = new Transaction(trader, 1);
        FraudRule1 fraud = new FraudRule1("Fraud Detector Test Rule One");
        if(Objects.equals(fraud.isFraud(t), true)){
            System.out.println("FraudDetectorTestRuleOne, Pokemon is caught");
        } else{
            System.out.println("FraudDetectorTestRuleOne, it's not Pokemon");
        }
    }
   public void fraudDetectorRuleTwoAmountExceedsTest(){
        Trader trader = new Trader("Alex", "Moscow");
        Transaction t = new Transaction(trader, 1000001);
       FraudRule2 fraud = new FraudRule2("Fraud Detector Test Rule Two");
        if(Objects.equals(fraud.isFraud(t), true)){
            System.out.println("FraudDetectorTestRuleTwo, amount exceeds allowed maximum amount");
        } else{
            System.out.println("FraudDetectorTestRuleTwo, amount is allowed");
        }
    }
    public void fraudDetectorRuleTwoAmountIsFineTest(){
        Trader trader = new Trader("Alex", "Moscow");
        Transaction t = new Transaction(trader, 1000000);
        FraudRule2 fraud = new FraudRule2("Fraud Detector Test Rule Two");
        if(Objects.equals(fraud.isFraud(t), true)){
            System.out.println("FraudDetectorTestRuleTwo, amount exceeds allowed maximum amount");
        } else{
            System.out.println("FraudDetectorTestRuleTwo, amount is allowed");
        }
    }
    public void fraudDetectorRuleThreeIsSydneyTest(){
        Trader trader = new Trader("Pokemon", "Sydney");
        Transaction t = new Transaction(trader, 10);
        FraudRule3 fraud = new FraudRule3("Fraud Detector Test Rule Three");
        if(Objects.equals(fraud.isFraud(t), true)){
            System.out.println("FraudDetectorTestRuleThree, Sydney is caught");
        } else{
            System.out.println("FraudDetectorTestRuleThree, it's not Sydney");
        }
    }
    public void fraudDetectorRuleThreeIsNotSydneyTest(){
        Trader trader = new Trader("Pokemon", "Moscow");
        Transaction t = new Transaction(trader, 10);
        FraudRule3 fraud = new FraudRule3("Fraud Detector Test Rule Three");
        if(Objects.equals(fraud.isFraud(t), true)){
            System.out.println("FraudDetectorTestRuleThree, Sydney is caught");
        } else{
            System.out.println("FraudDetectorTestRuleThree, it's not Sydney");
        }
    }
    public void isJamaicaTest(){
        FraudRule4 fraud = new FraudRule4("Fraud Detector Test Rule Four");
        String city = "Old Harbour";
        if(Objects.equals(fraud.isJamaica(city), true)){
            System.out.println("isJamaicaTest, Jamaica is caught");
        }else{
            System.out.println("isJamaicaTest, it's not Jamaica");
        }
    }
    public void isNotJamaicaTest(){
        FraudRule4 fraud = new FraudRule4("Fraud Detector Test Rule Four");
        String city = "Moscow";
        if(Objects.equals(fraud.isJamaica(city), true)){
            System.out.println("isNotJamaicaTest, Jamaica is caught");
        }else{
            System.out.println("isNotJamaicaTest, it's not Jamaica");
        }
    }
    public void fraudDetectorRuleFourIsJamaicaTest(){
        Trader trader = new Trader("Pokemon", "Linstead");
        Transaction t = new Transaction(trader, 10);
        FraudRule4 fraud = new FraudRule4("Fraud Detector Test Rule Four");
        if(Objects.equals(fraud.isFraud(t), true)){
            System.out.println("FraudDetectorTestRuleFour, Jamaica is caught");
        } else{
            System.out.println("FraudDetectorTestRuleFour, it's not Jamaica");
        }
    }
    public void fraudDetectorRuleFourIsNotJamaicaTest(){
        Trader trader = new Trader("Pokemon", "Moscow");
        Transaction t = new Transaction(trader, 10);
        FraudRule4 fraud = new FraudRule4("Fraud Detector Test Rule Four");
        if(Objects.equals(fraud.isFraud(t), true)){
            System.out.println("FraudDetectorTestRuleFour, Jamaica is caught");
        } else{
            System.out.println("FraudDetectorTestRuleFour, it's not Jamaica");
        }
    }
    public void fraudDetectorRuleFiveIsFraudGermanyTest(){
        Trader trader = new Trader("Pokemon", "Munich");
        Transaction t = new Transaction(trader, 1001);
        FraudRule5 fraud = new FraudRule5("Fraud Detector Test Rule Five");
        if(Objects.equals(fraud.isFraud(t), true)){
            System.out.println("FraudDetectorTestRuleFive, client is from Germany and the amount is >1000");
        } else{
            System.out.println("FraudDetectorTestRuleFive, this client is fine");
        }
    }
    public void fraudDetectorRuleFiveIsNotFraudGermanyTest(){
        Trader trader = new Trader("Pokemon", "Moscow");
        Transaction t = new Transaction(trader, 1001);
        FraudRule5 fraud = new FraudRule5("Fraud Detector Test Rule Five");
        if(Objects.equals(fraud.isFraud(t), true)){
            System.out.println("FraudDetectorTestRuleFive, client is from Germany and the amount is >1000");
        } else{
            System.out.println("FraudDetectorTestRuleFive, this client is fine");
        }
    }
}
