package tasks.test;

import org.junit.Test;
import tasks.task_2.quadraticEquation;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class quadraticEquationTest {

    @Test
    public void One_solution() {
        quadraticEquation equation = new quadraticEquation();
        List<Double> expected = new ArrayList<>();
        expected.add(0.0);
        assertEquals(expected, equation.decide(1,0,0));
    }

    @Test
    public void Two_solution() {
        quadraticEquation equation = new quadraticEquation();
        List<Double> expected = new ArrayList<>();
        expected.add(0.0);
        expected.add(1.0);
        assertEquals(expected, equation.decide(1.0,-1.0,0));
    }

    @Test
    public void No_solution() {
        quadraticEquation equation = new quadraticEquation();
        List<Double> expected = new ArrayList<>();
        assertEquals(expected, equation.decide(1.0,-1.0,1));
    }
}