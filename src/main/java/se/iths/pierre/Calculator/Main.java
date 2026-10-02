package se.iths.pierre.Calculator;


public class Main {

    static void main(String[] args) {


        Calculator calculator = new Calculatorimpl();

        int result = calculator.multiply(26, 47);
        IO.println(result);


    }


}
