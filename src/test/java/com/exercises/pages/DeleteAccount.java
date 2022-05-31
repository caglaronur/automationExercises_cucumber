package com.exercises.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAccount extends BasePage{

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement deleteAccountBtn;

    @FindBy(tagName = "h1")
    public WebElement accountDeleteText;
}
