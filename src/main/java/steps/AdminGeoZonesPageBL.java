package steps;

import pages.AdminGeoZonesPage;

public class AdminGeoZonesPageBL {
    private AdminGeoZonesPage adminGeoZonesPage;

    public AdminGeoZonesPageBL(){
        adminGeoZonesPage = new AdminGeoZonesPage();
    }
    public AdminGeoZonesPageBL clickInputAll(){
        adminGeoZonesPage.getInputAll().click();
        return this;
    }

    public AdminGeoZonesPageBL clickInputFirst() {
        adminGeoZonesPage.getInputFirst().click();
        return this;
    }

    public AdminGeoZonesPageBL clickInputSecond() {
        adminGeoZonesPage.getInputSecond().click();
        return this;
    }

    public AdminGeoZonesPageBL clickAddNew() {
        adminGeoZonesPage.getAddNew().click();
        return new AdminGeoZonesPageBL();
    }

    public AdminGeoZonesPageBL clickEditFirst() {
        adminGeoZonesPage.getEditFirst().click();
        return new AdminGeoZonesPageBL();
    }

    public AdminGeoZonesPageBL clickEditSecond() {
        adminGeoZonesPage.getEditSecond().click();
        return new AdminGeoZonesPageBL();
    }

}
