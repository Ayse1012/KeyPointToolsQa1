Feature: Alerts

  @alert @smoke
  Scenario: Alerts Pass
    Given The user goes to tools home page
    And   The user navigate to "Alerts, Frame & Windows"
    And   The user click to "Alerts"
    When  The user sees warning button and passes
    And   The user waits five seconds and passes
    And   The user sees verifies "Do you confirm action?" and passes
    Then  The user enter "Hello" and verify "You entered Hello"