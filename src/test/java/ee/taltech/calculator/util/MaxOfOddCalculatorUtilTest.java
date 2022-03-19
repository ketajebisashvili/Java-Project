package ee.taltech.calculator.util;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxOfOddCalculatorUtilTest {

    @Test
    @DisplayName("MaxOdd result is null or empty")
    void maxOddIsNullOrEmpty(){
        assertNull(MaxOfOddCalculatorUtil.maxOfOddNumber(null));
        assertNull(MaxOfOddCalculatorUtil.maxOfOddNumber(List.of()));
    }

    @Test
    @DisplayName("MaxOdd result is correct")
    void longestStringTest(){
        assertEquals(31, MaxOfOddCalculatorUtil.maxOfOddNumber(List.of(-8,-4,2,3,6,8,31,31)));
        assertEquals(1, MaxOfOddCalculatorUtil.maxOfOddNumber(List.of(-1265,-50,0,1 )));
    }
}
