package javaguru.sunday.student_konstantin_shestakov.lesson_14.level_3_to_6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class TransactionAnalysisService {

    public List<Transaction> findTransactionsIn2011(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .collect(toList());
    }

    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .collect(toList());
    }

    List<Transaction> sortTransactionsByValueLowToHigh(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(toList());
    }

    List<Transaction> sortTransactionsByValueHighToLow(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .collect(toList());
    }

    List<Transaction> findTransactionsByYearAndSortThemByValueLowToHigh(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(toList());
    }

    public List<Integer> findYearsInWhichTransactionsWereMade(List<Transaction> transactions) {
        return transactions.stream()
                .map(t -> t.getYear())
                .collect(toList());
    }

    public List<Integer> findUniqYearsInWhichTransactionsWereMade(List<Transaction> transactions) {
        return transactions.stream()
                .map(t -> t.getYear())
                .distinct()
                .collect(toList());
    }

    public List<Trader> findUniqTradersForTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(t -> t.getTrader())
                .distinct()
                .collect(toList());
    }

    public List<String> findUniqCitiesForTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(toList());
    }

    public List<String> findUniqTradersNamesFromCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .filter(t -> t.getTrader().getCity().equals(city))
                .map(t -> t.getTrader().getName())
                .distinct()
                .collect(toList());
    }

    boolean checkIfThereAreTraderInCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(city));
    }

    Optional<Integer> findMaxTransactionValue(List<Transaction> transactions) {
        return transactions.stream()
                .max(Comparator.comparing(Transaction::getValue))
                .map(Transaction::getValue);
    }

    Optional<Integer> findMinTransactionValue(List<Transaction> transactions) {
        return transactions.stream()
                .min(Comparator.comparing(Transaction::getValue))
                .map(Transaction::getValue);
    }

    String sortTradersNames(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(t -> t.getTrader().getName()))
                .map(t -> t.getTrader().getName())
                .distinct()
                .collect(Collectors.joining( ", " ));
    }

    String sortTransactionCityNames(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(t -> t.getTrader().getCity()))
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(Collectors.joining( ", " ));
    }

    public static void main(String[] args) {
        TransactionAnalysisService test = new TransactionAnalysisService();
        List<Transaction> transactions = Arrays.asList(
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000),
                new Transaction(new Trader("Alan", "Cambridge"), 2012, 950),
                new Transaction(new Trader("Mario", "Milan"), 2012, 710),
                new Transaction(new Trader("Mario", "Milan"), 2012, 700),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400),
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300)
        );

        System.out.println(test.sortTransactionCityNames(transactions));
    }

}
