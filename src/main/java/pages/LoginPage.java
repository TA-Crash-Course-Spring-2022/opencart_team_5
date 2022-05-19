package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(xpath = "//*[@name='email']")
    private WebElement loginEmail;

    @FindBy(xpath = "//*[@name='password']")
    private WebElement loginPassword;

    @FindBy(xpath = "//input[contains(@value, 'Login')]")
    private WebElement loginButton;

    public WebElement getLoginEmail(){
        return loginEmail;
    }

    public WebElement getLoginPassword(){
        return loginPassword;
    }

    public WebElement getLoginButton(){
        return loginButton;
    }
}
