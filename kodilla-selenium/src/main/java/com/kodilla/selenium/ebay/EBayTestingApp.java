package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/patry/IdeaProjects/patrycja_kilian-kodilla_tester/chromedriver-win64/chromedriver-win64/chromedriver.exe");  	// [1]
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.ebay.com/");

        WebElement inputField = webDriver.findElement(By.name("_nkw"));
        inputField.sendKeys("Laptop");
        inputField.submit();
    }
}
