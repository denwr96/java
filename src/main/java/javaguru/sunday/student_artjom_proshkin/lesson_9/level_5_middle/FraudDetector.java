package javaguru.sunday.student_artjom_proshkin.lesson_9.level_5_middle;


//Task_17, Task_18, Task_19, Task_20, Task_21
//Task_29,
// Task_32, Task_33
class FraudDetector {

    FraudRule[] fraudRules = new FraudRule[5];

    FraudDetector() {
        fraudRules[0] = new FraudRule1("PokemonFraud");
        fraudRules[1] = new FraudRule2("MoreThanMillionFraud");
        fraudRules[2] = new FraudRule3("SydneyFraud");
        fraudRules[3] = new FraudRule4("JamaicaFraud");
        fraudRules[4] = new FraudRule5("GermanyMoreThanThousandFraud");
    }

    FraudDetectionResult isFraud(Transaction transaction) {

        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(transaction)) {
                FraudDetectionResult fraudDetectionResult = new FraudDetectionResult(fraudRule.isFraud(transaction), fraudRule.getRuleName());
                System.out.println(transaction.toString());
                System.out.println(fraudRule.toString());
                return fraudDetectionResult;
            }
        }
        return null;
    }
}

