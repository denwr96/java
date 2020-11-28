package main.java.javaguru.sunday.student_kristina_sutugina.lesson_9.level_4;


//Task_29
class FraudDetector {
    FraudRule [] fraudRule;
    public FraudDetector(FraudRule [] fraudRule) {
        this.fraudRule = fraudRule;
    }


    boolean isFraud(Transaction t) {
        for(int i = 0; i<fraudRule.length; i++){
            if(fraudRule[i].equals(t)){
                if(t.equals(true)){
                    return true;
                }else{
                    return false;
                }
            }

        }
        return false;
    }

}