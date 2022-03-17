package ee.taltech.calculator.util;

import lombok.NoArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class OddsCalculatorUtil {
    public static List<Integer> oddNumbers(List<Integer> numbers){
        if (CollectionUtils.isEmpty(numbers)) {
            return null;
        }
        return numbers.stream().filter(i -> i % 2 != 0).distinct().sorted().collect(Collectors.toList());
    }
}