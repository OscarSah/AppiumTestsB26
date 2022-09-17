package com.cydeo.tests;

import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class EtsyWebTest {
    public WebDriver driver;
    @Test
    public void searchTest() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        // for webTest we need to define which browser we will automate
        caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");

        URL url = new URL("http://localhost:4723/wd/hub");

        driver = new RemoteWebDriver(url,caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.etsy.com");
        Thread.sleep(2000);
        WebElement searchField = driver.findElement(By.name("search_query"));
        searchField.sendKeys("heart necklace"+ Keys.ENTER);

        WebElement firstResult = driver.findElement(By.xpath("(//h3)[1]"));
        String firstResultText = firstResult.getText();
        Assertions.assertTrue(firstResultText.toLowerCase().contains("heart"));
        driver.quit();

    }
}
