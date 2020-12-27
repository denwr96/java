package javaguru.sunday.student_jelena_lavrenuka.lesson_9.SingleResponsibilityPrinciple;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FraudRuleTests {
    public static void main(String[] args) {
        FraudRuleTests test = new FraudRuleTests();
        test.fraudRule1Test1();
        test.fraudRule1Test2();
        test.fraudRule2Test1();
        test.fraudRule2Test2();
        test.fraudRule3Test1();
        test.fraudRule3Test2();
        test.fraudRule4Test1();
        test.fraudRule4Test2();
        test.fraudRule5Test1();
        test.fraudRule5Test2();
        test.fraudRule5Test3();
    }

    public void fraudRule1Test1(){
        Trader myTrader = new Trader("Pokemon", "Latvia", "Riga");
        Transaction myTransaction = new Transaction(myTrader, 100);
        FraudRule1 victim = new FraudRule1("Rule1");
        boolean result = victim.isFraud(myTransaction);
        testResult(result, "fraudRule1Test1");
    }

    public void fraudRule1Test2(){
        Trader myTrader = new Trader("Janis", "Latvia", "Riga");
        Transaction myTransaction = new Transaction(myTrader, 100);
        FraudRule1 victim = new FraudRule1("Rule1");
        boolean result = victim.isFraud(myTransaction);
        testResultV2(result, "fraudRule1Test2");
    }

    public void fraudRule2Test1(){
        Trader myTrader = new Trader("Janis", "Latvia", "Riga");
        Transaction myTransaction = new Transaction(myTrader, 1000000);
        FraudRule2 victim = new FraudRule2("Rule2");
        boolean result = victim.isFraud(myTransaction);
        testResult(result, "fraudRule2Test1");
    }

    public void fraudRule2Test2(){
        Trader myTrader = new Trader("Janis", "Latvia", "Riga");
        Transaction myTransaction = new Transaction(myTrader, 100);
        FraudRule2 victim = new FraudRule2("Rule2");
        boolean result = victim.isFraud(myTransaction);
        testResultV2(result, "fraudRule2Test2");
    }

    public void fraudRule3Test1(){
        Trader myTrader = new Trader("Janis", "Australia", "Sydney");
        Transaction myTransaction = new Transaction(myTrader, 100);
        FraudRule3 victim = new FraudRule3("Rule3");
        boolean result = victim.isFraud(myTransaction);
        testResult(result, "fraudRule3Test1");
    }

    public void fraudRule3Test2(){
        Trader myTrader = new Trader("Janis", "Latvia", "Riga");
        Transaction myTransaction = new Transaction(myTrader, 100);
        FraudRule3 victim = new FraudRule3("Rule3");
        boolean result = victim.isFraud(myTransaction);
        testResultV2(result, "fraudRule3Test2");
    }

    public void fraudRule4Test1(){
        Trader myTrader = new Trader("Janis", "Jamaica", "Kingston");
        Transaction myTransaction = new Transaction(myTrader, 100);
        FraudRule4 victim = new FraudRule4("Rule4");
        boolean result = victim.isFraud(myTransaction);
        testResult(result, "fraudRule4Test1");
    }

    public void fraudRule4Test2(){
        Trader myTrader = new Trader("Janis", "Latvia", "Riga");
        Transaction myTransaction = new Transaction(myTrader, 100);
        FraudRule4 victim = new FraudRule4("Rule4");
        boolean result = victim.isFraud(myTransaction);
        testResultV2(result, "fraudRule4Test2");
    }

    public void fraudRule5Test1(){
        Trader myTrader = new Trader("John", "Germany", "Bremen");
        Transaction myTransaction = new Transaction(myTrader, 1000);
        FraudRule5 victim = new FraudRule5("Rule5");
        boolean result = victim.isFraud(myTransaction);
        testResultV2(result, "fraudRule5Test1");
    }

    public void fraudRule5Test2(){
        Trader myTrader = new Trader("John", "Germany", "Berlin");
        Transaction myTransaction = new Transaction(myTrader, 1001);
        FraudRule5 victim = new FraudRule5("Rule5");
        boolean result = victim.isFraud(myTransaction);
        testResult(result, "fraudRule5Test2");
    }

    public void fraudRule5Test3(){
        Trader myTrader = new Trader("John", "Sweden", "Stockholm");
        Transaction myTransaction = new Transaction(myTrader, 3000);
        FraudRule5 victim = new FraudRule5("Rule5");
        boolean result = victim.isFraud(myTransaction);
        testResultV2(result, "fraudRule5Test3");
    }

    public void testResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }

    public void testResultV2(boolean result, String testName) {
        if (!result) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }
}
