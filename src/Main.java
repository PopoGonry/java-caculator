public class Main {
    public static void main(String[] args) {

        Calculator calc_add = new Calculator();
        calc_add.setNumbers(10, 3);
        calc_add.add();
        calc_add.displayResult("+");

        AdvancedCalculator calc_mul = new AdvancedCalculator();
        calc_mul.setNumbers(10, 3);
        calc_mul.multiply();
        calc_mul.displayResult("*");

        AdvancedCalculator calc_div = new AdvancedCalculator();
        calc_div.setNumbers(10, 3);
        calc_div.divide();
        calc_div.displayResult("/");

        ScientifiCalculator calc_sci = new ScientifiCalculator();
        calc_sci.setNumbers(5);
        calc_sci.factorial();
        calc_sci.displayResult("!");

    }
}