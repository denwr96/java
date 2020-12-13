package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_9.SingleResponsibilityPrinciple;

// lesson_9 task_17
// lesson_9 task_18
// lesson_9 task_19
// lesson_9 task_20
// lesson_9 task_21
// lesson_9 task_22
// lesson_9 task_23
// lesson_9 task_24
// lesson_9 task_25
// lesson_9 task_26
// lesson_9 task_27
// lesson_9 task_28
// lesson_9 task_29
// lesson_9 task_30
// lesson_9 task_31

import java.util.ArrayList;
import java.util.List;

class FraudDetector {

    FraudRule[] fraudRules = new FraudRule[5];

    public FraudDetector() {
        fraudRules[0] = new FraudRule1("Fraud Rule 1");
        fraudRules[1] = new FraudRule2("Fraud Rule 2");
        fraudRules[2] = new FraudRule3("Fraud Rule 3");
        fraudRules[3] = new FraudRule4("Fraud Rule 4");
        fraudRules[4] = new FraudRule5("Fraud Rule 5");
    }


    List<FraudDetectionResult> isFraud(Transaction t) {
        List<FraudDetectionResult> result = new ArrayList<>();
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                result.add(new FraudDetectionResult(true, fraudRule.getRuleName()));
            }
        }
        return result;
    }
}

//    boolean isFraud(Transaction t) {
//        String name = t.getTrader().getFullName();
//        int amount = t.getAmount();
//        String city = t.getTrader().getCity();
//        String country = t.getTrader().getCountry();
//        if(name.equals("Pokemon")) {
//            return true;
//        }else if(amount >= 1000000){
//            return true;
//        }else if(city.equals("Sydney")){
//            return true;
//        }else if(country.equals("Jamaica")){
//            return true;
//        }else return country.equals("Germany") && amount > 1000;
//    }

