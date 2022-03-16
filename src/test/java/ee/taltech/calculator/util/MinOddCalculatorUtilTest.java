package ee.taltech.calculator.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinOddCalculatorUtilTest {

    @Test
    @DisplayName("MinOdd result is null or empty")
    void minOddIsNullOrEmpty() {

        assertNull(MinOddCalculatorUtil.minOddNumber(null));
        assertNull(MinOddCalculatorUtil.minOddNumber(List.of()));
    }

    @Test
    @DisplayName("MinOdd result is correct")
    void longestStringTest() {

        assertEquals(3, MinOddCalculatorUtil.minOddNumber(List.of(4, 3, 29, 29)));
        assertEquals(-15, MinOddCalculatorUtil.minOddNumber(List.of(-5, 4, 1, -15 )));
    }
}
