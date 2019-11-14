package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchKeyWordPage {
    @FindBy(how= How.ID, using = "search_query_top")
    public static WebElement SearchField;

    @FindBy(how= How.NAME, using = "submit_search")
    public static WebElement MagnifyingGlass;

    @FindBy(how= How.ID, using = "email")
    public static WebElement UserEmail;

    @FindBy(how= How.ID, using = "passwd")
    public static WebElement UserPassword;

    @FindBy(how= How.ID, using = "SubmitLogin")
    public static WebElement LoginButton;

    public void TypesearchKeyword() {SearchField.sendKeys("Dresses");}
    public void ClickMagnifyingGlass() {MagnifyingGlass.click();}
    public void TypeLoginEmail() {UserEmail.sendKeys("lanre_iwalehin@hotmail.co.uk");}
    public void TypeLoginPassword() {UserPassword.sendKeys("kolodo");}
    public void ClickLogin() {LoginButton.click();}
}
