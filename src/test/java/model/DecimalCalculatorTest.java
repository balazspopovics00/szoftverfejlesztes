package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalCalculatorTest {

    private DecimalCalculator underTest;

    @BeforeEach
    void setUp() {
        underTest = new DecimalCalculator();
    }

    @Test
    void binaryAdd() {
        assertEquals(10, underTest.decimalAdd(1, 3, 1, 2, 3));
        assertEquals(15, underTest.decimalAdd(3, 3, 1, 2, 6));
    }

}