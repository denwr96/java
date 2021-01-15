package javaguru.sunday.student_konstantin_shestakov.lesson_14.level_3_to_6;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class TransactionAnalysisServiceTest {

    @Test
    public void findTransactionsIn2011() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        TransactionTestData transaction = new TransactionTestData();

        List<Transaction> result = victim.findTransactionsIn2011(transaction.getTransactions());

        assertEquals(2, result.size());
    }

    @Test
    public void findTransactionsByYear2011ShouldBe2() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        TransactionTestData transaction = new TransactionTestData();

        List<Transaction> result = victim.findTransactionsByYear(transaction.getTransactions(), 2011);

        assertEquals(2, result.size());
    }

    @Test
    public void findTransactionsByYear2012ShouldBe4() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        TransactionTestData transaction = new TransactionTestData();

        List<Transaction> testTransactions = transaction.getTransactions();

        List<Transaction> result = victim.findTransactionsByYear(testTransactions, 2012);

        assertEquals(4, result.size());
    }

    @Test
    public void sortTransactionsByValueLowToHigh() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        TransactionTestData transaction = new TransactionTestData();

        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400),
                new Transaction(new Trader("Mario", "Milan"), 2012, 700),
                new Transaction(new Trader("Mario", "Milan"), 2012, 710),
                new Transaction(new Trader("Alan", "Cambridge"), 2012, 950),
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000)
        );
        List<Transaction> testTransactions = transaction.getTransactions();

        List<Transaction> result = victim.sortTransactionsByValueLowToHigh(testTransactions);

        assertEquals(expectedResult,result);
    }

    @Test
    public void sortTransactionsByValueHighToLow() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        TransactionTestData transaction = new TransactionTestData();

        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000),
                new Transaction(new Trader("Alan", "Cambridge"), 2012, 950),
                new Transaction(new Trader("Mario", "Milan"), 2012, 710),
                new Transaction(new Trader("Mario", "Milan"), 2012, 700),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400),
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300)
        );
        List<Transaction> testTransactions = transaction.getTransactions();

        List<Transaction> result = victim.sortTransactionsByValueHighToLow(testTransactions);

        assertEquals(expectedResult,result);
    }

    @Test
    public void findTransactionsByYearAndSortThemByValueLowToHigh() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        TransactionTestData transaction = new TransactionTestData();

        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400)
        );
        List<Transaction> testTransactions = transaction.getTransactions();

        List<Transaction> result = victim.findTransactionsByYearAndSortThemByValueLowToHigh(testTransactions, 2011);

        assertEquals(expectedResult,result);
    }

    @Test
    public void findYearsInWhichTransactionsWereMade() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        TransactionTestData transaction = new TransactionTestData();

        List<Integer> expectedResult = Arrays.asList(2011, 2011, 2012, 2012, 2012, 2012);

        List<Transaction> testTransactions = transaction.getTransactions();

        List<Integer> result = victim.findYearsInWhichTransactionsWereMade(testTransactions);
        Collections.sort(result);

        assertEquals(expectedResult, result);
    }

    @Test
    public void findUniqYearsInWhichTransactionsWereMade() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        TransactionTestData transaction = new TransactionTestData();

        List<Integer> expectedResult = Arrays.asList(2011, 2012);

        List<Transaction> testTransactions = transaction.getTransactions();

        List<Integer> result = victim.findUniqYearsInWhichTransactionsWereMade(testTransactions);
        Collections.sort(result);

        assertEquals(expectedResult, result);
    }

    @Test
    public void findUniqTradersForTransactions() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        TransactionTestData transaction = new TransactionTestData();

        List<Trader> expectedResult = Arrays.asList(
                new Trader("Raoul", "Cambridge"),
                new Trader("Alan", "Cambridge"),
                new Trader("Mario", "Milan"),
                new Trader("Brian", "Cambridge")
        );
        List<Transaction> testTransactions = transaction.getTransactions();

        List<Trader> result = victim.findUniqTradersForTransactions(testTransactions);

        assertEquals(expectedResult.size(), result.size());
        assertTrue(expectedResult.contains(new Trader("Raoul", "Cambridge")) &&
                expectedResult.contains(new Trader("Alan", "Cambridge")) &&
                expectedResult.contains(new Trader("Mario", "Milan")) &&
                expectedResult.contains(new Trader("Brian", "Cambridge")));
    }

    @Test
    public void findUniqCitiesForTransactions() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        TransactionTestData transaction = new TransactionTestData();

        List<String> expectedResult = Arrays.asList("Cambridge", "Milan");

        List<Transaction> testTransactions = transaction.getTransactions();

        List<String> result = victim.findUniqCitiesForTransactions(testTransactions);

        assertEquals(expectedResult.size(), result.size());
        assertTrue(expectedResult.contains("Cambridge") && expectedResult.contains("Milan"));
    }

    @Test
    public void findUniqTradersNamesFromCityCambridge() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        TransactionTestData transaction = new TransactionTestData();

        List<String> expectedResult = Arrays.asList("Raoul", "Alan", "Brian");

        List<Transaction> testTransactions = transaction.getTransactions();

        List<String> result = victim.findUniqTradersNamesFromCity(testTransactions, "Cambridge");

        assertEquals(expectedResult.size(), result.size());
        assertTrue(expectedResult.contains("Raoul")
                && expectedResult.contains("Alan")
                && expectedResult.contains("Brian"));
    }

    @Test
    public void findUniqTradersNamesFromCityMilan() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        TransactionTestData transaction = new TransactionTestData();

        List<String> expectedResult = Arrays.asList("Mario");

        List<Transaction> testTransactions = transaction.getTransactions();

        List<String> result = victim.findUniqTradersNamesFromCity(testTransactions, "Milan");

        assertEquals(expectedResult, result);
    }

    @Test
    public void checkIfThereAreTraderInCityMilan() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        TransactionTestData transaction = new TransactionTestData();

        List<Transaction> testTransactions = transaction.getTransactions();

        assertTrue(victim.checkIfThereAreTraderInCity(testTransactions, "Milan"));
    }

    @Test
    public void checkIfThereAreTraderInCityRiga() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        TransactionTestData transaction = new TransactionTestData();

        assertFalse(victim.checkIfThereAreTraderInCity(transaction.getTransactions(), "Riga"));
    }

    @Test
    public void findMaxTransactionValue() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        TransactionTestData transaction = new TransactionTestData();

        List<Transaction> testTransactions = transaction.getTransactions();

        assertEquals(Optional.of(1000), victim.findMaxTransactionValue(testTransactions));
    }

    @Test
    public void findMinTransactionValue() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        TransactionTestData transaction = new TransactionTestData();

        List<Transaction> testTransactions = transaction.getTransactions();

        assertEquals(Optional.of(300), victim.findMinTransactionValue(testTransactions));
    }

    @Test
    public void sortTradersNames() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        TransactionTestData transaction = new TransactionTestData();

        List<Transaction> testTransactions = transaction.getTransactions();

        assertEquals("Alan, Brian, Mario, Raoul", victim.sortTradersNames(testTransactions));
    }

    @Test
    public void sortTransactionCityNames() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        TransactionTestData transaction = new TransactionTestData();

        List<Transaction> testTransactions = transaction.getTransactions();

        assertEquals("Cambridge, Milan", victim.sortTransactionCityNames(testTransactions));
    }
}