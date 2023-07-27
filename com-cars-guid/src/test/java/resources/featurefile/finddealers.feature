Feature: Find the dealers and verify

  @smoke
  Scenario: Find the dealers and verify the dealers are in list
    Given I am on home page
    When I mouse hoover on buy sell tab
    And I click Find a Dealer
    Then I navigate to car-dealers page "Find a Car Dealership Near You"
    And I should see the dealer names are display on page<dealersName>
      | dealersName             |
      | 3 Point Motors Epping   |
      | 4WD Specialist Group    |
      | 5 Star Auto             |
      | A & M Car Sales Pty Ltd |
      | A1 MOTORS COMPANY       |
      | ANDREA MOTORI SERVICE   |
      | Oxford Motors           |