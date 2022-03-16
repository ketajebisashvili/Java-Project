package ee.taltech.calculator.util;

import lombok.NoArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class SignReversedCalculatorUtil {

    public static List<Integer> reversedNumbers(List<Integer> numbers) {

        if (CollectionUtils.isEmpty(numbers)) {

            return null;
        }

        return numbers.stream().map(x -> x * (-1)).collect(Collectors.toList());
    }
}
