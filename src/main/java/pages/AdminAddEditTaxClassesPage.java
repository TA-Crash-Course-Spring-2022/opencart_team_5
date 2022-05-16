package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminAddEditTaxClassesPage extends AdminTaxClassesPage{

    @FindBy(id = "input-title")
    private WebElement inputTaxClassTitle;

    @FindBy(id = "input-description")
    private WebElement inputDescription;

    @FindBy(xpath = "//select[contains(@name, 'tax_rule[][tax_rate_id]')]")
    private List<WebElement> taxRate;

    @FindBy (xpath = "//select[contains(@name, 'tax_rule[][based]')]")
    private List<WebElement> basedOn;

    @FindBy(xpath = "//input[contains(@name, 'tax_rule[][priority]')]")
    private List<WebElement> priority;

    @FindBy(xpath = "//button[@title='Remove']")
    private WebElement removeButton;

    @FindBy(xpath = "//button[@data-original-title='Add Rule']")
    private WebElement addRule;

    @FindBy(xpath = "//button[@data-original-title='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//button[@data-original-title='Cancel']")
    private WebElement cancelButton;


    public WebElement getInputTaxClassTitle () {return inputTaxClassTitle;}

    public WebElement getInputDescription() {return inputDescription;}

    public WebElement getTaxRate(int id) {return  taxRate.get(id);}

    public WebElement getBasedOn(int id) {return basedOn.get(id);}

    public WebElement getPriority(int id) {return priority.get(id);}

    public WebElement getRemoveButton() {return removeButton;}

    public WebElement getAddRule() {return addRule;}

    public WebElement getSaveButton() {return saveButton;}

    public WebElement getCancelButton() {return cancelButton;}

}