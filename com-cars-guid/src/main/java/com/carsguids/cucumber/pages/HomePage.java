package com.carsguids.cucumber.pages;

import com.carsguids.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buyAndSell;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Search Cars']")
    WebElement searchCars;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement usedCars;


    public void selectBuyAndSell() {
        mouseHoverToElement(buyAndSell);
    }

    public void clickOnSearchCars() {
        mouseHoverToElementAndClick(searchCars);
    }

    public void clickOnUsedCars() {
        mouseHoverToElementAndClick(usedCars);
    }

}
