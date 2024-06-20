Feature: This feature to test Sales Force Application Features


  Scenario: Sales Force login scenario
    Given User launch Salesforce website Url "https://practice.expandtesting.com/login"
    When user login with "practice"
    Then user should be on home page

