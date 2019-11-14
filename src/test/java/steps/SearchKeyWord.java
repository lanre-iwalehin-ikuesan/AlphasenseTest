package steps;

import Base.TestBase;
import Pages.SearchKeyWordPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class SearchKeyWord extends TestBase {

    @Given("^I am logged in$")
    public void i_am_logged_in() throws Throwable {
        SearchKeyWordPage Page = PageFactory.initElements(driver, SearchKeyWordPage.class);
        Page.TypeLoginEmail();
        Page.TypeLoginPassword();
        Page.ClickLogin();

    }

    @When("^I enter keyword in the search field$")
    public void i_enter_keyword_in_the_search_field() throws Throwable {
        SearchKeyWordPage Page = PageFactory.initElements(driver, SearchKeyWordPage.class);
        Page.TypesearchKeyword();
        Page.ClickMagnifyingGlass();
    }

    @When("^I click on magnifying glass$")
    public void i_click_on_magnifying_glass() throws Throwable {
        SearchKeyWordPage Page = PageFactory.initElements(driver, SearchKeyWordPage.class);
        Page.ClickMagnifyingGlass();
    }

    @Then("^result matching keyword and the quantity available should display$")
    public void resultMatchingKeywordAndTheQuantityAvailableShouldDisplay() throws Throwable {
        String ExpectedSearchResult = "\"DRESSES\"";
        String ActualSearchResult =  driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[1]")).getText();
        System.out.println(ActualSearchResult);
        Assert.assertEquals(ExpectedSearchResult, ActualSearchResult);

        String ExpectedSearchCount = "7 results have been found.";
        String ActualSearchCount =  driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[2]")).getText();
        System.out.println(ActualSearchCount);
        Assert.assertEquals(ExpectedSearchCount, ActualSearchCount);
    }
}
