package algorithms.implementations;

import org.junit.Test;

import static org.junit.Assert.*;

public class PairDifferenceCounterTest {
    @Test
    public void itShouldReturnACountOfThree() {
        int[] values = new int[] { 1, 5, 3, 4, 2 };
        assertEquals(3, PairDifferenceCounter.countPairsWithDifference(values, 2));
    }

    @Test
    public void itShouldReturnACountOfZero() {
        final int[] values = new int[] { 1, 2, 3, 4 };
        assertEquals(0, PairDifferenceCounter.countPairsWithDifference(values, -1111111));
    }

    @Test
    public void itShouldReturnACountOfThreeForRepeatingPairs() {
        int[] values = new int[] { 1, 3, 3, 3 };
        assertEquals(3, PairDifferenceCounter.countPairsWithDifference(values, 2));
    }
}