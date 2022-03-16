package ee.taltech.calculator.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageOfOddUtilTest {

    @Test
    @DisplayName("Average result is empty or null")
    void ResultNullOrEmpty() {

        assertNull(AverageOfOddUtil.averageOfOdd(null));
        assertNull(AverageOfOddUtil.averageOfOdd(List.of()));
    }

    @Test
    @DisplayName("Average of odd is correct")
    void resultIsCorrect() {

        assertEquals(5, AverageOfOddUtil.averageOfOdd(List.of(3,7)));
        assertEquals(11, AverageOfOddUtil.averageOfOdd(List.of(2,4,6,8,13,15,9,7)));
    }
}

