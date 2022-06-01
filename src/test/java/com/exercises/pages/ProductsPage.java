package com.exercises.pages;

import com.exercises.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage{

    @FindBy(xpath = "//h2[text()='All Products']")
    public WebElement allProduct;

    @FindBy(xpath = "//div[@class = 'product-image-wrapper']/div/div/img")
    public List<WebElement> imgProduct;

    @FindBy(xpath = "//div[@class = 'choose']/ul/li")
    public List<WebElement> viewProduct;

    @FindBy(xpath = "//div[@class = 'product-information']/p") // category , Availability , Condition , Brand --> located
    public List<WebElement> productDetails;

    public WebElement nameAndPricePro(String text){
        return Driver.get().findElement(By.xpath("//*[text() = '"+text+"']")); // price and productName --> located
    }

}
