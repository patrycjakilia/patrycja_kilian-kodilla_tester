package com.kodilla.testcontainers;

import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testcontainers.containers.BrowserWebDriverContainer;
import org.testcontainers.containers.DefaultRecordingFileFactory;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.images.builder.ImageFromDockerfile;
import org.testcontainers.shaded.org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode.RECORD_ALL;
import static org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode.SKIP;

public class ApplicationTest {

    @Rule
    public Network network = Network.newNetwork();

    @Rule
    public BrowserWebDriverContainer browser =
            new BrowserWebDriverContainer<>()
                    .withCapabilities(new FirefoxOptions())
                    .withRecordingMode(RECORD_ALL, new File("./build/"))
                    .withRecordingFileFactory(new DefaultRecordingFileFactory());

    @Rule
    public GenericContainer webServer =
            new GenericContainer<>(
                    new ImageFromDockerfile()
                            .withFileFromClasspath("/tmp/index.html", "index.html")
                            .withDockerfileFromBuilder(builder ->
                                    builder
                                            .from("httpd:2.4")
                                            .copy("/tmp/index.html", "/usr/local/apache2/htdocs")
                                            .build()))
                    .withNetwork(network)
                    .withNetworkAliases("my-server")
                    .withExposedPorts(80);

    @Test
    public void myBusinessCardTest() throws IOException {
        RemoteWebDriver driver = browser.getWebDriver();

        driver.get("http://my-server/");

        // poczekaj aż strona się załaduje
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("title")));

        // opcjonalny screenshot
        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("./build/screenshots/" + screenshot.getName()));

        // weryfikacja tekstu w tytule wizytówki
        String title = driver.findElement(By.id("title")).getText();
        assertEquals("Moja wizytówka", title);
    }
}

