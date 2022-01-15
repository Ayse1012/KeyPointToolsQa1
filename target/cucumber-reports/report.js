$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Alerts.feature");
formatter.feature({
  "name": "Alerts",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Alerts Pass",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@alert"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user goes to tools home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.toolsAndSauce.step_definitions.AlertStepDefinitions.the_user_goes_to_tools_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user navigate to \"Alerts, Frame \u0026 Windows\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.toolsAndSauce.step_definitions.AlertStepDefinitions.the_user_navigate_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click to \"Alerts\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.toolsAndSauce.step_definitions.AlertStepDefinitions.the_user_click_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user sees warning button and passes",
  "keyword": "When "
});
formatter.match({
  "location": "com.toolsAndSauce.step_definitions.AlertStepDefinitions.the_user_sees_warning_button_and_passes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user waits five seconds and passes",
  "keyword": "And "
});
formatter.match({
  "location": "com.toolsAndSauce.step_definitions.AlertStepDefinitions.theUserWaitsFiveSecondsAndPasses()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user sees verifies \"Do you confirm action?\" and passes",
  "keyword": "And "
});
formatter.match({
  "location": "com.toolsAndSauce.step_definitions.AlertStepDefinitions.the_user_sees_verifies_and_passes(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter \"Hello\" and verify \"You entered Hello\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.toolsAndSauce.step_definitions.AlertStepDefinitions.the_user_enter_and_verify(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Interactions.feature");
formatter.feature({
  "name": "Interactions",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Drog And Drop",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@drop"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user goes to tools home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.toolsAndSauce.step_definitions.AlertStepDefinitions.the_user_goes_to_tools_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user navigate to \"Interactions\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.toolsAndSauce.step_definitions.AlertStepDefinitions.the_user_navigate_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click to \"Droppable\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.toolsAndSauce.step_definitions.AlertStepDefinitions.the_user_click_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user keeps dragging and dropping",
  "keyword": "When "
});
formatter.match({
  "location": "com.toolsAndSauce.step_definitions.InteractionsStepDefinitions.the_user_keeps_dragging_and_dropping()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user verify the \"Dropped!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.toolsAndSauce.step_definitions.InteractionsStepDefinitions.the_user_verify_the(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/widgets.feature");
formatter.feature({
  "name": "widgets",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Tool Tips",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tools"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user goes to tools home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.toolsAndSauce.step_definitions.AlertStepDefinitions.the_user_goes_to_tools_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user navigate to \"Widgets\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.toolsAndSauce.step_definitions.AlertStepDefinitions.the_user_navigate_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click to \"Tool Tips\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.toolsAndSauce.step_definitions.AlertStepDefinitions.the_user_click_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user hovers over the Hover me to see button and verify message \"You hovered over the Button\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.toolsAndSauce.step_definitions.WidgetsStepDefinitions.userHoversOverTheHoverMeToSeeButtonAndVerifyMessage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user hovers over the Hover me to see text field and verify message \"You hovered over the text field\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.toolsAndSauce.step_definitions.WidgetsStepDefinitions.userHoversOverTheHoverMeToSeeTextFieldAndVerifyMessage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});