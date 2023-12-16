Feature: To Handle the Dropdown

  @Dropdown
  Scenario: To validate the Static Dropdown
    Given User navigates to spicejet url
    When User selects the "KWD" Currency
    Then User verifies the "KWD" Currency

  @StaticDropdown
  Scenario: To validate the Product Filter
    Given User navigate and Logged to swaglabs url
    When User Selects the "lohi" condition
    Then User verifies the selected option of "Price (low to high)"

  @DeselectDropdown
  Scenario: To validate the Deselect Dropdown
    Given User navigates to demoqa url
    When User selects the "Purple" color
    And User Deselects the color
    Then User verifies the "Red" color

  @DynamicDropdown
  Scenario: To validate the Dynamic Dropdown
    Given User navigates to spicejet url
    When User Enters the From Place as "Agra"
    And User Enters the To Place as "Jaipur"
    Then User verifies the From as "Agra" and To Place as "Jaipur"


