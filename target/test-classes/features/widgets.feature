Feature: widgets

  @tools @smoke
  Scenario: Tool Tips
    Given The user goes to tools home page
    And   The user navigate to "Widgets"
    And   The user click to "Tool Tips"
    And   user hovers over the Hover me to see button and verify message "You hovered over the Button"
    Then  user hovers over the Hover me to see text field and verify message "You hovered over the text field"

