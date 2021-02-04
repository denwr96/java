package javaguru.sunday.student_jelena_lavrenuka.lesson_15.FraudDetector_task_9;

import javaguru.sunday.teacher.annotations.CodeReview;

// lesson_15 task_9
@CodeReview(approved = true)
class FraudDetector {

    boolean isFraud(Trader trader) {
        return fraudTraderName(trader) || (fraudCity(trader));
    }

    private boolean fraudTraderName(Trader trader) {
        return trader.getFullName().equals("Pokemon");
    }

    private boolean fraudCity(Trader trader) {
        return trader.getCity().equals("Sidney");
    }
}
