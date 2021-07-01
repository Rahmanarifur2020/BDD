$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Validate Techfios Login functionality",
  "description": "",
  "id": "validate-techfios-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 1538585000,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the Techfio loging page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.User_is_on_the_Techfio_loging_page()"
});
formatter.result({
  "duration": 4291324300,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "User should be able to login with the valid credential",
  "description": "",
  "id": "validate-techfios-login-functionality;user-should-be-able-to-login-with-the-valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Scenario1"
    },
    {
      "line": 7,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User click on SignIn buttton",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should land on Dashboar page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "LoginStepDefinitions.User_enters_username(String)"
});
formatter.result({
  "duration": 57163800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "LoginStepDefinitions.User_enters_password(String)"
});
formatter.result({
  "duration": 43552300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.User_click_on_SignIn_buttton()"
});
formatter.result({
  "duration": 1343484700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.User_should_land_on_Dashboar_page()"
});
formatter.result({
  "duration": 5305900,
  "status": "passed"
});
formatter.after({
  "duration": 662951500,
  "status": "passed"
});
});