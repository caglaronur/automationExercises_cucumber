@negativeLogin
Feature: Negative login test

  Background: Launch browser and navigate url
    Given Navigate to url "https://www.automationexercise.com/"
    When Verify that home page is visible successfully

  Scenario: Login user with incorrect email and password
    When Click on SignupLogin button
    Then the user should be able to see "Login to your account" text
    Then the user should be able to log in with incorrect credentials and click on loginButton
      | email    | kal_osman@gmail.com |
      | password | AslanKral           |
    And the user should be able to see "Your email or password is incorrect!" text