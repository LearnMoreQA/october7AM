Feature: To Handle the Dropdown

  @Dropdown
  Scenario: To validate the Static Dropdown
    Given User navigates to spicejet url
    When User selects the "CAD" Currency
    Then User verifies the "CAD" Currency

    @StaticDropdown
    Scenario: To validate the Product Filter
      Given User navigate and Logged to swaglabs url
      When User Selects the "lohi" condition
      Then User verifies the selected option of "Price (low to high)"
