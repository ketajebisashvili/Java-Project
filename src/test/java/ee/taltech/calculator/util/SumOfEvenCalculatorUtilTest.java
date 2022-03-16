package ee.taltech.calculator.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumOfEvenCalculatorUtilTest {

    @Test
    @DisplayName("sum of null or empty list is null")
    void SumOfIntegerIsNullOrEmpty() {

        assertNull(SumOfEvenCalculatorUtil.sum(null));
        assertNull(SumOfEvenCalculatorUtil.sum(List.of()));
    }

    @Test
    @DisplayName("sum of integers is correct")
    void longestStringTest() {

        assertEquals(4, SumOfEvenCalculatorUtil.sum(List.of(4, 3)));
        assertEquals(-2, SumOfEvenCalculatorUtil.sum(List.of(-6, 4, 1)));
    }
}
