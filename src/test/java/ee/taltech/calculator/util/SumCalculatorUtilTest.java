package ee.taltech.calculator.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorUtilTest {
    @Test
    @DisplayName("sum of null or empty list is null")
    void SumOfIntegerIsNullOrEmpty(){
        assertNull(SumCalculatorUtil.sumNumbers(null));
        assertNull(SumCalculatorUtil.sumNumbers(List.of()));
    }

    @Test
    @DisplayName("sum of integers is correct")
    void longestStringTest(){
        assertEquals(-9, SumCalculatorUtil.sumNumbers(List.of(-8,-6,0,2,3)));
        assertEquals(0, SumCalculatorUtil.sumNumbers(List.of(-5,-5,1,2,3,4)));
    }
}
