package com.exercises.step_definitions;

import com.exercises.pages.ContactUsPage;
import com.exercises.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;


public class ContactUsStepDefs {
    ContactUsPage contactUsPage = new ContactUsPage();
    @When("the user should be able to click on Contact Us button")
    public void theUserShouldBeAbleToClickOnContactUsButton() {
        contactUsPage.basePageButtons(" Contact us").click();

    }
    @And("the user should be able to see Get In Touch")
    public void theUserShouldBeAbleToSeeGetInTouch() {
        String expected = contactUsPage.getInTouch.getText();
        String actual = "GET IN TOUCH";

        Assert.assertEquals(expected,actual);
    }

    @Then("the user should be able to enter the {string}, {string}, {string} and {string}")
    public void theUserShouldBeAbleToEnterTheAnd(String name, String email, String subject, String message) {

        contactUsPage.contactUs("name").sendKeys(name);
        contactUsPage.contactUs("email").sendKeys(email);
        contactUsPage.contactUs("subject").sendKeys(subject);
        contactUsPage.contactUs("message").sendKeys(message);

    }

    @Then("the user should be able to upload file")
    public void theUserShouldBeAbleToUploadFile() {

        contactUsPage.contactUs("upload_file").sendKeys("C:\\Users\\Jung Ah\\cucumber\\automationExercises_cucumber\\src\\test\\resources\\newFile.txt");
    }

    @And("the user should be able to click Submit button")
    public void theUserShouldBeAbleToClickSubmitButton() {

        contactUsPage.contactUs("submit").click();
    }

    @Then("the user should be able to click OK button")
    public void theUserShouldBeAbleToClickOKButton() {

        Alert alert = Driver.get().switchTo().alert();
        alert.accept();
    }
    @And("the user should be able to verify {string}")
    public void theUserShouldBeAbleToVerify(String text) {
        String expected = contactUsPage.textSuccess.getText();
        Assert.assertEquals(expected,text);
    }
    @Then("the user should be able to click Home button and verify that landed to home page successfully")
    public void theUserShouldBeAbleToClickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        contactUsPage.homeButton.click();
        String actual = Driver.get().getCurrentUrl();
        String expected = "https://www.automationexercise.com/";

        Assert.assertEquals(expected,actual);
    }



}
