package com.exercises.step_definitions.registerUser;

import com.exercises.pages.DeleteAccount;
import com.exercises.pages.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserDeleteStepDefs {

    SignUpPage signUpPage = new SignUpPage();
    @When("the user should be able to see {string}")
    public void theUserShouldBeAbleToSeeLoggedInAs(String expectedText) {
        String actualText = signUpPage.loggedInAsName.getText();
        Assert.assertEquals(expectedText,actualText);
    }

    @And("the user should be able to click Delete Account button")
    public void theUserShouldBeAbleToClickDeleteAccountButton() {
        signUpPage.basePageButtons(" Delete Account").click();
    }

    @Then("the user should be able to see {string} and click Continue button")
    public void theUserShouldBeAbleToSeeAndClickContinueButton(String accountDeleteText) {

        String actualText = new DeleteAccount().accountDeleteText.getText();
        Assert.assertEquals(accountDeleteText,actualText);

        new DeleteAccount().deleteAccountBtn.click();

    }
}
