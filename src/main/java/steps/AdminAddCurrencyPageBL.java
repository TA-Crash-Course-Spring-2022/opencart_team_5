package steps;

import org.openqa.selenium.WebElement;
import pages.AdminAddCurrencyPage;
import pages.AdminCurrencyPage;

public class AdminAddCurrencyPageBL {
    private AdminAddCurrencyPage adminAddCurrencyPage;

    public AdminAddCurrencyPageBL() {adminAddCurrencyPage = new AdminAddCurrencyPage();}
    public AdminAddCurrencyPageBL clickSaveButton() {
        adminAddCurrencyPage.getSaveButton().click();
        return new AdminAddCurrencyPageBL();
    }
    public void clickCancelButton() {adminAddCurrencyPage.getCancelButton().click();}
    public AdminAddCurrencyPageBL currencyTitleInput(String title) {
        WebElement input = adminAddCurrencyPage.getCurrencyTitle();
        input.clear();
        input.sendKeys(title);
        return this;
    }
    public AdminAddCurrencyPageBL codeInput(String code) {
        WebElement input = adminAddCurrencyPage.getCode();
        input.clear();
        input.sendKeys(code);
        return this;
    }
    public AdminAddCurrencyPageBL symbolLeftInput(String symbol) {
        WebElement input = adminAddCurrencyPage.getSymbolLeft();
        input.clear();
        input.sendKeys(symbol);
        return this;
    }
    public AdminAddCurrencyPageBL symbolRightInput(String symbol) {
        WebElement input = adminAddCurrencyPage.getSymbolRight();
        input.clear();
        input.sendKeys(symbol);
        return this;
    }
    public AdminAddCurrencyPageBL decimalPlacesInput(String text) {
        WebElement input = adminAddCurrencyPage.getDecimalPlaces();
        input.clear();
        input.sendKeys(text);
        return this;
    }
    public AdminAddCurrencyPageBL valueInput(String value) {
        WebElement input = adminAddCurrencyPage.getValue();
        input.clear();
        input.sendKeys(value);
        return this;
    }
    public AdminAddCurrencyPageBL clickStatus() {
        adminAddCurrencyPage.getStatus().click();
        return this;
    }
}



