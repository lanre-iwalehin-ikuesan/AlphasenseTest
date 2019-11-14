package steps;

import Base.TestBase;
import Pages.Add2CartAndCheckOutPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class Addproduct2CartAndCheckout extends TestBase {
    @When("^I add a random product to cart and checkout$")
    public void i_add_a_random_product_to_cart_and_checkout() throws Throwable {
        Add2CartAndCheckOutPage Page = PageFactory.initElements(driver, Add2CartAndCheckOutPage.class);
        Page.ClickAddToCart();
        Page.ClosePopUp();
        Page.ClickCart();
        Page.ClickCheckout1();
        Page.ClickCheckout2();
        Page.ClickCheckout3();
        Page.ClickPaymentOption();

    }
    @Then("^my order should be confirmed$")
    public void my_order_should_be_confirmed() throws Throwable {
        Add2CartAndCheckOutPage Page = PageFactory.initElements(driver, Add2CartAndCheckOutPage.class);
        Page.VerifyOrderCon();
    }


}
