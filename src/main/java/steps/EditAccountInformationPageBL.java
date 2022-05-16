package steps;

import org.openqa.selenium.WebElement;
import pages.EditAccountInformationPage;

public class EditAccountInformationPageBL {
    private EditAccountInformationPage editAccountInformationPage;

    public EditAccountInformationPageBL(){editAccountInformationPage = new EditAccountInformationPage();}
    public EditAccountInformationPageBL inputFirstName(String name){
        WebElement input = editAccountInformationPage.getInputFirstname();
        input.clear();;
        input.sendKeys(name);
        return this;
    }
    public EditAccountInformationPageBL inputLastName(String name){
        WebElement input = editAccountInformationPage.getInputLastname();
        input.clear();
        input.sendKeys(name);
        return this;
    }
    public EditAccountInformationPageBL inputEmail(String email){
        WebElement input = editAccountInformationPage.getInputEmail();
        input.clear();
        input.sendKeys(email);
        return this;
    }
    public EditAccountInformationPageBL inputTelephone(String number){
        WebElement input = editAccountInformationPage.getInputTelephone();
        input.clear();
        input.sendKeys(number);
        return this;
    }
    public void clickBackButton(){
        editAccountInformationPage.getBackButton().click();
    }
    public void clickContinueButton(){
        editAccountInformationPage.getContinueButton().click();
    }
}