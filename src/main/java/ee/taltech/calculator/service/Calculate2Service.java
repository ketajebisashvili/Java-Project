package ee.taltech.calculator.service;

import ee.taltech.calculator.dto.Calculate2Result;
import ee.taltech.calculator.util.*;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Calculate2Service {

    public Calculate2Result calculate2(List<Integer> numbers) {

        Calculate2Result result = new Calculate2Result();
        result.setSignReversed(SignReversedCalculatorUtil.reversedNumbers(numbers));
        result.setNegatives(NegativesCalculatorUtil.negativeNumbers(numbers));
        result.setAverageOfOdd(AverageOfOddUtil.averageOfOdd(numbers));
        return result;
    }
}
