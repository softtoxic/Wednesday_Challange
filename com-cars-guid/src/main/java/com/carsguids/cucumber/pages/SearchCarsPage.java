package com.carsguids.cucumber.pages;

import com.carsguids.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCarsPage extends Utility {
    private static final Logger log = LogManager.getLogger(SearchCarsPage.class.getName());

    public SearchCarsPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement makes;
    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement model;
    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement location;
    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement price;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findCar;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='New & Used Car Search - carsguide']")
    WebElement titlePage;

    public void selectMakes(String Makes) {
        selectByVisibleTextFromDropDown(makes, Makes);
    }

    public void selectModel(String Model) {
        selectByValueFromDropDown(model, Model);
    }

    public void selectLocation(String Location) {
        selectByValueFromDropDown(location, Location);
    }

    public void selectPrice(String Price) {
        selectByValueFromDropDown(price, Price);
    }

    public void clickOnFindMyCar() {
        clickOnElement(findCar);
    }
    public String getTitleText(){
      return  getTextFromElement(titlePage);
    }
}
