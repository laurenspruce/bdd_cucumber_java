import com.qa.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperatorUnitTests {

    @Test
    public void add_operator_results_in_addition()  {

        //Arrange
        int a = 2;
        int b = 4;
        Number expectedAnswer = 6.0;
        Calculator calc = new Calculator();

        //Act
        calc.push(a);
        calc.push(b);
        calc.push("+");
        Number actualAnswer = calc.value();

        //Assert
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void unknown_operator_results_in_addition() {

        //Arrange
        int a = 2;
        int b = 4;
        Number expectedAnswer = 6.0;
        Calculator calc = new Calculator();

        //Act
        calc.push(a);
        calc.push(b);
        calc.push("?");
        Number actualAnswer = calc.value();

        //Assert
        assertEquals(expectedAnswer, actualAnswer);

    }

}
