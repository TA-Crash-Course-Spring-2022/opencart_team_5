package steps;

import org.openqa.selenium.WebElement;
import pages.AdminAddEditTaxRatesPage;

public class AdminAddEditTaxRatesPageBL {
    private AdminAddEditTaxRatesPage adminAddEditTaxRatesPage;

    public AdminAddEditTaxRatesPageBL() {adminAddEditTaxRatesPage = new AdminAddEditTaxRatesPage();}
    public AdminAddEditTaxRatesPageBL clickSaveButton() {
        adminAddEditTaxRatesPage.getSaveButton().click();
        return new AdminAddEditTaxRatesPageBL();
    }
    public void clickCancelButton() {adminAddEditTaxRatesPage.getCancelButton().click();}
    public AdminAddEditTaxRatesPageBL taxNameInput(String name) {
        WebElement input = adminAddEditTaxRatesPage.getTaxName();
        input.clear();
        input.sendKeys(name);
        return this;
    }
    public AdminAddEditTaxRatesPageBL taxRateInput(String rate) {
        WebElement input = adminAddEditTaxRatesPage.getTaxRate();
        input.clear();
        input.sendKeys(rate);
        return this;
    }
    public AdminAddEditTaxRatesPageBL type() {
        adminAddEditTaxRatesPage.getType().click();
        return this;
    }
    public AdminAddEditTaxRatesPageBL clickCustomerGroup() {
        adminAddEditTaxRatesPage.getCustomerGroup().click();
        return this;
    }
    public AdminAddEditTaxRatesPageBL geoZone() {
        adminAddEditTaxRatesPage.getGeoZone().click();
        return this;
    }

}
