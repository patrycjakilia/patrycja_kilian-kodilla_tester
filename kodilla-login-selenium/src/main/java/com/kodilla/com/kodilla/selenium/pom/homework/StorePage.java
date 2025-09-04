package com.kodilla.com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class StorePage {
    @FindBy(css = "input[name='search']")
    WebElement searchField;

    @FindBy(css = ".element")
    List<WebElement> products;

    WebDriver driver;

    public StorePage(WebDriver driver) {
        System.setProperty("webdriver.chrome.driver", "/Users/patry/IdeaProjects/patrycja_kilian-kodilla_tester/chromedriver-win64/chromedriver-win64/chromedriver.exe");  	// [1]
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.navigate().to("https://kodilla.com/pl/test/store");
    }

    public void search(String keyword) {
        searchField.clear();
        searchField.sendKeys(keyword);
    }

    public int getResultsCount() {
        return products.size();
    }
}
