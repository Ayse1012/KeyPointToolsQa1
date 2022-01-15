@login
Feature: Login
Background:
  Given The user goes to login page
  Scenario: invalid username
    When  The user enters username "standardUser" and password "secret_sauce"
    Then  The user confirms "Epic sadface:"

  Scenario: invalid password
    When  The user enters username "standard_user" and password "secretSauce"
    Then  The user confirms "Epic sadface:"

  Scenario: invalid username and password
    When  The user enters username "standard_use" and password "secretSauce"
    Then  The user confirms "Epic sadface:"

  Scenario: invalid character
    When  The user enters username "standard_use%" and password "secret$Sauce"
    Then  The user confirms "Epic sadface:"

  Scenario: null username
    When  The user enters username "" and password "secret_sauce"
    Then  The user confirms "Epic sadface: Username is required"

  Scenario: null password
    When  The user enters username "standard_user" and password ""
    Then  The user confirms "Epic sadface: Password is required"


   @log
  Scenario Outline: valid user and password
    Given The user goes to login page
    When  The user enters username "<username>"
    Then  The user enters password "<password>"
    And   The user contains url "https://www.saucedemo.com/inventory.html"
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |





