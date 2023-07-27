package com.carsguids.cucumber.steps;

import com.carsguids.cucumber.pages.HomePage;
import com.carsguids.cucumber.pages.ResultPage;
import com.carsguids.cucumber.pages.SearchCarsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SearchSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {

    }

    @When("^I mouse hoover on buy sell tab$")
    public void iMouseHooverOnBuySellTab() {
        new HomePage().selectBuyAndSell();

    }

    @And("^I click on search cars link$")
    public void iClickOnSearchCarsLink() {
new HomePage().clickOnSearchCars();
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) {
        new SearchCarsPage().selectMakes(make);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
        new SearchCarsPage().selectModel(model);
    }

    @Then("^I navigate to new and used car search page \"([^\"]*)\"$")
    public void iNavigateToNewAndUsedCarSearchPage(String result) {
        Assert.assertEquals("Text not verified", new SearchCarsPage().getTitleText(), result);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
        new SearchCarsPage().selectLocation(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price){
        new SearchCarsPage().selectPrice(price);
    }

    @And("^I click on find my next cars$")
    public void iClickOnFindMyNextCars() {
        new SearchCarsPage().clickOnFindMyCar();
    }

    @Then("^I should see the make in result \"([^\"]*)\"$")
    public void iShouldSeeTheMakeInResult(String Make){
        Assert.assertEquals("Text not verified", new ResultPage().getSearchResult(), Make);
    }
}
