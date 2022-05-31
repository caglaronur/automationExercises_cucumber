@launchUrl
Feature: Register User

  Scenario: Launch url and verify
    Given Navigate to url "https://www.automationexercise.com/"
    When Verify that home page is visible successfully

  Scenario: SignUp process
    Given Navigate to url "https://www.automationexercise.com/"
    When Click on SignupLogin button
    Then The user should be able see "New User Signup!"
    Then  Enter name and email address
    And Click Signup button
    And user can see account information header
    Then the user should be able to enter Title, Name, Email, Password, Date of birth
      | name_user  | Olcay12 Sahan12       |
      | email_user | olcay12@hotmail.com |
    When the user should be able to select Select checkbox Receive special offers from our partners!
    Then the user should be able to enter the personal info
    And  the user should be able to click Create Account button
    When The user should be able to see "ACCOUNT CREATED!"
    And the user should be able to click Continue
    When the user should be able to see "Logged in as Olcay12 Sahan12"
    And the user should be able to click Delete Account button
    Then the user should be able to see "ACCOUNT DELETED!" and click Continue button



