package ee.taltech.calculator.service;

import ee.taltech.calculator.dto.Calculate1Result;
import ee.taltech.calculator.util.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Calculate1Service {

    public Calculate1Result calculate1(List<Integer> numbers) {

        Calculate1Result result = new Calculate1Result();
        result.setMinOdd(MinOddCalculatorUtil.minOddNumber(numbers));
        result.setSumOfEven(SumOfEvenCalculatorUtil.sum(numbers));
        result.setNegatives(NegativesCalculatorUtil.negativeNumbers(numbers));
        return result;
    }
}