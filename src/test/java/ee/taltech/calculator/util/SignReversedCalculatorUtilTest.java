package ee.taltech.calculator.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SignReversedCalculatorUtilTest {

    @Test
    @DisplayName("result null or empty")
    void IsNullOrEmpty() {

        assertNull(SignReversedCalculatorUtil.reversedNumbers(null));
        assertNull(SignReversedCalculatorUtil.reversedNumbers(List.of()));
    }

    @Test
    @DisplayName(" result is correct")
    void RealTest() {

        assertEquals(List.of(-4, -3, 29,-29,23,-4,-325), SignReversedCalculatorUtil.reversedNumbers(List.of(4, 3, -29, 29, -23, 4, 325)));
    }
}
