package steps;

import pages.AdminTaxClassesPage;

public class AdminTaxClassesPageBL {
    private AdminTaxClassesPage adminTaxClassesPage;

    public AdminTaxClassesPageBL(){
        adminTaxClassesPage = new AdminTaxClassesPage();
    }
    public AdminTaxClassesPageBL clickInputAll(){
        adminTaxClassesPage.getInputAll().click();
        return this;
    }

    public AdminTaxClassesPageBL clickInputFirst() {
        adminTaxClassesPage.getInputFirst().click();
        return this;
    }

    public AdminTaxClassesPageBL clickInputSecond() {
        adminTaxClassesPage.getInputSecond().click();
        return this;
    }

    public AdminTaxClassesPageBL clickAddNew() {
        adminTaxClassesPage.getAddNew().click();
        return new AdminTaxClassesPageBL();
    }

    public AdminTaxClassesPageBL clickEditFirst() {
        adminTaxClassesPage.getEditFirst().click();
        return new AdminTaxClassesPageBL();
    }

    public AdminTaxClassesPageBL clickEditSecond() {
        adminTaxClassesPage.getEditSecond().click();
        return new AdminTaxClassesPageBL();
    }

}