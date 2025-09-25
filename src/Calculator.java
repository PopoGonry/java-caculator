public class Calculator {

    private int num1;
    private int num2;
    private int result;


    public void setNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        result = num1 + num2;
        return result;
    }

    public int subtract() {
        result = num1 - num2;
        return result;
    }
    public int multiply() {
        result = 0;
        for (int i = 0; i < num2; i++) {
            result += num1;
        }
        return result;
    }
    public int divide() {
        if (num2 == 0) {
            System.out.println("Divide by zero");
            result = Integer.MAX_VALUE;
            return result;
        }

        result = 0;
        int tempNum1 = num1;

        while(tempNum1 >= num2) {
            result++;
            tempNum1 -= num2;
        }

        return result;
    }

    public void displayResult(String operator) {
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
