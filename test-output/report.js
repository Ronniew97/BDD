$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "User should be able to log in to the techfios page",
  "description": "",
  "id": "user-should-be-able-to-log-in-to-the-techfios-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "A valid user should able to login",
  "description": "",
  "id": "user-should-be-able-to-log-in-to-the-techfios-page;a-valid-user-should-able-to-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on techfios billing site",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "he logs in with a valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "he should be able to see the home page of the website",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_is_on_techfios_billing_site()"
});
formatter.result({
  "duration": 11953113500,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat steps.LoginSteps.user_is_on_techfios_billing_site(LoginSteps.java:20)\r\n\tat ✽.Given User is on techfios billing site(./src/test/java/features/login.feature:4)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "LoginSteps.he_logs_in_with_a_valid_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.he_should_be_able_to_see_the_home_page_of_the_website()"
});
formatter.result({
  "status": "skipped"
});
});