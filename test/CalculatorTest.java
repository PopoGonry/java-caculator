import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc = new Calculator();
        calc.setNumbers(20, 10);

        assertEquals(30 , calc.add());
    }

    @Test
    void subtract() {
        Calculator calc = new Calculator();
        calc.setNumbers(20, 10);

        assertEquals(10, calc.subtract());
    }

    @Test
    void multiply() {
        Calculator calc = new Calculator();
        calc.setNumbers(10, 3);

        assertEquals(30, calc.multiply());
    }

    @Test
    void divide() {
        Calculator calc = new Calculator();
        calc.setNumbers(9, 3);

        assertEquals(3, calc.divide());
    }
}