package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminEditCurrencyPage extends AdminCurrencyPage{

    @FindBy(xpath = "//button[@data-original-title='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//a[@data-original-title='Cancel']")
    private WebElement cancelButton;

    @FindBy(id = "input-title")
    private WebElement currencyTitle;

    @FindBy(id = "input-code")
    private WebElement code;

    @FindBy(id = "input-symbol-left")
    private WebElement symbolLeft;

    @FindBy(id = "input-symbol-right")
    private WebElement symbolRight;

    @FindBy(id = "input-decimal-place")
    private WebElement decimalPlaces;

    @FindBy(id = "input-value")
    private WebElement value;

    @FindBy(id = "input-status")
    private WebElement status;


    public WebElement getSaveButton() {return saveButton;}

    public WebElement getCancelButton() {return cancelButton;}

    public WebElement getCurrencyTitle() {return currencyTitle;}

    public WebElement getCode() {return code;}

    public WebElement getSymbolLeft() {return symbolLeft;}

    public WebElement getSymbolRight() {return symbolRight;}

    public WebElement getDecimalPlaces() {return decimalPlaces;}

    public WebElement getValue() {return value;}

    public WebElement getStatus() {return status;}

}