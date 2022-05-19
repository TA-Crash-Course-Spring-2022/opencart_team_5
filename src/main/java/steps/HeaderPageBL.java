package steps;
import pages.HeaderPage;

public class HeaderPageBL {
    private HeaderPage headerPage;

    public HeaderPageBL(){
        headerPage = new HeaderPage();
    }
    public HeaderPageBL clickMyAccountButton(){
        headerPage.getMyAccountButton().click();
        return this;
    }
    public HeaderPageBL clickRegisterButton(){
        headerPage.getMyRegisterButton().click();
        return this;
    }
    public HeaderPageBL clickLoginButton(){
        headerPage.getMyLoginButton().click();
        return this;
    }
}
