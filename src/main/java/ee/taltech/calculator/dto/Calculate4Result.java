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
public class Calculate4Result {
    private List<Integer> odds;
    private Integer maxOdd;
    private Double averageOfNegatives;
}
