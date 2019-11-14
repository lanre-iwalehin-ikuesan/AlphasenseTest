package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateAccountPage {
    @FindBy(how= How.LINK_TEXT, using = "Sign in")
    public static WebElement Signin;

    @FindBy(how= How.ID, using = "email_create")
    public static WebElement CreateAccEmail;

    @FindBy(how= How.ID, using = "SubmitCreate")
    public static WebElement CreateAccSubButt;

    @FindBy(how= How.ID, using = "id_gender2")
    public static WebElement SelGender;

    @FindBy(how= How.ID, using = "customer_firstname")
    public static WebElement FirstName;

    @FindBy(how= How.ID, using = "customer_lastname")
    public static WebElement LastName;

    @FindBy(how= How.ID, using = "passwd")
    public static WebElement Password;

    @FindBy(how= How.ID, using = "firstname")
    public static WebElement AddFirstName;

    @FindBy(how= How.ID, using = "lastname")
    public static WebElement AddLastName;

    @FindBy(how= How.ID, using = "address1")
    public static WebElement AddLine1;

    @FindBy(how= How.ID, using = "city")
    public static WebElement City;

    @FindBy(how= How.ID, using = "id_state")
    public static WebElement State;

    @FindBy(how= How.ID, using = "postcode")
    public static WebElement PostCode;

    @FindBy(how= How.ID, using = "phone_mobile")
    public static WebElement PhoneNumber;

    @FindBy(how= How.ID, using = "submitAccount")
    public static WebElement RegisterButton;

    @FindBy(how= How.XPATH, using = "//*[@id=\"center_column\"]/p")
    public static WebElement successMessage;

    public void ClickSignIn(){Signin.click();
    }
    public void TypeCreateEmail() {CreateAccEmail.sendKeys("lanreikuesan@gmail.com");
    }
    public void ClickCreateAccButt() {CreateAccSubButt.click();
    }
    public void ClickGender() {SelGender.click();
    }
    public void TypeUserFirstName() {FirstName.sendKeys("Bubu");
    }
    public void TypeUserLastName() {LastName.sendKeys("Baba");
    }
    public void TypePassword() {Password.sendKeys("Adun1401");
    }
    public void TypeAddfirstName() {AddFirstName.sendKeys("Bubbu");
    }
    public void TypeAddLastName() {AddLastName.sendKeys("Baba");
    }
    public void TypeAddLine1() {AddLine1.sendKeys("Viher 3 A");
    }
    public void TypeCity() {City.sendKeys("Chicago");
    }
    public void TypePostCode() {PostCode.sendKeys("00000");
    }
   public void TypePhoneNumber() {PhoneNumber.sendKeys("12345678");}
   public void ClickRegister() {RegisterButton.click();}




}
