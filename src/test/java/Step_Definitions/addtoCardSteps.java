package Step_Definitions;

import Pages.AbstractClass;
import Pages.addToCardPage;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import static Utilities.BrowserUtils.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class addtoCardSteps extends AbstractClass {
    addToCardPage addToCardPage = new addToCardPage();

    @Given("Go to the automation_test_store website")

    public void go_to_the_automation_test_store_website () {
        System.out.println("Opening Shopping Page");
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);

    }

    @When("Click on Men Tab")
    public void click_on_Men_Tab() throws InterruptedException {

      waitForVisibility(addToCardPage.menButton, 10);
       clickFunction(addToCardPage.menButton);


        System.out.println("Clicked on Men Tab");
    }

    @When("Click the Fragrance Set")
    public void click_the_Fragrance_Set() {
        clickFunction(addToCardPage.fragranceSet);

        System.out.println("Clicked on the Fragrance Set");
    }

    @When("Click Armani Code after shave balm")
    public void click_armani_code_after_shave_balm() {
        clickFunction(addToCardPage.armaniCodeAdd);

        System.out.println("Clicked on the Armani Code after shave balm");
    }

    @When("Click on Add to Card Button")
    public void click_add_to_card_button() {

        clickFunction(addToCardPage.addToCart);
        System.out.println("Clicked on Add to Card Button");
    }


    @Then("the cart first line total is should {string}")
    public void the_cart_first_line_total_is_should(String string) {
        String expectedTotal1 = "$42.00";
        String actualTotal1 = addToCardPage.CartFistLineTotal.getText();


        Assertion(actualTotal1,expectedTotal1);


    }

    @Then("the cart second line total is should {string}")
    public void the_cart_second_line_total_is_should(String string) {
        String expectedTotal2 = "$2.00";
        String actualTotal2 = addToCardPage.CartSecondTotal.getText();

        Assertion(actualTotal2,expectedTotal2);


    }

    @Then("the cart total is should {string}")
    public void the_cart_total_is_should(String string) {

        String expectedCartTotal = "$44.00";
        String actualCardTotal = addToCardPage.CartTotal.getText();

        Assertion( expectedCartTotal, actualCardTotal);

        clickFunction(addToCardPage.continueShopping);


    }





}

