package com.exercises.step_definitions.registerUser;

import com.exercises.pages.LoginandSingUpPage;
import com.exercises.pages.SignUpPage;
import com.exercises.utilities.BrowserUtils;
import com.exercises.utilities.ConfigurationReader;
import com.exercises.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class SingUpStepDefs {
    LoginandSingUpPage login = new LoginandSingUpPage();
    @Given("Navigate to url {string}")
    public void navigate_to_url(String url) {

        Driver.get().get(url);
        Driver.get().manage().window().maximize();
    }

    @When("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        String actual = Driver.get().getCurrentUrl();
        String expected = ConfigurationReader.get("url");

        Assert.assertEquals(expected,actual);
    }


    @Given("Click on SignupLogin button")
    public void clickOnSignupLoginButton() {
        SignUpPage signUpPage = new SignUpPage(); // steplerde tek tirnak koyma
        signUpPage.basePageButtons(" Signup / Login").click();
    }

    @Then("The user should be able see {string}")
    public void theUserShouldBeAbleSee(String expected) {
        String actualText = new LoginandSingUpPage().getTextLoginPage(expected).getText();
        Assert.assertEquals(expected,actualText);
    }
    @And("Enter name and email address")
    public void enterNameAndEmailAddress() {
        login.name.sendKeys("Hüseyin Kale");
        login.emailSingUp.sendKeys("kal_osman07@gmail.com");
    }

    @Then("Click Signup button")
    public void clickSignupButton() {
        login.signupButton.click();
    }

    @And("user can see account information header")
    public void userCanSeeAccountInformationHeader() {
        BrowserUtils.verifyElementDisplayed(new SignUpPage().enterAccountInfoText);
    }


}
