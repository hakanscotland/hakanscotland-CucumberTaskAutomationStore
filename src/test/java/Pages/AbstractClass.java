package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.Driver;

public  abstract class AbstractClass {

    public WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,5);

    public void clickFunction(WebElement clickElement){

        wait.until(ExpectedConditions.elementToBeClickable(clickElement));

        clickElement.click();
    }

    public void sendKeysFunction(WebElement sendKeysElement, String value){

        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }

    public void selectElementFromDropdown(WebElement dropdown,String element){
        Select slc = new Select(dropdown);
       // slc.selectByVisibleText(element);
        slc.selectByValue(element);
    }

    public void Assertion(String actual, String expected){
       //wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual,expected);
        System.out.println("Line Total Value :  " + actual);

    }


}
