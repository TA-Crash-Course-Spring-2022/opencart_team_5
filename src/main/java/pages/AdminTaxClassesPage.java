package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminTaxClassesPage extends BasePage{
    @FindBy(xpath = "//*[@id='form-tax-class']/div/table/thead/tr/td[1]/input")
    private WebElement inputAll;

    @FindBy(xpath = "//*[@id='form-tax-class']/div/table/tbody/tr[1]/td[1]/input")
    private WebElement inputFirst;

    @FindBy(xpath = "//*[@id='form-tax-class']/div/table/tbody/tr[2]/td[1]/input")
    private WebElement inputSecond;

    @FindBy(xpath = "//*[@id='content']/div[1]/div/div/a")
    private WebElement addNew;

    @FindBy(xpath = "//*[@id='form-tax-class']/div/table/tbody/tr[1]/td[3]/a")
    private WebElement editFirst;

    @FindBy(xpath = "//*[@id='form-tax-class']/div/table/tbody/tr[2]/td[3]/a")
    private WebElement editSecond;

    public WebElement getInputAll() {
        return inputAll;
    }

    public WebElement getInputFirst() {
        return inputFirst;
    }

    public WebElement getInputSecond() {
        return inputSecond;
    }

    public WebElement getAddNew() {
        return addNew;
    }

    public WebElement getEditFirst() {
        return editFirst;
    }

    public WebElement getEditSecond() {
        return editSecond;
    }
}
