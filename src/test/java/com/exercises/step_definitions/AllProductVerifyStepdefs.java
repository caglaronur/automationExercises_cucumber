package com.exercises.step_definitions;

import com.exercises.pages.ProductsPage;
import com.exercises.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AllProductVerifyStepdefs {

    ProductsPage productsPage = new ProductsPage();

    @When("the user should be able to click Products button")
    public void theUserShouldBeAbleToClickProductsButton() {
        productsPage.basePageButtons(" Products").click();

    }

    @Then("the user should be able to see ALL PRODUCTS text")
    public void theUserShouldBeAbleToSeeALLPRODUCTSText() {
        String expectedText = productsPage.allProduct.getText();
        String actualText = "ALL PRODUCTS";

        Assert.assertEquals(expectedText, actualText);
    }

    @And("the user should be able to visible the product list")
    public void theUserShouldBeAbleToVisibleTheProductList() {

        List<WebElement> webElementsImgPro = productsPage.imgProduct;

        for (WebElement webElement : webElementsImgPro) {
            if (!webElement.isDisplayed()) {
                System.out.println("product is fail...");
            }
        }

    }

    @When("the user should be able to click on click on view product of first product")
    public void theUserShouldBeAbleToClickOnClickOnViewProductOfFirstProduct() {

        List<WebElement> webElementsViewPro = productsPage.viewProduct;

        webElementsViewPro.get(0).click();

    }

    @Then("the user should be able to navigate to product detail page successfully")
    public void theUserShouldBeAbleToNavigateToProductDetailPageSuccessfully() {
        String expectedWebSite = Driver.get().getCurrentUrl();
        String actualWebSite = "https://www.automationexercise.com/product_details/1";

        Assert.assertEquals("navigate to product site", expectedWebSite, actualWebSite);

    }

    @Then("the user should be able to visible the {string}, {string}, {string}, {string} ,{string},{string}")
    public void theUserShouldBeAbleToVisibleThe(String productName, String category, String price, String availability, String condition, String brand) {

        List<WebElement> webElementsProductDetails = productsPage.productDetails;


        String expectedCategory = webElementsProductDetails.get(0).getText().substring("Category:".length()).trim();
        Assert.assertEquals(expectedCategory, category);

        String expectedAvailability = webElementsProductDetails.get(1).getText().substring("Availability:".length()).trim();
        Assert.assertEquals(expectedAvailability, availability);

        String expectedCondition = webElementsProductDetails.get(2).getText().substring("Condition:".length()).trim();
        Assert.assertEquals(expectedCondition, condition);

        String expectedBrand = webElementsProductDetails.get(3).getText().substring("Brand:".length()).trim();
        Assert.assertEquals(expectedBrand, brand);

        String expectedProductName = productsPage.nameAndPricePro("Blue Top").getText();
        Assert.assertEquals(expectedProductName, productName);

        String expectedPrice = productsPage.nameAndPricePro("Rs. 500").getText();
        Assert.assertEquals(expectedPrice, price);
    }


}
