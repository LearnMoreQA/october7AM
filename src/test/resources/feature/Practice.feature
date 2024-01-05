Feature: To validate the login functionality

  @Login
  Scenario: To validate the Login with valid Credentials
    Given User navigates to Learnmoreqa url
    When User enters the valid credentials
    And User clicks on login button
    Then User should navigated to home page