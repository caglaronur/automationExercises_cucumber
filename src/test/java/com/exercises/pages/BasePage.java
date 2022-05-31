package com.exercises.pages;


import com.exercises.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedInAsName;


    public WebElement basePageButtons(String text){
        return Driver.get().findElement(By.xpath("//*[text()='"+text+"']"));
    }

}


