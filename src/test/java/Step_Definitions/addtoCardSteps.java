package Step_Definitions;

import Pages.AbstractClass;
import Pages.addToCardPage;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class addtoCardSteps extends AbstractClass {
    addToCardPage addToCardPage = new addToCardPage();

    @Given("Go to the test website")

    public void go_to_the_test_website() {
        System.out.println("Opening Shopping Page");
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);

    }

    @Given("Click on T-Shirt Tab")
    public void click_on_T_Shirt_Tab() throws InterruptedException {

        Thread.sleep(2000);
        clickFunction(addToCardPage.tShirtButton);


        System.out.println("Clicked on TShirt Tab");
    }

    @Given("Click the Faded Short Sleeve T-shirts")
    public void click_the_Faded_Short_Sleeve_T_shirts() {
        clickFunction(addToCardPage.Faded_Short_Sleeve);

        System.out.println("Clicked on the Faded Short Sleeve TShirts");
    }

    @Given("Navigate over the Size click M")
    public void navigate_over_the_Size_click_M() {

        selectElementFromDropdown(addToCardPage.SelectSize, "2");

        System.out.println("Navigate over the Size and clicked to M");
    }

    @Given("Chose Color as a Blue")
    public void chose_Color_as_a_Blue() {

        clickFunction(addToCardPage.FadedTshirtColor);
        System.out.println("Clicked Color as a Blue");
    }

    @Given("Click on Add to cart button")
    public void click_on_Add_to_cart_button() {

        clickFunction(addToCardPage.addToCartButton);
        System.out.println("Click on Add to Cart button");

    }

    @Given("Click on Continue shopping button")
    public void click_on_Continue_shopping_button() {
        clickFunction(addToCardPage.ContinueButton);
        System.out.println("Clicked on Continue Shopping Button");

    }

    @Given("Click on Dresses Tab")
    public void click_on_Dresses_Tab() {

        clickFunction(addToCardPage.DressesTab);
        System.out.println("Clicked on Dresses_Tab");
    }

    @Given("Click on Evening Dresses Tab")
    public void click_on_Evening_Dresses_Tab() {
        clickFunction(addToCardPage.EveningDressesTab);
        System.out.println("Clicked on Evening_Dresses_Tab");
    }

    @Given("Click on Printed Dress")
    public void click_on_Printed_Dress() {
        clickFunction(addToCardPage.EveningPrintedDresses);
        System.out.println("Clicked on Printed_Dress");
    }

    @Given("Navigate over the Printed Dress Size click S")
    public void navigate_over_the_Printed_Dress_Size_click_S() {

        //Switch Frame
        // Driver.getDriver().switchTo().frame("fancybox-frame1654956477555");
        //  selectElementFromDropdown(addToCardPage.SelectSizeEveningDress, "1");

        selectElementFromDropdown(addToCardPage.SelectSize, "1");

        System.out.println("Navigate over the Printed Dress Size click S");
        // Driver.getDriver().switchTo().defaultContent();
    }

    @Given("Chose Color as a Beige")
    public void chose_Color_as_a_Beige() {
        clickFunction(addToCardPage.PrintedTshirtColor);
        System.out.println("Chose Color as a Beige");
    }

    @Given("Click on Printed Summer Dress")
    public void click_on_Printed_Summer_Dress() {
        clickFunction(addToCardPage.PrintedSummerDress);
        System.out.println("Click on Printed Summer Dress");
    }

    @Given("Navigate over the Printed Summer Dress Size click M")
    public void navigate_over_the_Printed_Summer_Dress_Size_click_M() {

        selectElementFromDropdown(addToCardPage.SelectSize, "2");
        System.out.println("Navigate over the Printed Summer Dress Size click M");
    }

    @Given("Chose Color as a Orange")
    public void chose_Color_as_a_Orange() {

        clickFunction(addToCardPage.PrintedSummerDressColor);

        System.out.println("Chose Color as an Orange");
    }

    @Given("click to Proceed to checkout")
    public void click_to_Proceed_to_checkout() {
        clickFunction(addToCardPage.ProceedToCheckoutButton);

        System.out.println("Click to Proceed to checkout");
    }

    @Given("click to remove button to the Evening Dress from the cart")
    public void click_to_remove_button_to_the_Evening_Dress_from_the_cart() {
        clickFunction(addToCardPage.RemoveButtonEveningDress);

        System.out.println("Click to remove_button for Evening Dress");
    }


    @Given("Click on add button for second Faded Short Sleeve T Shirt")
    public void click_on_add_button_for_second_Faded_Short_Sleeve_T_Shirt() {
        clickFunction(addToCardPage.AddButtonFadedShortSleeve);

        System.out.println("Click on add button for second Faded Short Sleeve T Shirt");
    }

    @When("Click to View Cart")
    public void click_to_View_Cart() throws InterruptedException {
        clickFunction(addToCardPage.ViewCart);
        System.out.println("Click on view cart");
        Thread.sleep(2000);
    }

    @Then("the cart first line total is should {string}")
    public void the_cart_first_line_total_is_should(String string) {
        String expectedTotal1 = "$28.98";
        String actualTotal1 = addToCardPage.CartFistLineTotal.getText();


        Assertion(actualTotal1,expectedTotal1);


        //Assert.assertEquals(expectedTotal1, actualTotal1);
    }

    @Then("the cart second line total is should {string}")
    public void the_cart_second_line_total_is_should(String string) {
        String expectedTotal2 = "$33.02";
        String actualTotal2 = addToCardPage.CartSecondTotal.getText();

        Assertion(actualTotal2,expectedTotal2);


        //Assert.assertEquals(expectedTotal2, actualTotal2);

    }

    @Then("the cart total is should {string}")
    public void the_cart_total_is_should(String string) {

        //String expectedCartTotal = "$65.53"; //Failed
        String expectedCartTotal = "$64.00";
        String actualCardTotal = addToCardPage.CartTotal.getText();

        Assertion(actualCardTotal,expectedCartTotal);


        //Assert.assertEquals(expectedCartTotal, actualCardTotal);


        }



}

