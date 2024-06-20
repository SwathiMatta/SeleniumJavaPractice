@PracticeWebInputs
Feature: This feature is to test WebInputs tile on Home page

  Background: Url Login and navigating to Home page
    Given User enters the Url "https://practice.expandtesting.com/login"
    When user login as "practice" user
    Then user should login successfully

  @WebInputs-Number
  Scenario: User provides Input data
   # Given User is on Home page
    When User clicks on WebInputs tile
   # Then User should land on WebInputs page
    When user inputs the following details
      | Number | Text   | Password | Date       |
      | 10     | SWATHI | PASSWORD | 11-06-2024 |
    And clicks on DisplayInput button
    Then User should see provided data

