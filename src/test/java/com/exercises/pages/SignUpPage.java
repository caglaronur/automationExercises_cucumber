package com.exercises.pages;


import com.exercises.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SignUpPage extends BasePage{

    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement enterAccountInfoText;

    @FindBy(id = "uniform-id_gender1")
    public WebElement mrButton;

    @FindBy(id = "uniform-id_gender2")
    public WebElement mrsButton;

    @FindBy(id = "days")
    public WebElement days;

    @FindBy(id = "months")
    public WebElement months;

    @FindBy(id = "years")
    public WebElement years;

    @FindBy(xpath = "//*[text()='Sign up for our newsletter!']")
    public WebElement newsletterCheckBtn;

    @FindBy(xpath = "//*[text()='Receive special offers from our partners!']")
    public WebElement ourPartnersCheckBtn;

    @FindBy(xpath = "//input[contains(@class, 'form-control')]")
    public List<WebElement> fillDetails;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(xpath = "//*[text()='Create Account']")
    public WebElement createAccountBtn;






    public void fillDetails(String text){

        switch (text) {
            case "password" -> fillDetails.get(2).sendKeys(ConfigurationReader.get("password"));
            case "First Name" -> fillDetails.get(3).sendKeys("Olcay");
            case "Last name" -> fillDetails.get(4).sendKeys("Sahan");
            case "Company" -> fillDetails.get(5).sendKeys("Microsoft");
            case "Address" -> fillDetails.get(6).sendKeys("BürgerStraße 5");
            case "Address 2" -> fillDetails.get(7).sendKeys("Bilmiyorum");
            case "State" -> fillDetails.get(8).sendKeys("Igdir");
            case "City" -> fillDetails.get(9).sendKeys("München");
            case "Zipcode" -> fillDetails.get(10).sendKeys("19079");
            case "Mobile Number" -> fillDetails.get(11).sendKeys("1234567890");
            default -> System.out.println("Formuler ist Falsch");
        }

    }






    public void selectDate(WebElement element){

        Select select = new Select(element);

        if (days.equals(element)) {
            select.selectByVisibleText("1");
        }else if (months.equals(element)){
            select.selectByVisibleText("February");
        }else if(years.equals(element))
            select.selectByVisibleText("2001");
        else
            System.out.println("Datum ist falsch");

    }
}
