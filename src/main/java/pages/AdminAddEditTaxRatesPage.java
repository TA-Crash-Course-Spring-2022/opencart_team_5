package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminAddEditTaxRatesPage extends AdminTaxRatesPage{

    @FindBy(xpath = "//button[@data-original-title='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//a[@data-original-title='Cancel']")
    private WebElement cancelButton;

    @FindBy(id = "input-name")
    private WebElement taxName;

    @FindBy(id = "input-rate")
    private WebElement taxRate;

    @FindBy(id = "input-type")
    private WebElement type;

    @FindBy(name = "tax_rate_customer_group[]")
    private WebElement customerGroup;

    @FindBy(id = "input-geo-zone")
    private WebElement geoZone;


    public WebElement getSaveButton() {return saveButton;}

    public WebElement getCancelButton() {return cancelButton;}

    public WebElement getTaxName() {return taxName;}

    public WebElement getTaxRate() {return taxRate;}

    public WebElement getType() {return type;}

    public WebElement getCustomerGroup() {return customerGroup;}

    public WebElement getGeoZone() {return geoZone;}

}
