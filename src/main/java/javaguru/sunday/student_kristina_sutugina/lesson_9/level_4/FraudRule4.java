package main.java.javaguru.sunday.student_kristina_sutugina.lesson_9.level_4;

import java.util.Objects;

//Task_20
//Task_27
class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }
    boolean isJamaica(String city){
        String [] jamaica = {"Kingston", "Portmore", "Spanish Town", "Montego Bay",
                "May Pen", "Mandeville", "Old Harbour", "Savanna-la-Mar", "Ocho Rios", "Linstead"};
        for(int i =0; i<jamaica.length; i++){
            if(jamaica[i].equalsIgnoreCase(city)){
                return true;
            }
        }
        return false;
    }

    public boolean isFraud(Transaction t) {
        if (Objects.equals(isJamaica(t.getTrader().getCity()), true)) {
            return true;
        }

        return false;
    }

}