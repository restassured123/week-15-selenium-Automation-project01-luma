package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DufflePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCart;

    public void changeQuantity(String text){
        Reporter.log( quantity.toString());
        CustomListeners.test.log(Status.PASS,"change quanity" + quantity);
        quantity.clear();
        sendTextToElement(quantity,text);
    }
    public void clickOnAddToCart(){
        Reporter.log( addToCart.toString());
        CustomListeners.test.log(Status.PASS,"click On Add To Cart" + addToCart);
        clickOnElement(addToCart);
    }
}
