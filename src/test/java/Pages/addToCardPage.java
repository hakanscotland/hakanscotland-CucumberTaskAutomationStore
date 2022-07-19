package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;

public class addToCardPage{

    public addToCardPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]/a")
    public WebElement tShirtButton;

    @FindBy(xpath="//*[@id='center_column']/ul/li")
    public WebElement Faded_Short_Sleeve;

    @FindBy(id="group_1")
    public static WebElement SelectSize;

    @FindBy(name = "Blue")
    public WebElement FadedTshirtColor;

    @FindBy(name = "Submit")
    public WebElement addToCartButton;

   @FindBy(xpath=" //*[@id='layer_cart']/div[1]/div[2]/div[4]/span")
    public WebElement ContinueButton;

    @FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
    public WebElement DressesTab;

    @FindBy(xpath="//*[@id='subcategories']/ul/li[2]/div[1]/a")
    public WebElement EveningDressesTab;

    @FindBy(id="group_1")
    public static WebElement SelectSizeEveningDress;

    @FindBy(xpath = " //*[@id='center_column']/ul/li")
    public WebElement EveningPrintedDresses;

    @FindBy(name = "Beige")
    public WebElement PrintedTshirtColor;

    @FindBy(xpath="//*[@id='center_column']/ul/li[3]/div/div[1]/div/a[1]")
    public WebElement PrintedSummerDress;

    @FindBy(name = "Orange")
    public WebElement PrintedSummerDressColor;

    @FindBy(xpath = "//*[@id=\'layer_cart\']/div[1]/div[2]/div[4]/a/span")
    public WebElement ProceedToCheckoutButton;

    @FindBy(id="4_16_0_0")
    public WebElement RemoveButtonEveningDress;

    @FindBy(xpath="//*[@id='cart_quantity_up_1_4_0_0']/span/i")
    public WebElement AddButtonFadedShortSleeve;

    @FindBy(xpath = "//*[@id='header']/div[3]/div/div/div[3]/div/a")
    public WebElement ViewCart;

    @FindBy(xpath="//*[@id='product_5_25_0_0']/td[6]")
    public WebElement CartFistLineTotal;

    @FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[2]/td[6]")
    public WebElement CartSecondTotal;

    @FindBy(xpath="//*[@id='total_price']")
    public WebElement CartTotal;


}
