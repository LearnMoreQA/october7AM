Feature: To validate the login functionality

  @Smoke @Regression
  Scenario: To validate the Login with valid Credentials
    Given User navigates to saucedemo url
    When User enters the valid credentials
    And User clicks on login button
    Then User should navigated to home page

  @Regression
  Scenario: To validate the Login with valid username and valid password
    Given User navigates to saucedemo url
    When User enters the username as "problem_user" and password as "secret_sauce"
    And User clicks on login button
    Then User should navigated to home page

  @Sanity
  Scenario Outline: To validate the invalid credentials
    Given User navigates to saucedemo url
    When User enters the username as "<username>" and password as "<password>"
    And User clicks on login button
    Then User verifies the "Epic sadface: Username and password do not match any user in this service" error message displayed
    Examples:
      | username     | password |
      | testtestuser | pass     |
      | test@test    | pass123  |



