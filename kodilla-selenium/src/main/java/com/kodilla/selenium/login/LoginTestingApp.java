package com.kodilla.selenium.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/patry/IdeaProjects/patrycja_kilian-kodilla_tester/chromedriver-win64/chromedriver-win64/chromedriver.exe");  	// [1]
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://kodilla.com/pl/test/login");

        WebElement emailField = webDriver.findElement(By.xpath("//html/body/section/form/div[1]/input"));
        emailField.sendKeys("test@kodilla.com");
        WebElement passwordField = webDriver.findElement(By.xpath("//html/body/section/form/div[2]/input"));
        passwordField.sendKeys("kodilla123");
        WebElement submitField = webDriver.findElement(By.xpath("//html/body/section/form/button"));
        submitField.submit();

    }
}
