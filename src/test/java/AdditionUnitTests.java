import com.qa.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionUnitTests {

    @Test
    public void add_int_1_and_int_2_returns_3(){

        //  Arrange
        int a = 1;
        int b = 2;
        Number expectedAnswer = 3.0;
        Calculator calc = new Calculator();

        //  Act
        calc.push(a);
        calc.push(b);
        calc.push("+");
        Number actualAnswer = calc.value();

        //  Assert
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void add_int_2_and_int_2_returns_4(){

        //  Arrange
        int a = 2;
        int b = 2;
        Number expectedAnswer = 4.0;
        Calculator calc = new Calculator();

        //  Act
        calc.push(a);
        calc.push(b);
        calc.push("+");
        Number actualAnswer = calc.value();

        //  Assert
        assertEquals(expectedAnswer, actualAnswer);

    }


}
