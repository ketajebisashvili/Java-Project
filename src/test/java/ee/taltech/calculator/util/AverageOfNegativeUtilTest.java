package ee.taltech.calculator.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageOfNegativeUtilTest
{

    @Test
    @DisplayName("Average result is empty or null")
    void ResultNullOrEmpty()
    {
        assertNull(AverageOfNegativeUtil.averageOfNegatives(null));
        assertNull(AverageOfNegativeUtil.averageOfNegatives(List.of()));
    }

    @Test
    @DisplayName("Average of negatives is correct")
    void resultIsCorrect()
    {
        assertEquals(-4, AverageOfNegativeUtil.averageOfNegatives(List.of(-1,-7)));
        assertEquals(-7.75, AverageOfNegativeUtil.averageOfNegatives(List.of(2,4,6,8,-5,-15,-6,-5)));
    }
}

