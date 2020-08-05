package tasks.test;

import org.junit.Test;
import tasks.task_1.Calculator;
import static org.junit.Assert.*;


public class CalculatorTest {

    @Test
    public void sum() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.sum(5,5));
        assertEquals(-10,calculator.sum(-5,-5));
        assertEquals(8,calculator.sum(10,-2));
    }

    @Test
    public void sub() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.sub(5,5));
        assertEquals(10, calculator.sub(5,-5));
        assertEquals(0, calculator.sub(-5,-5));
    }

    @Test
    public void mul() {
        Calculator calculator = new Calculator();
        assertEquals(25, calculator.mul(5,5));
        assertEquals(-25, calculator.mul(5,-5));
        assertEquals(25, calculator.mul(-5,-5));
    }

    @Test
    public void div() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.div(5,5));
        assertEquals(3, calculator.div(6,2));
    }
}