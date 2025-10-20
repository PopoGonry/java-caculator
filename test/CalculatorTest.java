import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
        calc.setNumbers(20, 2);
    }

    @Test
    void add() {
        assertEquals(22 , calc.add());
    }

    @Test
    void subtract() {
        assertEquals(18, calc.subtract());
    }

    @Test
    void multiply() {
        assertEquals(40, calc.multiply());
    }

    @Test
    void divide() {
        assertEquals(10, calc.divide());
    }
}