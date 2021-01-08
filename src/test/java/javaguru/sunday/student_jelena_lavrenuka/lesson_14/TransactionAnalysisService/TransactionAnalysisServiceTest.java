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

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TransactionAnalysisServiceTest {
    private TransactionAnalysisService victim;

    @Before
    public void setUp() {
        victim = new TransactionAnalysisService();
    }

    public List<Transaction> getTransactions() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        return transactions;
    }

    @Test
    public void testFindTransactionsIn2011() {
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400)
        );
        List<Transaction> actualResult = victim.findTransactionsIn2011(getTransactions());
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindTransactionsByYear1() {
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000),
                new Transaction(new Trader("Mario", "Milan"), 2012, 710),
                new Transaction(new Trader("Mario", "Milan"), 2012, 700),
                new Transaction(new Trader("Alan", "Cambridge"), 2012, 950)
        );
        List<Transaction> actualResult = victim.findTransactionsByYear(getTransactions(), 2012);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindTransactionsByYear2() {
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400)
        );
        List<Transaction> actualResult = victim.findTransactionsByYear(getTransactions(), 2011);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFilterByValueAscending() {
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400),
                new Transaction(new Trader("Mario", "Milan"), 2012, 700),
                new Transaction(new Trader("Mario", "Milan"), 2012, 710),
                new Transaction(new Trader("Alan", "Cambridge"), 2012, 950),
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000)
        );
        List<Transaction> actualResult = victim.filterByValueAscending(getTransactions());
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFilterByValueDescending() {
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000),
                new Transaction(new Trader("Alan", "Cambridge"), 2012, 950),
                new Transaction(new Trader("Mario", "Milan"), 2012, 710),
                new Transaction(new Trader("Mario", "Milan"), 2012, 700),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400),
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300)
        );
        List<Transaction> actualResult = victim.filterByValueDescending(getTransactions());
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindTransactionsIn2011AscendingSort() {
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400)
        );
        List<Transaction> actualResult = victim.findTransactionsIn2011AscendingSort(getTransactions());
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindTransactionsYears() {
        List<Integer> expectedResult = Arrays.asList(2011,2012,2011,2012,2012,2012);
        List<Integer> actualResult = victim.findTransactionsYears(getTransactions());
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindTransactionsUniqueYears() {
        List<Integer> expectedResult = Arrays.asList(2011,2012);
        List<Integer> actualResult = victim.findTransactionsUniqueYears(getTransactions());
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindUniqueTradersNames() {
        List<String> expectedResult = Arrays.asList("Brian","Raoul","Mario","Alan");
        List<String> actualResult = victim.findUniqueTradersNames(getTransactions());
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindUniqueTradersCities() {
        List<String> expectedResult = Arrays.asList("Brian","Raoul","Alan");
        List<String> actualResult = victim.findTradersFromCambridge(getTransactions());
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindTraderNamesFromCity1() {
        List<String> expectedResult = Arrays.asList("Brian","Raoul","Alan");
        List<String> actualResult = victim.findTraderNamesFromCity(getTransactions(),"Cambridge");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindTraderNamesFromCity2() {
        List<String> expectedResult = Collections.singletonList("Mario");
        List<String> actualResult = victim.findTraderNamesFromCity(getTransactions(),"Milan");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsAnyTraderBasedOnMilan() {
        boolean actualResult = victim.isAnyTraderBasedOnMilan(getTransactions());
        assertTrue(actualResult);
    }

    @Test
    public void testIsAnyTraderBasedOnCity1() {
        boolean actualResult = victim.isAnyTraderBasedOnCity(getTransactions(), "Milan");
        assertTrue(actualResult);
    }

    @Test
    public void testIsAnyTraderBasedOnCity2() {
        boolean actualResult = victim.isAnyTraderBasedOnCity(getTransactions(), "Cambridge");
        assertTrue(actualResult);
    }

    @Test
    public void testFindBiggestTransactionValue() {
        Optional<Integer> expectedResult = Optional.of(1000);
        Optional<Integer> actualResult = victim.findBiggestTransactionValue(getTransactions());
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testFindSmallestTransactionValue() {
        Optional<Integer> expectedResult = Optional.of(300);
        Optional<Integer> actualResult = victim.findSmallestTransactionValue(getTransactions());
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testSortTraderNames() {
        String expectedResult = "Alan,Brian,Mario,Raoul";
        String actualResult = victim.sortTraderNames(getTransactions());
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testSortTraderCities() {
        String expectedResult = "Cambridge,Milan";
        String actualResult = victim.sortTraderCities(getTransactions());
        assertEquals(expectedResult,actualResult);
    }
}

