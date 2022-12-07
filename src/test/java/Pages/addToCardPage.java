package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;

public class addToCardPage{

    public addToCardPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(linkText="MEN")
    public WebElement menButton;

    @FindBy(xpath="/html//div[@id='maincontainer']//div[@class='contentpanel']/ul/li[2]/div/a[@href='https://automationteststore.com/index.php?rt=product/category&path=58_59']")
    public WebElement fragranceSet;

    @FindBy(css="a[title='Armani Code after shave balm']")
    public static WebElement armaniCodeAdd;

    @FindBy(linkText = "Add to Cart")
    public WebElement addToCart;


    @FindBy(xpath="/html//table[@id='totals_table']/tbody/tr[1]/td[2]")
    public WebElement CartFistLineTotal;

    @FindBy(xpath="/html//table[@id='totals_table']/tbody/tr[2]/td[2]")
    public WebElement CartSecondTotal;

    @FindBy(xpath="/html//table[@id='totals_table']//span[@class='bold totalamout']")
    public WebElement CartTotal;

    @FindBy(linkText = "Continue Shopping")
    public WebElement continueShopping;





}
