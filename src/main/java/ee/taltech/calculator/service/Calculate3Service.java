package ee.taltech.calculator.service;

import ee.taltech.calculator.dto.Calculate3Result;
import ee.taltech.calculator.util.EvenCalculatorUtil;
import ee.taltech.calculator.util.MaxOfOddCalculatorUtil;
import ee.taltech.calculator.util.SumCalculatorUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Calculate3Service {

    public Calculate3Result calculate3(List<Integer> numbers) {

        Calculate3Result result = new Calculate3Result();
        result.setMaxOfOdd(MaxOfOddCalculatorUtil.maxOfOddNumber(numbers));
        result.setSum(SumCalculatorUtil.sumNumbers(numbers));
        result.setEven(EvenCalculatorUtil.evenNumbers(numbers));
        return result;
    }
}
