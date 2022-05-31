@existEmail
Feature: Register User with existing email

  Background: Launch browser and navigate url
    Given Navigate to url "https://www.automationexercise.com/"
    When Verify that home page is visible successfully

  Scenario: the user register with existing email and see error text "Email Address already exist!"
    When Click on SignupLogin button
    Then The user should be able see "New User Signup!"
    Then Enter name and email address
    And Click Signup button
    Then the user should be able to see "Email Address already exist!" text

