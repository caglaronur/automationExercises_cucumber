package com.exercises.step_definitions;

import com.exercises.utilities.BrowserUtils;
import com.exercises.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class VerifyTestCasePageStepdefs {

    @When("the user should be able to click on Test Cases button")
    public void theUserShouldBeAbleToClickOnTestCasesButton() {
        BrowserUtils.clickWithJS(Driver.get().findElement(By.xpath("//*[text()=' Test Cases']")));
    }
    @Then("the user should be able to navigate to Test Cases page successfully")
    public void theUserShouldBeAbleToNavigateToTestCasesPageSuccessfully() {
        String expectedWebSeit = Driver.get().getCurrentUrl();
        String actualWebSeit = "https://www.automationexercise.com/test_cases";

        Assert.assertEquals(expectedWebSeit,actualWebSeit);
    }
}
