import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTestSuite {
    @Test
    void testValidateOlderAndTaller() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String expectedResult = "User is older than 30 and taller than 160cm";
        Application application = new Application("Adam", 40.5, 178);
        application.validate();

        assertEquals(expectedResult, outputStream.toString().trim());
    }

    @Test
    void testValidateYoungerOrShorter() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Application application = new Application("John", 25, 150);
        application.validate();

        assertEquals("User is 30 (or younger) or 160cm (or shorter)", outputStream.toString().trim());
    }

    @Test
    void testValidateNullName() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Application application = new Application(null, 40, 170);
        application.validate();

        assertEquals("", outputStream.toString());
    }


}