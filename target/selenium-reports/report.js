$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/eco/uitests/features/uptogether_ui/Financials.feature");
formatter.feature({
  "name": "Financial Page automation",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User is logged in",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User on Uptogether Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.userOnLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the uptogether login button",
  "keyword": "When "
});
formatter.match({
  "location": "Login.uptogetherLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User switches to the child window to enter the google account details and switches back to the parent window",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.switchToChildWindow()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Asserting the payout details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AssertPayoutDetails_First"
    },
    {
      "name": "@Financial"
    },
    {
      "name": "@Release"
    }
  ]
});
formatter.step({
  "name": "User goes to Financial Page after switching to the parent window",
  "keyword": "Given "
});
formatter.match({
  "location": "Financial.loginUsingGoogleAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User goes to the Change Payout method page",
  "keyword": "When "
});
formatter.match({
  "location": "Financial.navigateToPayoutMethodPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens the payout details page for the first option",
  "keyword": "Then "
});
formatter.match({
  "location": "Financial.openPayoutDetails_First()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User asserts the payout details",
  "keyword": "And "
});
formatter.match({
  "location": "Financial.assertPayoutDetails_First()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});