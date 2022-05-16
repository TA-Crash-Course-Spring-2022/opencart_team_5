package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminTaxRatesPage {
    @FindBy(xpath = "//*[@data-original-title='Add New']")
    private WebElement addNewButton;

    @FindBy(xpath = "//*[@data-original-title='Delete']")
    private WebElement deleteButton;

    @FindBy(xpath = "//*[@id='form-tax-rate']/div/table/thead/tr/td[1]/input")
    private WebElement checkboxButton;

    @FindBy(xpath = "//*[a='Tax Name']")
    private WebElement taxNameButton;

    @FindBy(xpath = "//*[a='Tax Rate']")
    private WebElement taxRateButton;

    @FindBy(xpath = "//*[a='Type']")
    private WebElement typeButton;

    @FindBy(xpath = "//*[a='Geo Zone']")
    private WebElement geoZoneButton;

    @FindBy(xpath = "//*[a='Date Added']")
    private WebElement dateAddedButton;

    @FindBy(xpath = "//*[a='Date Modified']")
    private WebElement dateModifiedButton;

    @FindBy(xpath = "//*[@name='selected[]']")
    private List<WebElement> checkbox;

    @FindBy(xpath = "//tbody//td[2]")
    private List<WebElement> taxName;

    @FindBy(xpath = "//tbody//td[3]")
    private List<WebElement> taxRate;

    @FindBy(xpath = "//tbody//td[4]")
    private List<WebElement> type;

    @FindBy(xpath = "//tbody//td[5]")
    private List<WebElement> geoZone;

    @FindBy(xpath = "//tbody//td[6]")
    private List<WebElement> dateAdded;

    @FindBy(xpath = "//tbody//td[7]")
    private List<WebElement> dateModified;

    @FindBy(xpath = "//*[@data-original-title='Edit']")
    private List<WebElement>editButton;

    public WebElement getAddNewButton() {
        return addNewButton;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }

    public WebElement getCheckboxButton() {
        return checkboxButton;
    }

    public WebElement getTaxNameButton() {
        return taxNameButton;
    }

    public WebElement getTaxRateButton() {
        return taxRateButton;
    }

    public WebElement getTypeButton() {
        return typeButton;
    }

    public WebElement getGeoZoneButton() {
        return geoZoneButton;
    }

    public WebElement getDateAddedButton() {
        return addNewButton;
    }

    public WebElement getDateModifiedButton() {
        return dateModifiedButton;
    }

    public WebElement getCheckbox(int id) {
        return checkbox.get(id);
    }

    public WebElement getTaxName(int id){
        return taxName.get(id);
    }

    public WebElement getTaxRate(int id) {
        return taxRate.get(id);
    }

    public WebElement getType(int id) {
        return type.get(id);
    }

    public WebElement getGeoZone(int id) {
        return geoZone.get(id);
    }

    public WebElement getDateAdded(int id) {
        return dateAdded.get(id);
    }

    public WebElement getDateModified(int id) {
        return dateModified.get(id);
    }

    public WebElement getEditButton(int id) {
        return editButton.get(id);
    }
}

