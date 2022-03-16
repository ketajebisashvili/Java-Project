package ee.taltech.calculator.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Calculate1Result {

    private Integer minOdd;
    private Integer sumOfEven;
    private List <Integer> negatives;
}
