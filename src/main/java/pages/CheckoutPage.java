package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class CheckoutPage extends BasePage {
    @FindBy(xpath = "]//*[@value='existing']")
    private WebElement radioBtnExistingAddress;

    @FindBy(xpath = "//*[@value='new']")
    private WebElement radioBtnNewAddress;

    @FindBy(xpath = "//*[@name='firstname']")
    private WebElement inputFirstName;

    @FindBy(xpath = "//*[@name='lastname']")
    private WebElement inputLastName;

    @FindBy(xpath = "//*[@name='company']")
    private WebElement inputCompany;

    @FindBy(xpath = "//*[@name='address_1']")
    private WebElement inputAddress1;

    @FindBy(xpath = "//*[@name='address_2']")
    private WebElement inputAddress2;

    @FindBy(xpath = "//*[@name='city']")
    private WebElement inputCity;

    @FindBy(xpath = "//*[@name='postcode']")
    private WebElement inputPostalCode;

    @FindBy(id= "button-payment-address")
    private WebElement buttonContinueBillingDetails;

    @FindBy(id= "button-shipping-address")
    private WebElement buttonContinueDeliveryDetails;

    @FindBy(xpath = "//*[@value='flat.flat']")
    private WebElement radioBtnDeliveryMethod;

    @FindBy(xpath = "//*[@name='comment']")
    private WebElement textAreaComment;

    @FindBy(id= "button-shipping-method")
    private WebElement buttonContinueDeliveryMethod;

    @FindBy(xpath = "//*[@value='flat.flat']")
    private WebElement radioBtnPaymentMethod;

    @FindBy(xpath = "//*[@name='comment']")
    private WebElement textAreaCommentAboutOrder;

    @FindBy(xpath = "//*[@name='agree']")
    private WebElement checkBoxTermsConditions;

    @FindBy(id= "button-payment-method")
    private WebElement buttonContinuePaymentMethod;

    @FindBy(id= "button-confirm")
    private WebElement buttonConfirmOrder;

    public WebElement getRadioBtnExistingAddress() {
        return radioBtnExistingAddress;
    }
    public WebElement getRadioBtnNewAddress() {
        return radioBtnNewAddress;
    }
    public WebElement getInputFirstName() {
        return inputFirstName;
    }
    public WebElement getInputLastName() {
        return inputLastName;
    }
    public WebElement getInputCompany() {
        return inputCompany;
    }
    public WebElement getInputAddress1() {
        return inputAddress1;
    }
    public WebElement getInputAddress2() {
        return inputAddress2;
    }
    public WebElement getInputCity() {
        return inputCity;
    }
    public WebElement getInputPostalCode() {
        return inputPostalCode;
    }
    public WebElement getCheckoutOption(String value) {
        return driver.findElement(By.xpath("//*[@name='payment_address' and @value = '"+ value + "']"));
    }
    public WebElement getListCountry(int value) {
        return driver.findElement(By.xpath(".//*[@id='input-payment-country' and @value = '" + value + "']"));
    }
    public WebElement getListRegionOrState(int value) {
        return driver.findElement(By.xpath(".//*[@id= 'input-payment-zone' and @value = '" + value + "']"));
    }
    public WebElement getButtonContinueBillingDetails() {
        return buttonContinueBillingDetails;
    }
    public WebElement getButtonContinueDeliveryDetails() {
        return buttonContinueDeliveryDetails;
    }
    public WebElement getRadioBtnDeliveryMethod() {
        return radioBtnDeliveryMethod;
    }
    public WebElement getTextAreaComment() {
        return textAreaComment;
    }
    public WebElement getButtonContinueDeliveryMethod() {
        return buttonContinueDeliveryMethod;
    }
    public WebElement getRadioBtnPaymentMethod() {
        return radioBtnPaymentMethod;
    }
    public WebElement getTextAreaCommentAboutOrder() {
        return textAreaCommentAboutOrder;
    }
    public WebElement getCheckBoxTermsConditions() {
        return checkBoxTermsConditions;
    }
    public WebElement getButtonContinuePaymentMethod() {
        return buttonContinuePaymentMethod;
    }
    public WebElement getButtonConfirmOrder() {
        return buttonConfirmOrder;
    }

}
