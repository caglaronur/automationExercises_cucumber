package com.exercises.step_definitions.registerUser;

import com.exercises.pages.AccountCreated;
import com.exercises.pages.SignUpPage;
import com.exercises.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class FillDetailsStepDefs {
    SignUpPage signUpPage = new SignUpPage();
    @Given("the user should be able to enter Title, Name, Email, Password, Date of birth")
    public void theUserShouldBeAbleToEnterTitleNameEmailPasswordDateOfBirth(Map<String,String> nameAndEmail) {

        signUpPage.mrButton.click();// mr and ms click

        String actualName = signUpPage.fillDetails.get(0).getAttribute("value");// fillDetails listElement de SignUpPage de
        String actualEmail = signUpPage.fillDetails.get(1).getAttribute("value");//

        Assert.assertEquals(nameAndEmail.get("name_user"),actualName);// verify name
        Assert.assertEquals(nameAndEmail.get("email_user"),actualEmail);// verify email

        signUpPage.fillDetails.get(2).sendKeys(ConfigurationReader.get("password"));

        signUpPage.selectDate(signUpPage.days);// enter the days
        signUpPage.selectDate(signUpPage.months);// enter the months
        signUpPage.selectDate(signUpPage.years);// enter the years

    }

    @When("the user should be able to select Select checkbox Receive special offers from our partners!")
    public void theUserShouldBeAbleToSelectSelectCheckboxReceiveSpecialOffersFromOurPartners() {
        signUpPage.newsletterCheckBtn.click();// click checkBox btn
        signUpPage.ourPartnersCheckBtn.click();// click checkBox btn
    }

    @Then("the user should be able to enter the personal info")
    public void theUserShouldBeAbleToEnterThePersonalInfo() {

        signUpPage.fillDetails("password");
        signUpPage.fillDetails("First Name");
        signUpPage.fillDetails("Last name");
        signUpPage.fillDetails("Company");
        new Select(signUpPage.country).selectByVisibleText("Canada");
        signUpPage.fillDetails("Address");
        signUpPage.fillDetails("Address 2");
        signUpPage.fillDetails("State");
        signUpPage.fillDetails("City");
        signUpPage.fillDetails("Zipcode");
        signUpPage.fillDetails("Mobile Number");
    }

    @And("the user should be able to click Create Account button")
    public void theUserShouldBeAbleToClick() {
        signUpPage.createAccountBtn.click();
    }

    @When("The user should be able to see {string}")
    public void theUserShouldBeAbleToSee(String accountText) {
        Assert.assertEquals(accountText,new AccountCreated().accountCreated.getText());
    }

    @And("the user should be able to click Continue")
    public void theUserShouldBeAbleToClickContinue() {
        new AccountCreated().continueBtn.click();
    }


}
