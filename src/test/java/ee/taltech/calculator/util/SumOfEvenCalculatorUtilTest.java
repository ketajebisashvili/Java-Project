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

        assertEquals(20, SumOfEvenCalculatorUtil.sum(List.of(-2,0,1,2,5,6,6,8,9)));
        assertEquals(-86, SumOfEvenCalculatorUtil.sum(List.of(-100,-6,2,3,4,6,8)));
    }
}