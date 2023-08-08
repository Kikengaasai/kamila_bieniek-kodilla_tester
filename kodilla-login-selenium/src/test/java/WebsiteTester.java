import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTester {
    public static void main(String[] args) {
        // Ustawienie ścieżki do chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kamil\\Selenium-drivers\\Chrome\\chromedriver.exe");

        // Inicjalizacja przeglądarki
        WebDriver driver = new ChromeDriver();

        // Przejście do strony
        driver.navigate().to("https://kodilla.com/pl/test/store");

        // Wyszukiwanie i testowanie fraz
        testKeyword(driver, "NoteBook");
        testKeyword(driver, "School");
        testKeyword(driver, "Brand");
        testKeyword(driver, "Business");
        testKeyword(driver, "Gaming");
        testKeyword(driver, "Powerful");

        // Zamknięcie przeglądarki
        driver.close();
    }

    private static void testKeyword(WebDriver driver, String keyword) {
        // Wyszukanie pola tekstowego
        WebElement searchInput = driver.findElement(By.cssSelector("input[name='q']"));

        // Wpisanie frazy do pola tekstowego
        searchInput.sendKeys(keyword);

        // Wyszukanie przycisku wyszukiwania
        WebElement searchButton = driver.findElement(By.cssSelector("button[type='submit']"));

        // Kliknięcie przycisku wyszukiwania
        searchButton.click();

        // Pobranie liczby wyników wyszukiwania
        WebElement resultsCount = driver.findElement(By.className("results-count"));

        // Weryfikacja, czy ilość zwróconych wyników odpowiada oczekiwanej wartości
        int expectedCount = getExpectedResultCount(keyword);
        int actualCount = Integer.parseInt(resultsCount.getText());
        if (actualCount == expectedCount) {
            System.out.println("Dla frazy '" + keyword + "' liczba wyników jest poprawna.");
        } else {
            System.out.println("Dla frazy '" + keyword + "' oczekiwano " + expectedCount +
                    " wyników, ale otrzymano " + actualCount + " wyników.");
        }

        // Weryfikacja, czy wyszukiwarka ignoruje wielkość znaków
        String lowercaseKeyword = keyword.toLowerCase();
        searchInput.clear();
        searchInput.sendKeys(lowercaseKeyword);
        searchButton.click();
        WebElement lowercaseResultsCount = driver.findElement(By.className("results-count"));
        int lowercaseActualCount = Integer.parseInt(lowercaseResultsCount.getText());
        if (lowercaseActualCount == expectedCount) {
            System.out.println("Dla frazy '" + lowercaseKeyword + "' liczba wyników jest poprawna (ignorowanie wielkości znaków).");
        } else {
            System.out.println("Dla frazy '" + lowercaseKeyword + "' oczekiwano " + expectedCount +
                    " wyników, ale otrzymano " + lowercaseActualCount + " wyników (ignorowanie wielkości znaków).");
        }

        // Wyczyszczenie pola tekstowego po zakończeniu testu
        searchInput.clear();
    }

    private static int getExpectedResultCount(String keyword) {

        if (keyword.equals("NoteBook")) {
            return 10;
        } else if (keyword.equals("School")) {
            return 5;
        } else if (keyword.equals("Brand")) {
            return 8;
        } else if (keyword.equals("Business")) {
            return 12;
        } else if (keyword.equals("Gaming")) {
            return 6;
        } else if (keyword.equals("Powerful")) {
            return 4;
        } else {
            return 0;
        }
    }
}