package ee.taltech.calculator.util;

import org.apache.commons.collections4.CollectionUtils;

import lombok.NoArgsConstructor;
import java.util.List;
import java.util.OptionalInt;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class MinOddCalculatorUtil {

    public static Integer minOddNumber(List<Integer> numbers) {

        if (CollectionUtils.isEmpty(numbers)) {

            return null;
        }

        OptionalInt result = numbers.stream()
                .filter(n -> n % 2 != 0).mapToInt(v -> v).min();
        return result.isPresent()  ? result.getAsInt() : null ;
    }
}
