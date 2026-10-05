package se.iths.pierre.Calculator;


public class Main {

    static void main(String[] args) {


        Calculator calculator = new Calculatorimpl();


        int result = calculator.multiply(5, 4);
        IO.println(result);


        int tal1 = 22;
        int tal2 = 33;
        int addition = calculator.add(tal1, tal2);
        IO.println(addition);

        int tal3 = 10;
        int tal4 = 8;
        int subtraction = calculator.subtract(tal3, tal4);
        IO.println(subtraction);

        try {
            int tal5 = 50;
            int tal6 = 2;
            int division = calculator.divide(tal5, tal6);

            IO.println(division);

        } catch (IllegalArgumentException e) {
        }
    }
}