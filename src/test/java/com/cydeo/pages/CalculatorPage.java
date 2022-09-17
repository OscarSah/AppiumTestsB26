package com.cydeo.pages;

import com.cydeo.utils.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
    public CalculatorPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);
    }

    @AndroidFindBy()
    public MobileElement multiply;

}
