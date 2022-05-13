package steps;

import org.openqa.selenium.WebElement;
import pages.ChangePasswordPage;

public class ChangePasswordPageBL {
    private ChangePasswordPage changePasswordPage;

    public ChangePasswordPageBL(){
        changePasswordPage = new ChangePasswordPage();
    }
    public ChangePasswordPageBL passwordInput(String password){
        WebElement input = changePasswordPage.getPasswordInput();
        input.clear();
        input.sendKeys(password);
        return this;
    }
    public ChangePasswordPageBL passwordConfirmInput(String password) {
        WebElement input = changePasswordPage.getPasswordConfirmInput();
        input.clear();
        input.sendKeys(password);
        return this;
    }
    public void clickBackButton(){
        changePasswordPage.getBackButton().click();
    }
    public void clickContinueButton(){
        changePasswordPage.getContinueButton().click();
    }
    public ChangePasswordPageBL clearPasswordInput(){
        changePasswordPage.getPasswordInput().clear();
        return this;
    }
    public ChangePasswordPageBL clearPasswordConfirmInput(){
        changePasswordPage.getPasswordConfirmInput().clear();
        return this;
    }
}
