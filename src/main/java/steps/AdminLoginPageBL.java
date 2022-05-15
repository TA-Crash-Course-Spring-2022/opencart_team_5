package steps;
import pages.AdminLoginPage;
import org.openqa.selenium.ElementNotInteractableException;

public class AdminLoginPageBL {
    private AdminLoginPage adminLoginPageBL;

    public AdminLoginPageBL() {
        adminLoginPageBL = new AdminLoginPage();
    }

    public AdminLoginPageBL fillUserNameInput(String username) {
        try {
            adminLoginPageBL.getUsername().clear();
        } catch (ElementNotInteractableException cannotInteract) {
            adminLoginPageBL.getUsername().clear();
        }
        adminLoginPageBL.getUsername().sendKeys(username);
        return this;
    }

    public AdminLoginPageBL fillPasswordInput(String password) {
        try {
            adminLoginPageBL.getPassword().clear();
        } catch (ElementNotInteractableException cannotInteract) {
            adminLoginPageBL.getPassword().clear();
        }
        adminLoginPageBL.getPassword().sendKeys(password);
        return this;
    }

    public AdminLoginPageBL clickForgottenPasswordButton() throws InterruptedException {
        try {
            adminLoginPageBL.getForgottenPassword().click();
        } catch (ElementNotInteractableException notInteractive) {
            Thread.sleep(1000);
            adminLoginPageBL.getForgottenPassword().click();
        }
        return this;
    }

    public AdminLoginPageBL clickLoginButton() {
        try {
            adminLoginPageBL.getLoginButton().click();
        } catch (ElementNotInteractableException loginButtonIsNotInteractive) {
            adminLoginPageBL.getLoginButton().click();
        }
        return this;
    }
}
