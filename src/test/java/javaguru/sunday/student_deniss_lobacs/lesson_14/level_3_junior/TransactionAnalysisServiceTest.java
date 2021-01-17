package javaguru.sunday.student_deniss_lobacs.lesson_14.level_3_junior;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    private TransactionAnalysisService victim;
    private final TransactionsList transactions = new TransactionsList();

    @Before
    public void setUp() {
        victim = new TransactionAnalysisService();
    }

    @Test
    public void testFindTransactionsIn2011_Success() {
        assertEquals(2, victim.findTransactionsIn2011(transactions.getTransactions()).size());
    }

    @Test
    public void testFindTransactionsBy2011Year_Success() {
        assertEquals(2, victim.findTransactionsByYear(transactions.getTransactions(), 2011).size());
    }

    @Test
    public void testFindTransactionsBy2012Year_Success() {
        assertEquals(4, victim.findTransactionsByYear(transactions.getTransactions(), 2012).size());
    }

    @Test
    public void testSortTransactionsByValue_Success() {
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400),
                new Transaction(new Trader("Mario", "Milan"), 2012, 700),
                new Transaction(new Trader("Mario", "Milan"), 2012, 710),
                new Transaction(new Trader("Alan", "Cambridge"), 2012, 950),
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000)
        );

        List<Transaction> actualResult = Arrays.asList(
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400),
                new Transaction(new Trader("Mario", "Milan"), 2012, 700),
                new Transaction(new Trader("Mario", "Milan"), 2012, 710),
                new Transaction(new Trader("Alan", "Cambridge"), 2012, 950),
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000)
        );

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortTransactionsByValueReversed_Success() {
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000),
                new Transaction(new Trader("Alan", "Cambridge"), 2012, 950),
                new Transaction(new Trader("Mario", "Milan"), 2012, 710),
                new Transaction(new Trader("Mario", "Milan"), 2012, 700),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400),
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300)
        );

        assertEquals(expectedResult, victim.sortTransactionsByValueReversed(transactions.getTransactions()));
    }

    @Test
    public void testSortTransactionsIn2011YearByValueReversed_Success() {
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400)

        );

        assertEquals(expectedResult, victim.sortTransactionsIn2011YearByValue(transactions.getTransactions()));
    }

    @Test
    public void testFindTransactionsYears_Success() {
        List<Integer> expectedResult = Arrays.asList(2011, 2012, 2011, 2012, 2012, 2012);
        assertEquals(expectedResult, victim.findTransactionsYears(transactions.getTransactions()));
    }

    @Test
    public void testFindUniqueTransactionsYears_Success() {
        Set<Integer> expectedResult = new HashSet<>(Arrays.asList(2011, 2012));
        assertEquals(expectedResult, victim.findUniqueTransactionsYears(transactions.getTransactions()));
    }

    @Test
    public void testFindUniqueTradersNames_Success() {
        Set<String> expectedResult = new HashSet(Arrays.asList("Raoul", "Mario", "Alan", "Brian"));
        assertEquals(expectedResult, victim.findUniqueTradersNames(transactions.getTransactions()));
    }

    @Test
    public void testFindUniqueTradersCities_Success() {
        Set<String> expectedResult = new HashSet(Arrays.asList("Cambridge", "Milan"));
        assertEquals(expectedResult, victim.findUniqueTradersCities(transactions.getTransactions()));
    }

    @Test
    public void testFindTradersFromCambridge_Success() {
        List<String> expectedResult = Arrays.asList("Alan", "Brian", "Raoul");
        assertEquals(expectedResult, victim.findTradersNamesFromCambridge(transactions.getTransactions()));
    }

    @Test
    public void testFindTraderNamesFromCity_Success() {
        List<String> expectedResult = Arrays.asList("Mario");
        assertEquals(expectedResult, victim.findTraderNamesFromCity(transactions.getTransactions(), "Milan"));
    }

    @Test
    public void testIsTraderFromMilan_Success() {
        boolean actualResult = victim.isTraderBasedOnMilan(transactions.getTransactions());
        assertTrue(actualResult);
    }

    @Test
    public void testIsAnyTraderBasedOnCity_Success() {
        boolean actualResult = victim.isAnyTraderBasedOnCity(transactions.getTransactions(), "Cambridge");
        assertTrue(actualResult);
    }

    @Test
    public void findMaxTransactionValue_Success() {
        Optional<Integer> actualResult = victim.findMaxTransactionValue(transactions.getTransactions());
        assertEquals(Optional.of(1000),actualResult);
    }

    @Test
    public void testFindMinTransactionValue_Success() {
        Optional<Integer> actualResult = victim.findMinTransactionValue(transactions.getTransactions());
        assertEquals(Optional.of(300),actualResult);
    }

    @Test
    public void testSortedTradersNames_Success() {
        String expectedResult = "Alan,Brian,Mario,Raoul";
        String actualResult = victim.sortedTradersNames(transactions.getTransactions());
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testSortedTradersCities_Success() {
        String expectedResult = "Cambridge,Milan";
        String actualResult = victim.sortedTradersCities(transactions.getTransactions());
        assertEquals(expectedResult,actualResult);
    }

}