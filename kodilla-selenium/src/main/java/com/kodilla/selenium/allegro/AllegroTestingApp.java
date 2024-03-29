package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kamil\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement categoryCombobox = driver.findElement(By.className("mr3m_1"));
        categoryCombobox.click();
        WebElement electronicsCategory = driver.findElement(By.xpath("//span[contains(text(), 'Elektronika')]"));
        electronicsCategory.click();

        WebElement searchField = driver.findElement(By.cssSelector("input[type='search']"));
        searchField.sendKeys("Mavic mini");

        WebElement searchButton = driver.findElement(By.xpath("//button[contains(text(), 'Szukaj')]"));
        searchButton.click();

        List<WebElement> productCards = driver.findElements(By.cssSelector("section > article"));

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section > article")));

    }
}
