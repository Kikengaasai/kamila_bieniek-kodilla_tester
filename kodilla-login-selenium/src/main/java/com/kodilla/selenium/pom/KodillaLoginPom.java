package com.kodilla.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaLoginPom {

    @FindBy(css = "input[type='email']")
    WebElement emailField;

    @FindBy(css = "input[type='password']")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(), 'Log in')]")
    WebElement loginButton;

    WebDriver driver;

    public KodillaLoginPom() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kamil\\Selenium-drivers\\Chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        PageFactory.initElements(driver, this);

        driver.navigate().to("https://kodilla.com/pl/test/login");
    }

       public void login() {
           emailField.sendKeys("kamila.bieniek@gmail.com");
           passwordField.sendKeys("1234");
           loginButton.click();
       }


       public void close(){
        driver.close();
    }
}




