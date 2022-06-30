package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "_username")
    public WebElement usernameInput;

    @FindBy(name = "_password")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement submitBtn;


}
