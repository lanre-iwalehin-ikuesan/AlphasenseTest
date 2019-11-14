package steps;

import Base.TestBase;
import Pages.CreateAccountPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
//import org.junit.Before;

import java.io.IOException;

public class createNewMember extends TestBase {
    public int random;

    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Given("^I am on the application home page$")
    public void i_am_on_the_application_home_page() throws Throwable {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Given("^I click the sign in link$")
    public void i_click_the_sign_in_link() throws Throwable {
        CreateAccountPage Page = PageFactory.initElements(driver, CreateAccountPage.class);
        Page.ClickSignIn();
    }


    @Given("^I enter email address for account creation$")
    public void i_enter_email_address_for_account_creation() throws Throwable {
        //CreateAccountPage Page = PageFactory.initElements(driver, CreateAccountPage.class);
        //Page.TypeCreateEmail();
        random = 100 + (int)(Math.random()*((1000 - 1) + 1));
        driver.findElement(By.id("email_create")).sendKeys("lanreikuesan" + random + "@gmail.com");
    }

    @Given("^I click button to create account$")
    public void i_click_button_to_create_account() throws Throwable {
        CreateAccountPage Page = PageFactory.initElements(driver, CreateAccountPage.class);
        Page.ClickCreateAccButt();
        Thread.sleep(3000);
    }

    @When("^I enter all mandatory details$")
    public void i_enter_all_mandatory_details() throws Throwable {
        CreateAccountPage Page = PageFactory.initElements(driver, CreateAccountPage.class);
        Page.ClickGender();
        Page.TypeUserFirstName();
        Page.TypeUserLastName();
        Thread.sleep(3000);
        Page.TypePassword();
        //Page.TypeAddfirstName();
        //Page.TypeAddLastName();
        Page.TypeAddLine1();
        Page.TypeCity();
        new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("Illinois");
        Page.TypePostCode();
        Page.TypePhoneNumber();
    }

    @When("^I click on register$")
    public void i_click_on_register() throws Throwable {
        CreateAccountPage Page = PageFactory.initElements(driver, CreateAccountPage.class);
        Page.ClickRegister();

    }

    @Then("^My acoount should be successfully created$")
    public void my_acoount_should_be_successfully_created() throws Throwable {
        String ExpectedMessage = "Welcome to your account. Here you can manage all of your personal information and orders.";
        String ActualMessage =  driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
        System.out.println(ActualMessage);
        Assert.assertEquals(ExpectedMessage, ActualMessage);
    }
}
