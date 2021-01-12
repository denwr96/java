package javaguru.sunday.student_jelena_lavrenuka.lesson_15.FraudDetector_task_9;
// lesson_15 task_9
class FraudDetector {

    boolean isFraud(Trader trader) {
        return fraudTraderName(trader)
                ||
                (fraudCity(trader));
    }

    private boolean fraudTraderName(Trader trader) {
        return trader.getFullName().equals("Pokemon");
    }

    private boolean fraudCity(Trader trader) {
        return trader.getCity().equals("Sidney");
    }
}
