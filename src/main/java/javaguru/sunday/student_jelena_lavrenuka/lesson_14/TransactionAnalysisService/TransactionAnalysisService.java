package javaguru.sunday.student_jelena_lavrenuka.lesson_14.TransactionAnalysisService;
//lesson_14 task_18
//lesson_14 task_19
//lesson_14 task_20
//lesson_14 task_21
//lesson_14 task_22
//lesson_14 task_23
//lesson_14 task_24
//lesson_14 task_25
//lesson_14 task_26
//lesson_14 task_27
//lesson_14 task_28
//lesson_14 task_29
//lesson_14 task_30
//lesson_14 task_31
//lesson_14 task_32
//lesson_14 task_33
//lesson_14 task_34
//lesson_14 task_35
//lesson_14 task_36
//lesson_14 task_37
//lesson_14 task_38

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@CodeReview(approved = true)
class TransactionAnalysisService {

    public List<Transaction> findTransactionsIn2011(List<Transaction> transactions){
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .collect(Collectors.toList());
    }

    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Transaction> filterByValueAscending(List<Transaction> transactions){
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Transaction> filterByValueDescending(List<Transaction> transactions){
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    public List<Transaction> findTransactionsIn2011AscendingSort(List<Transaction> transactions){
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Integer> findTransactionsYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    public List<Integer> findTransactionsUniqueYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> findUniqueTradersNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> findUniqueTradersCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> findTradersFromCambridge(List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> findTraderNamesFromCity(List<Transaction> transactions, String cityToFind) {
        return transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals(cityToFind))
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .collect(Collectors.toList());
    }

    public boolean isAnyTraderBasedOnMilan(List<Transaction> transactions) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
    }

    public boolean isAnyTraderBasedOnCity(List<Transaction> transactions, String cityToCheck) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(cityToCheck));
    }

    public Optional<Integer> findBiggestTransactionValue(List<Transaction> transactions) {
        return transactions.stream()
                .max(Comparator.comparing(Transaction::getValue))
                .map(Transaction::getValue);
    }

    public Optional<Integer> findSmallestTransactionValue(List<Transaction> transactions) {
        return transactions.stream()
                .min(Comparator.comparing(Transaction::getValue))
                .map(Transaction::getValue);
    }

    public String sortTraderNames(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(transaction -> transaction.getTrader().getName()))
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .collect(Collectors.joining(","));
    }

    public String sortTraderCities(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(transaction -> transaction.getTrader().getCity()))
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.joining(","));
    }
}
