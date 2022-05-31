@logout
Feature: Logout User

  Background: Launch browser and navigate url
    Given Navigate to url "https://www.automationexercise.com/"
    When Verify that home page is visible successfully

  Scenario: Verify that the user is redirected to the login page
    When Click on SignupLogin button
    Then the user should be able to see "Login to your account" text
    Then the user should be able to log in with correct credentials and click on loginButton
      | email    | kal_osman07@gmail.com |
      | password | AslanKral.01          |
    When the user should be able to see "Logged in as Hüseyin Ak"
    Then the user should be able to click on logout button
    And verify that user is navigated to login page