@positiveLogin
Feature: Positive login test

  Background: Launch browser and navigate url
    Given Navigate to url "https://www.automationexercise.com/"
    When Verify that home page is visible successfully

  Scenario: Login user with correct email and password
    When Click on SignupLogin button
    Then the user should be able to see "Login to your account" text
    Then the user should be able to log in with correct credentials and click on loginButton
      | email    | kal_osman07@gmail.com |
      | password | AslanKral.01          |
    When the user should be able to see "Logged in as Hüseyin Ak"
    And the user should be able to click Delete Account button
    Then the user should be able to see "ACCOUNT DELETED!" and click Continue button
