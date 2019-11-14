@SearchKeyword
Feature: Search keyword

  Scenario: I want to search an item by keyword

    Given I am on the application home page
    And I click the sign in link
    And I am logged in
    When I enter keyword in the search field
    And I click on magnifying glass
    Then result matching keyword and the quantity available should display