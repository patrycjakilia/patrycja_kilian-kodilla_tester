package com.kodilla.com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.*;

class StorePageTest {

    WebDriver driver;
    StorePage storePage;

    @BeforeEach
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        storePage = new StorePage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testSearchResults() {
        assertSearch("NoteBook", 2);
        assertSearch("School", 1);
        assertSearch("Brand", 1);
        assertSearch("Business", 0);
        assertSearch("Gaming", 2);
        assertSearch("Powerful", 0);
    }

    @Test
    public void testCaseInsensitiveSearch() {
        assertCaseInsensitive("NoteBook");
        assertCaseInsensitive("School");
        assertCaseInsensitive("Brand");
        assertCaseInsensitive("Gaming");
    }

    private void assertSearch(String keyword, int expectedCount) {
        storePage.search(keyword);
        int results = storePage.getResultsCount();
        assertEquals(expectedCount, results,
                "Niepoprawna liczba wyników dla frazy: " + keyword);
    }

    private void assertCaseInsensitive(String keyword) {
        storePage.search(keyword.toLowerCase());
        int lowerCaseResults = storePage.getResultsCount();

        storePage.search(keyword.toUpperCase());
        int upperCaseResults = storePage.getResultsCount();

        assertEquals(lowerCaseResults, upperCaseResults,
                "Wielkość liter nie powinna wpływać na wyniki wyszukiwania dla frazy: " + keyword);
    }
}