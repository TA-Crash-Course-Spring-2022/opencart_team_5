package steps;

import datamodel.CheckoutModel;
import pages.CheckoutPage;
import utils.DriverUtils;

public class CheckoutPageBL {

    private CheckoutPage checkoutPage;
    public CheckoutPageBL() {
        checkoutPage = new CheckoutPage();
    }
    public CheckoutPageBL makeOrderAsLoginedUser(CheckoutModel checkoutModel) {
        clickOnRadio();
        inputFirstName(checkoutModel.getFirstName());
        inputLastName(checkoutModel.getLastName());
        inputCompany(checkoutModel.getCompany());
        inputAddress1(checkoutModel.getAddress1());
        inputCity(checkoutModel.getCity());
        inputPostalCode(checkoutModel.getPostalCode());
        chooseCountry(220);
        chooseRegion(3493);
        clickOnContinueBillingDetails();
        clickOnContinueDeliveryDetails();
        clickOnContinueDeliveryMethod();
        clickTermsAndConditionCheckbox();
        clickOnContinuePaymentMethod();
        clickOnConfirmOrder();
        return this;
    }

    private void inputFirstName(String firstName) {
        checkoutPage.getInputFirstName().clear();
        checkoutPage.getInputFirstName().sendKeys(firstName);
    }

    private void inputLastName(String lastName) {
        checkoutPage.getInputLastName().clear();
        checkoutPage.getInputLastName().sendKeys(lastName);
    }

    private void inputCompany(String company) {
        checkoutPage.getInputCompany().clear();
        checkoutPage.getInputCompany().sendKeys(company);
    }

    private void inputAddress1(String address) {
        checkoutPage.getInputAddress1().clear();
        checkoutPage.getInputAddress1().sendKeys(address);
    }

    private void inputCity(String city) {
        checkoutPage.getInputCity().clear();
        checkoutPage.getInputCity().sendKeys(city);
    }

    private void inputPostalCode(String postalCode) {
        checkoutPage.getInputPostalCode().clear();
        checkoutPage.getInputPostalCode().sendKeys(postalCode);
    }

    private void clickOnRadio() {
        checkoutPage.getRadioBtnNewAddress().click();
    }

    private void chooseCountry(int value) {
        new DriverUtils().clickOnElementsJS(checkoutPage.getListCountry(value));
    }

    private void chooseRegion(int value) {
        new DriverUtils().clickOnElementsJS(checkoutPage.getListRegionOrState(value));
    }

    private void clickOnContinueBillingDetails() {
        checkoutPage.getButtonContinueBillingDetails().click();
    }

    private void clickOnContinueDeliveryDetails() {
        checkoutPage.getButtonContinueDeliveryDetails().click();
    }

    private void clickTermsAndConditionCheckbox() {
        checkoutPage.getCheckBoxTermsConditions().click();
    }

    private void clickOnContinueDeliveryMethod() {
        checkoutPage.getButtonContinueDeliveryMethod().click();
    }

    private void clickOnContinuePaymentMethod() {
        checkoutPage.getButtonContinuePaymentMethod().click();
    }

    private void clickOnConfirmOrder() {
        checkoutPage.getButtonConfirmOrder().click();
    }
}
