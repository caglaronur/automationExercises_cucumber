package com.exercises.step_definitions.loginUserAndLogoutUser;

import com.exercises.pages.LoginandSingUpPage;
import com.exercises.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LogoutStepDefs {
    @Then("the user should be able to click on logout button")
    public void the_user_should_be_able_to_click_on_logout_button() {
        new LoginandSingUpPage().basePageButtons(" Logout").click();

    }

    @And("verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {
        String expected = "https://www.automationexercise.com/login";
        String actual = Driver.get().getCurrentUrl();

        Assert.assertEquals(expected,actual);
    }
}
