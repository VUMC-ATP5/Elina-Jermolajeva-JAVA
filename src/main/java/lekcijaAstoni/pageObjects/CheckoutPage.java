package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    WebDriver driver;

    private By pageTitle  = By.className("title");
    private By continueButton = By.id("continue");

    private By errorText = By.cssSelector("h3");
    private By firstNameInputField = By.id("first-name");

    public void setInputFirstName(String a){
        driver.findElement(firstNameInputField).sendKeys("name");
    }

    public WebElement getPageTitle (){
        return driver.findElement(pageTitle);
    }
    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }
    public String getErrorText(){
        return driver.findElement(errorText).getText();
    }

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
}