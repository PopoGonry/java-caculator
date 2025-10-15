public class ScientifiCalculator extends AdvancedCalculator {

    // 팩토리얼 연산에 필요한 한 개의 정수 입력 기능 #9
    // https://github.com/PopoGonry/java-caculator/issues/9
    public void setNumbers(int num1) {
        this.num1 = num1;
    }

    // AdvancedCalculator 곱셈 기능을 활용하는 팩토리얼 연산 기능 #10
    // https://github.com/PopoGonry/java-caculator/issues/10
    public int factorial() {
        if(num1 < 0) {
            throw new IllegalArgumentException("Can't factorial " + num1);
        }

        AdvancedCalculator calc = new AdvancedCalculator();
        result = 1;

        for(int i = 2; i <= num1; i++) {
            calc.setNumbers(result, i);
            result = calc.multiply();
        }

        return result;
    }

    // 팩토리얼 계산의 결과를 “숫자! = 결과” 의 형태로 화면에 출력하는 기능 #11
    // https://github.com/PopoGonry/java-caculator/issues/11
    @Override
    public void displayResult(String operator) {
        if(operator.equals("!")) {
            System.out.println(num1 + "! = " + result);
        }
        else {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

        }
    }
}
