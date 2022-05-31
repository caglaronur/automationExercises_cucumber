@contactUs
Feature: Contact us form

  Background: Launch browser and navigate url
    Given Navigate to url "https://www.automationexercise.com/"
    When Verify that home page is visible successfully

  Scenario Outline: Contact us form
    When the user should be able to click on Contact Us button
    And the user should be able to see Get In Touch
    Then the user should be able to enter the "<name>", "<email>", "<subject>" and "<message>"
    Then the user should be able to upload file
    And the user should be able to click Submit button
    Then the user should be able to click OK button
    And the user should be able to verify "Success! Your details have been submitted successfully."
    Then the user should be able to click Home button and verify that landed to home page successfully
    Examples:
      | name       | email                 | subject | message                      |
      | Hüseyin Ak | kal_osman07@gmail.com | Error   | I can not delete my account! |



