package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutPage {
    @FindBy(xpath = "]//*[@value='existing']")
    private WebElement radioBtnExistingAddress;

    @FindBy(xpath = "//*[@value='new']")
    private WebElement radioBtnNewAddress;

    @FindBy(xpath = "//*[@name='firstname']")
    private List<WebElement> inputFirstName;

    @FindBy(xpath = "//*[@name='lastname']")
    private List<WebElement> inputLastName;

    @FindBy(xpath = "//*[@name='company']")
    private List<WebElement> inputCompany;

    @FindBy(xpath = "//*[@name='address_1']")
    private List<WebElement> inputAddress1;

    @FindBy(xpath = "//*[@name='address_2']")
    private List<WebElement> inputAddress2;

    @FindBy(xpath = "//*[@name='city']")
    private List<WebElement> inputCity;

    @FindBy(xpath = "//*[@name='postcode']")
    private List<WebElement> inputPostalCode;

    @FindBy(xpath = "//*[@name='country_id']")
    private List<WebElement> inputCountry;

    @FindBy(xpath = "//*[@name='zone_id']")
    private List<WebElement> inputRegionOrState;

    @FindBy(id= "button-payment-address")
    private List<WebElement> buttonContinueDeliveryDetails;

    @FindBy(xpath = "//*[@value='flat.flat']")
    private WebElement radioBtnDeliveryMethod;

    @FindBy(xpath = "//*[@name='comment']")
    private WebElement textAreaComment;

    @FindBy(id= "button-shipping-method")
    private List<WebElement> buttonContinueDeliveryMethod;

    @FindBy(xpath = "//*[@value='flat.flat']")
    private WebElement radioBtnPaymentMethod;

    @FindBy(xpath = "//*[@name='comment']")
    private WebElement textAreaCommentAboutOrder;

    @FindBy(xpath = "//*[@name='agree']")
    private List<WebElement> checkBoxTermsConditions;

    @FindBy(id= "button-payment-method")
    private List<WebElement> buttonContinuePaymentMethod;

    @FindBy(id= "button-confirm")
    private List<WebElement> buttonConfirmOrder;

    public WebElement getRadioBtnExistingAddress() {
        return radioBtnExistingAddress;
    }
    public WebElement getRadioBtnNewAddress(int id) {
        return radioBtnNewAddress;
    }
    public WebElement getInputFirstName(int id) {
        return inputFirstName.get(id);
    }
    public WebElement getInputLastName(int id) {
        return inputLastName.get(id);
    }
    public WebElement getInputCompany(int id) {
        return inputCompany.get(id);
    }
    public WebElement getInputAddress1(int id) {
        return inputAddress1.get(id);
    }
    public WebElement getInputAddress2(int id) {
        return inputAddress2.get(id);
    }
    public WebElement getInputCity(int id) {
        return inputCity.get(id);
    }
    public WebElement getInputPostalCode(int id) {
        return inputPostalCode.get(id);
    }
    public WebElement getInputCountry(int id) {
        return inputCountry.get(id);
    }
    public WebElement getInputRegionOrState(int id) {
        return inputRegionOrState.get(id);
    }
    public WebElement getButtonContinueDeliveryDetails(int id) {
        return buttonContinueDeliveryDetails.get(id);
    }
    public WebElement getRadioBtnDeliveryMethod() {
        return radioBtnDeliveryMethod;
    }
    public WebElement getTextAreaComment() {
        return textAreaComment;
    }
    public WebElement getButtonContinueDeliveryMethod(int id) {
        return buttonContinueDeliveryMethod.get(id);
    }
    public WebElement getRadioBtnPaymentMethod() {
        return radioBtnPaymentMethod;
    }
    public WebElement getTextAreaCommentAboutOrder() {
        return textAreaCommentAboutOrder;
    }
    public WebElement getCheckBoxTermsConditions(int id) {
        return checkBoxTermsConditions.get(id);
    }
    public WebElement getButtonContinuePaymentMethod(int id) {
        return buttonContinuePaymentMethod.get(id);
    }
    public WebElement getButtonConfirmOrder(int id) {
        return buttonConfirmOrder.get(id);
    }

}
