package ee.taltech.calculator.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OddsCalculatorUtilTest
{

    @Test
    @DisplayName(" result is empty or null")
    void ResultNullOrEmpty()
    {
        assertNull(OddsCalculatorUtil.oddNumbers(null));
        assertNull(OddsCalculatorUtil.oddNumbers(List.of()));
    }

    @Test
    @DisplayName("odd numbers are  correct")
    void resultIsCorrect()
    {
        assertEquals(List.of(3,7), OddsCalculatorUtil.oddNumbers(List.of(3,7)));
        assertEquals(List.of(7,9,13,15), OddsCalculatorUtil.oddNumbers(List.of(2,4,6,8,13,15,9,7)));
    }
}
