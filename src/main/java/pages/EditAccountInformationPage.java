package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccountInformationPage extends MyAccountPage{

    @FindBy (id = "input-firstname")
    private WebElement inputFirstname;

    @FindBy (id = "input-lastname")
    private WebElement inputLastname;

    @FindBy (id = "input-email")
    private WebElement inputEmail;

    @FindBy (id = "input-telephone")
    private WebElement inputTelephone;

    @FindBy (xpath = "//a[contains(@href, 'account/account')]")
    private WebElement backButton;

    @FindBy (xpath = "//*[contains(@class, 'btn btn-primary')]")
    private WebElement continueButton;


    public WebElement getInputFirstname() {return inputFirstname;}

    public WebElement getInputLastname() {return inputLastname;}

    public WebElement getInputEmail() {return inputEmail;}

    public WebElement getInputTelephone() {return inputTelephone;}

    public WebElement getBackButton() {return backButton;}

    public WebElement getContinueButton() {return continueButton;}

}
