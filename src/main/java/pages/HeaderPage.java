package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {
    @FindBy(xpath = "")
    private WebElement myAccountButton;

    @FindBy(xpath = "")
    private WebElement myRegisterButton;
}