package com.luma.testbase;


import com.luma.propertyreader.PropertyReader;
import com.luma.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        closeBrowser();
    }
    public void verifyTwoStrings(String text, By by){
        String expected =text;
        String actual = getTextFromElement(by);
        Assert.assertEquals(actual,expected);
    }
}
