@verifyTestPage
Feature: Verify testCase page

  Background: Launch browser and navigate url
    Given Navigate to url "https://www.automationexercise.com/"
    When Verify that home page is visible successfully

  Scenario: The User should be able to navigate testCase page
    When the user should be able to click on Test Cases button
    Then the user should be able to navigate to Test Cases page successfully
