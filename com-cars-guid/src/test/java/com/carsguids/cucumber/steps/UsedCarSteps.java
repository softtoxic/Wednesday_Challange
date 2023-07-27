package com.carsguids.cucumber.steps;

import com.carsguids.cucumber.pages.HomePage;
import com.carsguids.cucumber.pages.UsedCarPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class UsedCarSteps {
    @And("^I click ‘Used’ link$")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedCars();
    }

    @Then("^I navigate to Used Cars For Sale page \"([^\"]*)\"$")
    public void iNavigateToUsedCarsForSalePage(String result) {
        Assert.assertEquals("Text not verified", new UsedCarPage().getUsedTitle(), result);
    }

    @And("^I select the make \"([^\"]*)\"$")
    public void iSelectTheMake(String make) {
        new UsedCarPage().selectUsedMake(make);
    }


    @And("^I select the model \"([^\"]*)\"$")
    public void iSelectTheModel(String model) {
        new UsedCarPage().selectUsedModel(model);
    }

    @And("^I select the location \"([^\"]*)\"$")
    public void iSelectTheLocation(String location) {
        new UsedCarPage().selectLocation(location);
    }

    @And("^I select the price \"([^\"]*)\"$")
    public void iSelectThePrice(String price) {
        new UsedCarPage().selectPriceMax(price);
    }

    @And("^I click on next cars$")
    public void iClickOnNextCars() {
        new UsedCarPage().clickOnNextCar();
    }

    @Then("^I should verify the make in result \"([^\"]*)\"$")
    public void iShouldVerifyTheMakeInResult(String Make) {
Assert.assertEquals("Text not verified", Make, new UsedCarPage().getUsedResult());
    }
}
