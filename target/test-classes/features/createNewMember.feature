@CreateNewMember
Feature: Create New Member

  Scenario: I want to create a new user account

    Given I am on the application home page
    And I click the sign in link
    And I enter email address for account creation
    And I click button to create account
    When I enter all mandatory details
    And I click on register
    Then My acoount should be successfully created