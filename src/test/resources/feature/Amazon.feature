Feature: To Validate the functionality of Amazon Application

  @Window
  Scenario: Validate the new window functionality
    Given User enter and clicks on "Apple iPhone 15 (128 GB) - Green" product
    And User switched to new window
    Then User verifies the "Apple iPhone 15 (128 GB) - Green" Product name

  @Iframe
  Scenario: Validate the Text inside Ifrmae
    Given User enter the "Books" product
    When User navigates to Advertisement
    #Then User verifies Product Title is Present

  @FluentWait
  Scenario: Validate the Add to Cart Functionality without sign up
    Given User enter and clicks on "iPhone 15 (128 GB) - Green" product
    When User switched to new window
    And User Clicks on Add to Cart Button
    Then User verifies the "Added to Cart" message

