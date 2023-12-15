Feature: Automate LearnMore site

  Scenario: To validate login with valid credentials
    Given User Navigates to "https://www.spicejet.com/" URL
    When User click on "One Way" button
    And User selects From location as "Coimbatore" and To location as "Jaipur"
