$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/bankcash.feature");
formatter.feature({
  "line": 1,
  "name": "valid user can create a new banking account",
  "description": "",
  "id": "valid-user-can-create-a-new-banking-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "",
  "description": "",
  "id": "valid-user-can-create-a-new-banking-account;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "User presses the Bank \u0026 Cash Button and he presses the New Account Button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters \"\u003caccountTitle\u003e\" \"\u003cdescription\u003e\" \"\u003cinitialBalance\u003e\" \"\u003caccountNumber\u003e\" \"\u003ccontactPerson\u003e\" \"\u003cphoneNumber\u003e\" and \"\u003curl\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User presses submit",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should see Account Created Succesfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "valid-user-can-create-a-new-banking-account;;",
  "rows": [
    {
      "cells": [
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phoneNumber",
        "url"
      ],
      "line": 15,
      "id": "valid-user-can-create-a-new-banking-account;;;1"
    },
    {
      "cells": [
        "savingsAccount",
        "personalsavings",
        "10000",
        "1200",
        "james",
        "510-333-1231",
        "https://www.bankofamerica.com/"
      ],
      "line": 16,
      "id": "valid-user-can-create-a-new-banking-account;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 105200,
  "status": "passed"
});
