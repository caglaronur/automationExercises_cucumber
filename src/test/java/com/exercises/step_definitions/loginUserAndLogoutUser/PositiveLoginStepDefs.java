package com.exercises.step_definitions.loginUserAndLogoutUser;

import com.exercises.pages.LoginandSingUpPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.util.Map;

public class PositiveLoginStepDefs {

    LoginandSingUpPage login = new LoginandSingUpPage();

    @Then("the user should be able to see {string} text")
    public void theUserShouldBeAbleToSeeText(String expected) {
        String actualText = new LoginandSingUpPage().getTextLoginPage(expected).getText();
        Assert.assertEquals(expected,actualText);
    }

    @Then("the user should be able to log in with correct credentials and click on loginButton")
    public void theShouldBeAbleToLogInWithCorrectCredentials(Map<String ,String> emailAndPassword) {

        login.emailLogin.sendKeys(emailAndPassword.get("email"));
        login.passwordLogin.sendKeys(emailAndPassword.get("password"));

        String actualEmail = login.emailLogin.getAttribute("value");
        String actualPassword = login.passwordLogin.getAttribute("value");

        Assert.assertEquals(emailAndPassword.get("email"),actualEmail);
        Assert.assertEquals(emailAndPassword.get("password"),actualPassword);

        login.loginButton.click();

    }
}
