@AddProduct
Feature: Add product to cart

  Scenario: I want to add product to cart and checkout

   Given I am on the application home page
   And I click the sign in link
   And I am logged in
   When I enter keyword in the search field
   And I click on magnifying glass
   And I add a random product to cart and checkout
   Then my order should be confirmed
