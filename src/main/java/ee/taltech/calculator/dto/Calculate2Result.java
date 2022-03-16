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
public class Calculate2Result {

    private List<Integer> signReversed;
    private List<Integer> negatives;
    private Double averageOfOdd;
}
