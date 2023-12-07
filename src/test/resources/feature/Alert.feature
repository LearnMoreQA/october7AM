Feature: To Handle Alert Popup

  @Alert
  Scenario: To validate the Alert Popup
    Given user navigates to url
    When User clicks on "ok" Button in Alert
    Then User verifies the Title of the Page

  @ConfirmationAlert
  Scenario: To validate the Confirmation Alert Popup
    Given user navigates to url
    When User clicks on "cancel" Button in Alert
    Then User verifies the Title of the Page

  @PromptAlert
  Scenario: To validate the Prompt Alert Popup
    Given user navigates to url
    When User Enters the "LearnMore" in Prompt Popup
    And User clicks on ok Button in Prompt Alert
    Then User verifies the Title of the Page