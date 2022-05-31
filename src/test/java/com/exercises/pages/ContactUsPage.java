package com.exercises.pages;

import com.exercises.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ContactUsPage extends BasePage{

    @FindBy(xpath = "//*[text()='Success! Your details have been submitted successfully.']")
    public WebElement textSuccess;

    @FindBy(css = ".fa.fa-angle-double-left")
    public WebElement homeButton;

    public WebElement contactUs(String name){
        return Driver.get().findElement(By.xpath("//*[@name ='"+name+"']"));
    }

    @FindBy(xpath = "//*[text()='Get In Touch']")
    public WebElement getInTouch;


}
