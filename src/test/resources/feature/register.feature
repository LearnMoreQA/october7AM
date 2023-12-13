Feature: To Validate the Register Page

  @Register
  Scenario: To Validate the Register Page Fields
    Given User navigates to Application Url
    When User clicks on Register Link
    And User fills the Register Form
    Then User verifies the Success Message