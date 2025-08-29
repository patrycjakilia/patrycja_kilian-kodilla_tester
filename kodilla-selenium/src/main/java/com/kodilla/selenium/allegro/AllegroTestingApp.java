package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/patry/IdeaProjects/patrycja_kilian-kodilla_tester/chromedriver-win64/chromedriver-win64/chromedriver.exe");  	// [1]
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://allegro.pl/");

        WebDriverWait wait = new WebDriverWait(webDriver, 20);

        WebElement acceptCookies = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-role='accept-consent']")));
        acceptCookies.click();

        WebElement categoryCombo = webDriver.findElement(By.xpath("//select[@data-role='filters-dropdown']"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(4);

        WebElement searchField = webDriver.findElement( By.xpath("//input[@type='search']"));
        searchField.sendKeys("Mavic min");

        WebElement searchButton = webDriver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.click();
    }
}
