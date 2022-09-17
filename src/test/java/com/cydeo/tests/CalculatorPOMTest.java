package com.cydeo.tests;

import com.cydeo.pages.CalculatorPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorPOMTest {

    CalculatorPage calculatorPage = new CalculatorPage();

    @Test
    public void multiplyTest(){
        // 5 * 8 = 40 verify

        calculatorPage.clickDigit(5);
        calculatorPage.multiply.click();
        calculatorPage.clickDigit(8);
        calculatorPage.equals.click();

        String result = calculatorPage.result.getText();

        Assertions.assertEquals(40,Integer.parseInt(result));


    }

}
