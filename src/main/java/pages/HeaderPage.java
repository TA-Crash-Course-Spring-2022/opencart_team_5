package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {
    @FindBy(xpath = "//*[@title='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = "//*[contains(@href, 'register')]")
    private WebElement myRegisterButton;

    @FindBy(xpath = "//a[starts-with(text(),'Login')]")
    private WebElement myLoginButton;

    public WebElement getMyAccountButton(){
        return myAccountButton;
    }

    public WebElement getMyRegisterButton(){
        return myRegisterButton;
    }

    public WebElement getMyLoginButton(){
        return myLoginButton;
    }
}