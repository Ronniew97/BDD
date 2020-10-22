Feature: valid user can create a new banking account

Background:  

Given User logs into techfios billing and is on the dashboard page


Scenario Outline:
When User presses the Bank & Cash Button and he presses the New Account Button
When User enters "<accountTitle>" "<description>" "<initialBalance>" "<accountNumber>" "<contactPerson>" "<phoneNumber>" and "<url>"
And User presses submit
Then User should see Account Created Succesfully

Examples:
| accountTitle | description | initialBalance |accountNumber| contactPerson | phoneNumber | url |
| savingsAccount | personalsavings | 10000 | 1200 | james | 510-333-1231 | https://www.bankofamerica.com/ |
