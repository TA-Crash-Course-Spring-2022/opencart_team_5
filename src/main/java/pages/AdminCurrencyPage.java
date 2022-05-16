package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminCurrencyPage {
    @FindBy(xpath = "//a[@data-original-title = 'Refresh Currency Values']")
    private WebElement refreshButton;

    @FindBy(xpath = "//a[@data-original-title = 'Add New']")
    private WebElement addNewButton;

    @FindBy(xpath = "//*[@data-original-title = 'Delete']")
    private WebElement deleteButton;

    @FindBy(xpath = "//*[@name = 'selected[]']")
    private List<WebElement> checkbox;

    @FindBy(xpath = "//tbody//td[2]")
    private List<WebElement> currencyTitle;

    @FindBy(xpath = "//tbody//td[3]")
    private List<WebElement> code;

    @FindBy(xpath = "//tbody//td[4]")
    private List<WebElement> value;

    @FindBy(xpath = "//tbody//td[5]")
    private List<WebElement> lastUpdated;

    @FindBy(xpath = "//a[@data-original-title = 'Edit']")
    private List<WebElement> editButton;


    public WebElement getRefreshButton() {return refreshButton;}

    public WebElement getAddNewButton() {return addNewButton;}

    public WebElement getDeleteButton() {return deleteButton;}

    public WebElement getCheckbox(int id) {return checkbox.get(id);}

    public WebElement getCurrencyTitle(int id) {return currencyTitle.get(id);}

    public WebElement getCode(int id) {return code.get(id);}

    public WebElement getValue(int id) {return value.get(id);}

    public WebElement getLastUpdated(int id) {return lastUpdated.get(id);}

    public WebElement getEditButton(int id) {return editButton.get(id);}

}
