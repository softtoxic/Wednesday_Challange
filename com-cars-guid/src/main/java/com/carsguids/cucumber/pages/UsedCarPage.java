package com.carsguids.cucumber.pages;

import com.carsguids.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsedCarPage extends Utility {
    private static final Logger log = LogManager.getLogger(UsedCarPage.class.getName());

    public UsedCarPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Used Cars For Sale')]")
    WebElement usedTitle;
    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement usedMake;
    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement usedModel;
    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement location;
    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement priceMax;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement nextCar;
    @CacheLookup
    @FindBy(xpath = "//h1[@class='h1Text search--title']")
    WebElement usedResult;

    public String getUsedTitle() {
        return getTextFromElement(usedTitle);
    }

    public void selectUsedMake(String Makes) {
        selectByValueFromDropDown(usedMake, Makes);
    }

    public void selectUsedModel(String Models) {
        selectByValueFromDropDown(usedModel, Models);
    }

    public void selectLocation(String Location) {
        selectByValueFromDropDown(location, Location);
    }

    public void selectPriceMax(String PriceMax) {
        selectByValueFromDropDown(priceMax, PriceMax);
    }

    public void clickOnNextCar() {
        clickOnElement(nextCar);
    }
    public String getUsedResult(){
        return getTextFromElement(usedResult);
    }

}
