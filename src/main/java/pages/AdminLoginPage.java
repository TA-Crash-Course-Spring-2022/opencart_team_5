package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class AdminLoginPage {
    @FindBy(xpath = "//*[@name='username']")
    private WebElement usernameInput;

    @FindBy(xpath = "//*[@name='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@class='help-block]']")
    private WebElement forgottenPassword;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    private WebElement loginButton;

    public WebElement getUsername() {
        return usernameInput;
    }
    public WebElement getPassword() {
        return passwordInput;
    }
    public WebElement getForgottenPassword() {
        return forgottenPassword;
    }
    public WebElement getLoginButton() {
        return loginButton;
    }
}