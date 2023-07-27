@regression
Feature: Search functionality

  @sanity
  Scenario Outline: Search the buy car with model
    Given I am on home page
    When I mouse hoover on buy sell tab
    And I click on search cars link
    Then I navigate to new and used car search page "<result>"
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on find my next cars
    Then I should see the make in result "<Make>"


    Examples:
      | make       | model   | location            | price | Make                                                      | result                            |
      | BMW        | 218d    | NSW - Central Coast | 40000 | 1 BMW 218d for Sale Under $40,000 in Central Coast, NSW   | New & Used Car Search - carsguide |
      | Audi       | A4      | NSW - Hunter        | 50000 | 2 Audi A4s for Sale Under $50,000 in Hunter, NSW          | New & Used Car Search - carsguide |
      | Honda      | Civic   | NSW - New England   | 25000 | 7 Honda Civics for Sale Under $25,000 in New England, NSW | New & Used Car Search - carsguide |
      | Jeep       | Compass | WA - All            | 35000 | 16 Jeep Compass for Sale Under $35,000 in WA              | New & Used Car Search - carsguide |
      | Volkswagen | Polo    | SA - All            | 30000 | 11 Volkswagen Polos for Sale Under $30,000 in North, SA   | New & Used Car Search - carsguide |
      | MG         | ZS      | NSW - Newcastle     | 70000 | 2 MG ZS for Sale Under $70,000 in Newcastle, NSW          | New & Used Car Search - carsguide |

  @sanity
  Scenario Outline: Search the used car with model
    Given I am on home page
    When I mouse hoover on buy sell tab
    And I click ‘Used’ link
    Then I navigate to Used Cars For Sale page "<Results>"
    And I select the make "<makes>"
    And I select the model "<Model>"
    And I select the location "<Location>"
    And I select the price "<Price>"
    And I click on next cars
    Then I should verify the make in result "<Makes>"
    Examples:
      | makes      | Model   | Location            | Price | Makes                                                          | Results            |
      | BMW        | 218d    | NSW - Central Coast | 40000 | 1 Used BMW 218d for Sale Under $40,000 in Central Coast, NSW   | Used Cars For Sale |
      | Audi       | A4      | NSW - Hunter        | 50000 | 2 Used Audi A4s for Sale Under $50,000 in Hunter, NSW          | Used Cars For Sale |
      | Honda      | Civic   | NSW - New England   | 25000 | 7 Used Honda Civics for Sale Under $25,000 in New England, NSW | Used Cars For Sale |
      | Jeep       | Compass | WA - All            | 35000 | 16 Used Jeep Compass for Sale Under $35,000 in WA              | Used Cars For Sale |
      | Volkswagen | Polo    | SA - All            | 30000 | 10 Used Volkswagen Polos for Sale Under $30,000 in North, SA   | Used Cars For Sale |
      | MG         | ZS      | NSW - Newcastle     | 70000 | 1 Used MG ZS for Sale Under $70,000 in Newcastle, NSW          | Used Cars For Sale |