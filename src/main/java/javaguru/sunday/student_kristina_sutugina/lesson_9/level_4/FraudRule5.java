package main.java.javaguru.sunday.student_kristina_sutugina.lesson_9.level_4;

import java.util.Objects;
//Task_21
//Task_28
class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }
    boolean isGermany(String city){
        String [] germany = {"Berlin", "Hamburg", "Munich", "Cologne",
                "Frankfurt am Main", "Stuttgart", "Düsseldorf", "Dortmund", "Essen", "Leipzig"};
        for(int i =0; i<germany.length; i++){
            if(germany[i].equalsIgnoreCase(city)){
                return true;
            }
        }
        return false;
    }
    public boolean isFraud(Transaction t) {
        if(Objects.equals(isGermany(t.getTrader().getCity()), true)){
            if(t.getAmount()>1000){
                return true;
            }
        }
        return false;
    }

}
