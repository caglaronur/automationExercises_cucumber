@verifyProduct
Feature: Verify all products and product detailPage

  Background: Launch browser and navigate url
    Given Navigate to url "https://www.automationexercise.com/"
    When Verify that home page is visible successfully

  Scenario Outline: The user should bue able to see all products and  product detailPage
    When the user should be able to click Products button
    Then the user should be able to see ALL PRODUCTS text
    And the user should be able to visible the product list
    When the user should be able to click on click on view product of first product
    Then the user should be able to navigate to product detail page successfully
    Then the user should be able to visible the "<productName>", "<category>", "<price>", "<availability>" ,"<condition>","<brand>"
    Examples:
      | productName | category     | price   | availability | condition | brand |
      | Blue Top    | Women > Tops | Rs. 500 | In Stock     | New       | Polo  |
