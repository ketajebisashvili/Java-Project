package ee.taltech.calculator.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EvenCalculatorUtilTest {

    @Test
    @DisplayName("Even result is null or empty")
    void evenResultNullOrEmpty(){
        assertNull(EvenCalculatorUtil.evenNumbers(null));
        assertNull(EvenCalculatorUtil.evenNumbers(List.of()));


    }

    @Test
    @DisplayName("Even result is correct")
    void evenResultTest(){
        assertEquals(List.of(-6,-2,0,2,4,6), EvenCalculatorUtil.evenNumbers(List.of(-6,-5,-2,-1,0,2,4,6,9)));
        assertEquals(List.of(-200,-126,-2,0,144,1266), EvenCalculatorUtil.evenNumbers(List.of(-200,-126,-2,0,144,144,1265,1266)));
    }
}
