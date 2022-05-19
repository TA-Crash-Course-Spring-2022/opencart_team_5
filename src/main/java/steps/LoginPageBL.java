package steps;

import pages.LoginPage;
import pages.MyAccountPage;
import datamodel.LoginModel;

public class LoginPageBL {

    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    public LoginPageBL(){
        loginPage = new LoginPage();
    }
    public LoginPageBL loginPerson(LoginModel loginModel) {
        enterEmail(loginModel.getEmail());
        enterPassword(loginModel.getPassword());
        clickOnLoginContinueButton();
        return this;
    }
    private void enterEmail(String email) {
        loginPage.getLoginEmail().clear();
        loginPage.getLoginEmail().sendKeys(email);
    }

    private void enterPassword(String password) {
        loginPage.getLoginPassword().clear();
        loginPage.getLoginPassword().sendKeys(password);
    }

    private void clickOnLoginContinueButton() {
        loginPage.getLoginButton().click();
    }
}
