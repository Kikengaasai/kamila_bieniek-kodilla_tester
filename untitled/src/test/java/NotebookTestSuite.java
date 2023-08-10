import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class NotebookTestSuite {


    @Test
    void testCheckPrice() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Notebook notebook = new Notebook(800, 500, 2010);
        notebook.checkPrice();
        assertEquals("This notebook is very cheap.", outputStream.toString().trim());

        outputStream.reset();

        notebook = new Notebook(1200, 700, 1995);
        notebook.checkPrice();
        assertEquals("The price is good", outputStream.toString().trim());

        outputStream.reset();

        notebook = new Notebook(400, 300, 2022);
        notebook.checkPrice();
        assertEquals("This notebook is very cheap.", outputStream.toString().trim());

        System.setOut(System.out);
    }

    @Test
    void testCheckWeight() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Notebook notebook = new Notebook(800, 500, 2010);
        notebook.checkWeight();
        assertEquals("This device is not very heavy.", outputStream.toString().trim());

        notebook = new Notebook(1200, 700, 1995);
        notebook.checkWeight();
        assertEquals("This device is heavy.", outputStream.toString().trim());

        notebook = new Notebook(400, 300, 2022);
        notebook.checkWeight();
        assertEquals("This device is lightweight.", outputStream.toString().trim());

        System.setOut(System.out);
    }

    @Test
    void testCheckYearAndPrice() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream, true, StandardCharsets.UTF_8);
        System.setOut(printStream);

        Notebook notebook = new Notebook(800, 500, 2010);
        notebook.checkYearAndPrice();
        assertEquals("Kupuj, ani sie nie zastanawiaj", outputStream.toString().trim());

        outputStream.reset();

        notebook = new Notebook(1200, 700, 1995);
        notebook.checkYearAndPrice();
        assertEquals("Zastanow sie nad wyborem", outputStream.toString().trim());

        outputStream.reset();

        notebook = new Notebook(400, 300, 2022);
        notebook.checkYearAndPrice();
        assertEquals("Kupuj, ani sie nie zastanawiaj", outputStream.toString().trim());

        System.setOut(System.out);
    }
}
