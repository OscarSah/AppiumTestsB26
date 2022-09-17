package com.cydeo.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Test;
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

        driver.closeApp();



    }

}
