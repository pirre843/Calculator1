package se.iths.pierre.Calculator;

public class Calculatorimpl implements Calculator {


    static void main() {
    }

    @Override
    public int multiply(int a, int b) {

        return a * b;

    }

    @Override
    public int add(int a, int b) {
        return a + b;

    }

    @Override
    public int divide(int a, int b) {
        return a / b;

    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}
