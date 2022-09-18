package com.cydeo.tests;

import com.cydeo.utils.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.Test;

public class SwagLabTest {

@Test
    public void LoginTest() throws InterruptedException {
        AppiumDriver<MobileElement> driver = Driver.getDriver();

        System.out.println("driver.getPlatformName() = " + driver.getPlatformName());

        System.out.println("driver.getDeviceTime() = " + driver.getDeviceTime());

        Thread.sleep(4000);


        Driver.closeDriver();



    }
}
