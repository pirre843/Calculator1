package se.iths.pierre.Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculatortest {


    @Test
    void testMultiply() {
        Calculator calculator = new Calculatorimpl(); //Arrange
        int result = calculator.multiply(5, 4);
        assertEquals(20, result);

    }


}
