import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// AdvancedCalculator 곱셈 기능을 활용하는 팩토리얼 연산 기능 #10 단위 테스트 #12
// https://github.com/PopoGonry/java-caculator/issues/12
class ScientifiCalculatorTest {

    ScientifiCalculator scientifiCalculator;

    @BeforeEach
    void setUp() {
        scientifiCalculator = new ScientifiCalculator();
    }
    @Test
    @DisplayName("양수가 입력되면, 정확한 결과값 반환")
    void factorial_withPositiveInput() {
        scientifiCalculator.setNumbers(5);
        assertEquals(120, scientifiCalculator.factorial());
    }


    @Test
    @DisplayName("음수가 입력되면, IllegalArgumentException 예외가 발생")
    void factorial_withNegativeInput() {
        scientifiCalculator.setNumbers(-1);
        assertThrows(IllegalArgumentException.class, scientifiCalculator::factorial);
    }

    @Test
    @DisplayName("0이 입력되면, 1을 반환")
    void factorial_withZeroInput() {
        scientifiCalculator.setNumbers(0);
        assertEquals(1, scientifiCalculator.factorial());
    }
}