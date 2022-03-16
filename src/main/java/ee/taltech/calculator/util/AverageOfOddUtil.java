package ee.taltech.calculator.util;

import lombok.NoArgsConstructor;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class AverageOfOddUtil {

    public static Double averageOfOdd(List<Integer> numbers) {

        if(numbers == null  || numbers.isEmpty()) {

            return null;
        }
        double avg =numbers.stream()
                .mapToDouble(d -> d)
                .filter(i -> i % 2 != 0)
                .average()
                .orElse(0);

        return (double) Math. round(avg * 100) / 100;
    }
}
