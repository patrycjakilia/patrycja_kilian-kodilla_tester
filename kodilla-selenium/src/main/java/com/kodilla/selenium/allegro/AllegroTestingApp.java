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

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/patry/IdeaProjects/patrycja_kilian-kodilla_tester/chromedriver-win64/chromedriver-win64/chromedriver.exe");  	// [1]
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://allegro.pl/");

        WebDriverWait wait = new WebDriverWait(webDriver, 20);

        WebElement acceptCookies = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-role='accept-consent']")));
        acceptCookies.click();

        WebElement categoryCombo = webDriver.findElement(By.cssSelector("select[data-role='search-scope-select']"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(4);

        WebElement searchField = webDriver.findElement( By.cssSelector("input[type='search']"));
        searchField.sendKeys("Mavic min");

        WebElement searchButton = webDriver.findElement(By.cssSelector("button[type='submit']"));
        searchButton.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("section article")));
        List<WebElement> element = webDriver.findElements(By.cssSelector("section article"));

        List<WebElement> products = webDriver.findElements(By.cssSelector("section > article"));

        for (WebElement product : products) {
            System.out.println(product.getText());
        }

    }
}
