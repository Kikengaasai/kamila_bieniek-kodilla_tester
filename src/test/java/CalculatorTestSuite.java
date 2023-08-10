import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(2.5, 3.5);
        assertEquals(6.0, result, 0.001);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        double result = calculator.sub(5.0, 2.5);
        assertEquals(2.5, result, 0.001);
    }

    @Test
    public void testCircleArea() {
        Calculator calculator = new Calculator();
        double result = calculator.circleArea(2.0);
        assertEquals(12.5663706144, result, 0.001);
    }

    @Test
    public void testCirclePerimeter() {
        Calculator calculator = new Calculator();
        double result = calculator.circlePerimeter(2.0);
        assertEquals(12.5663706144, result, 0.001);
    }
}