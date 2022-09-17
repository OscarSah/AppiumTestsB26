package com.cydeo.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {

    @Test
    public void initialTest() throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();

        // caps.setCapability("deviceName","Pixel 3");   Another way of sending caps
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 3");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        // this is where we are telling which application we are testing
        caps.setCapability(MobileCapabilityType.APP,"https://cybertek-appium.s3.amazonaws.com/calculator.apk");

        URL url = new URL("http://localhost:4723/wd/hub");

        // Before setting the driver object, we need to set URL and Desired Capabilities

        AppiumDriver<MobileElement> driver = new AndroidDriver<>(url,caps);

        Thread.sleep(4000);

        MobileElement digit9 = driver.findElement(By.id("com.google.android.calculator:id/digit_9"));
        digit9.click();

        Thread.sleep(1000);
        MobileElement clearElem= driver.findElement(MobileBy.AccessibilityId("clear"));
        System.out.println("clearElem.getText() = " + clearElem.getText());
        Assertions.assertTrue(clearElem.isDisplayed());
        clearElem.click();

        /*
        This is with Inspector Recording
MobileElement el7 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_9");
el7.click();
MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("plus");
el8.click();
MobileElement el9 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_5");
el9.click();
MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("equals");
el10.click();

         */



        driver.closeApp();



    }

}
