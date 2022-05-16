package steps;

import pages.AdminCurrencyPage;

public class AdminCurrencyPageBL {
    private AdminCurrencyPage adminCurrencyPage;

    public AdminCurrencyPageBL() {adminCurrencyPage = new AdminCurrencyPage();}
    public AdminCurrencyPageBL clickRefreshButton() {
        adminCurrencyPage.getRefreshButton().click();
        return  new AdminCurrencyPageBL();
    }
    public AdminCurrencyPageBL clickAddNewButton() {
        adminCurrencyPage.getAddNewButton().click();;
        return new AdminCurrencyPageBL();
    }
    public AdminCurrencyPageBL clickDeleteButton() {
        adminCurrencyPage.getDeleteButton().click();
        return new AdminCurrencyPageBL();
    }
}
