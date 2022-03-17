package ee.taltech.calculator.service;

import ee.taltech.calculator.dto.Calculate1Result;
import ee.taltech.calculator.dto.Calculate4Result;
import ee.taltech.calculator.util.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Calculate4Service {


    public Calculate4Result calculate4(List<Integer> numbers) {
        Calculate4Result result = new Calculate4Result();
        result.setMaxOdd(MaxOddCalculatorUtil.maxOddNumber(numbers));
        result.setOdds(OddsCalculatorUtil.oddNumbers(numbers));
        result.setAverageOfNegatives(AverageOfNegativeUtil.averageOfNegatives(numbers));
        return result;
    }
}