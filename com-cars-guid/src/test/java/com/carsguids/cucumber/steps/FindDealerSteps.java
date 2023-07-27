package com.carsguids.cucumber.steps;

import com.carsguids.cucumber.pages.FindDealersPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class FindDealerSteps {

    @And("^I click Find a Dealer$")
    public void iClickFindADealer() {
        new FindDealersPage().clickOnFindDealerLink();
    }

    @Then("^I navigate to car-dealers page \"([^\"]*)\"$")
    public void iNavigateToCarDealersPage(String result) {
        Assert.assertEquals("Text not verified", result, new FindDealersPage().getDealerText());
    }

    @And("^I should see the dealer names are display on page<dealersName>$")
    public void iShouldSeeTheDealerNamesAreDisplayOnPageDealersName(String name, DataTable dataTable) {

    }
}
