import java.util.LinkedHashMap;
import java.util.List;

// 계산기 v2.0 관련 클래스
// https://github.com/PopoGonry/java-caculator/issues/1

public class AdvancedCalculator extends Calculator {

    // 계산기 v2.0 곱하기 기능 개발 완료
    // https://github.com/PopoGonry/java-caculator/issues/2
    @Override
    public int multiply() {
        result = num1 * num2;
        return result;
    }


    // 계산기 v2.0 나누기 기능 개발 완료
    // https://github.com/PopoGonry/java-caculator/issues/3
    @Override
    public int divide() {
        if (num2 == 0) {
            System.out.println("Divide by zero");
            result = Integer.MAX_VALUE;
            return result;
        }

        result = num1 / num2;
        return result;
    }


}
