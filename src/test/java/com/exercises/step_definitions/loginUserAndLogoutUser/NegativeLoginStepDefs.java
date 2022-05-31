package com.exercises.step_definitions.loginUserAndLogoutUser;

import com.exercises.pages.LoginandSingUpPage;
import io.cucumber.java.en.Then;
import java.util.Map;

public class NegativeLoginStepDefs {

    LoginandSingUpPage login = new LoginandSingUpPage();

    @Then("the user should be able to log in with incorrect credentials and click on loginButton")
    public void theShouldBeAbleToLogInWithCorrectCredentials(Map<String ,String> emailAndPassword) {

        login.emailLogin.sendKeys(emailAndPassword.get("email"));
        login.passwordLogin.sendKeys(emailAndPassword.get("password"));

        login.loginButton.click();
    }
}
