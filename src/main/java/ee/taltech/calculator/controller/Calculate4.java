package ee.taltech.calculator.controller;

import ee.taltech.calculator.dto.Calculate4Result;
import ee.taltech.calculator.service.Calculate4Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("calculator")
@AllArgsConstructor
public class Calculate4 {
    private final Calculate4Service calculate4Service;

    @GetMapping("calculate4")
    public Calculate4Result calculate4(@RequestParam List<Integer> numbers) {
        return calculate4Service.calculate4(numbers);
    }

}
