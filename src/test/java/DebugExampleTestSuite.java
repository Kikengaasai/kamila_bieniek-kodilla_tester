import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DebugExampleTestSuite {

    @Test
    void testSumAndDisplay() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        int firstNumber = 22;
        int secondNumber = 10;
        DebugExample.sumAndDisplay(firstNumber, secondNumber);
        assertEquals("32", outputStream.toString().trim());
    }

    @Test
    void testSubtractAndDisplay() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        int firstNumber = 22;
        int secondNumber = 10;
        DebugExample.subtractAndDisplay(firstNumber, secondNumber);
        assertEquals("12", outputStream.toString().trim());
    }

}