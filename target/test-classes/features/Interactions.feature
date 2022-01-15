Feature: Interactions

  @drop @smoke
  Scenario: Drog And Drop
    Given The user goes to tools home page
    And   The user navigate to "Interactions"
    And   The user click to "Droppable"
    When  The user keeps dragging and dropping
    Then  The user verify the "Dropped!"