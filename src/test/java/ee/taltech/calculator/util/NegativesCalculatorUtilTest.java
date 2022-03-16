package ee.taltech.calculator.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class NegativesCalculatorUtilTest {

    @Test
    @DisplayName("Negatives result null or empty")
    void negativesIsNullOrEmpty() {

        assertNull(NegativesCalculatorUtil.negativeNumbers(null));
        assertNull(NegativesCalculatorUtil.negativeNumbers(List.of()));
    }

    @Test
    @DisplayName("Negatives result is correct")
    void negativesRealTest() {

        assertEquals(List.of(-29, -23), NegativesCalculatorUtil.negativeNumbers(List.of(4, 3, -29, 29, -23, 4, 325)));
        assertEquals(List.of(-15, -5), NegativesCalculatorUtil.negativeNumbers(List.of(-5, 4, 1, -15, 0, 0 )));
    }
}
