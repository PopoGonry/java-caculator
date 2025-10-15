import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AdvancedCalculatorTest {

    AdvancedCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new AdvancedCalculator();
        calculator.setNumbers(9, 3);
    }

    // 곱셈 단위 테스트 개발 - #4
    // https://github.com/PopoGonry/java-caculator/issues/4
    @Test
    void multiply() {
        assertEquals(27, calculator.multiply());
    }

    // 나눗셈 단위 테스트 개발 - #5
    // https://github.com/PopoGonry/java-caculator/issues/5
    @Test
    void divide() {
        assertEquals(3, calculator.divide());
    }
}