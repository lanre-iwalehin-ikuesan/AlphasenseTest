package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Add2CartAndCheckOutPage {
    @FindBy(how= How.LINK_TEXT, using = "Add to cart")
    public static WebElement AddToCart;

    @FindBy(how= How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[1]/span")
    public static WebElement ClosePopUp;

    @FindBy(how= How.XPATH, using = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    public static WebElement ViewCart;

    @FindBy(how= How.LINK_TEXT, using = "Proceed to checkout")
    public static WebElement Checkout1;

    @FindBy(how= How.NAME, using = "processAddress")
    public static WebElement Checkout2;

    @FindBy(how= How.NAME, using = "processCarrier")
    public static WebElement Checkout3;

    @FindBy(how= How.XPATH, using = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    public static WebElement PaymentOption;

    @FindBy(how= How.XPATH, using = "//*[@id=\"center_column\"]/h1")
    public static WebElement OrderConfirmation;


    public void ClickAddToCart() {AddToCart.click();}
    public void ClosePopUp() {ClosePopUp.click(); }
    public void ClickCart() {ViewCart.click();}
    public void ClickCheckout1() {Checkout1.click();}
    public void ClickCheckout2() {Checkout2.click(); }
    public void ClickCheckout3() {Checkout3.click();}
    public void ClickPaymentOption() {PaymentOption.click();}
    public void VerifyOrderCon() {OrderConfirmation.isDisplayed();}
}
