package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopHeaderPage extends BasePage {

    @FindBy(xpath = "//div[contains(@id, 'top-links')]/ul/li[1]/a")
    private WebElement contactUsButton;

    @FindBy(xpath = "//*[@title='My Account']")
    private WebElement dropDownButton;

    @FindBy(xpath = "//div[contains(@id, 'top-links')]/ul/li[2]/ul/li[1]/a")
    private WebElement myAccountButton;

    @FindBy(xpath = "//div[contains(@id, 'top-links')]/ul/li[2]/ul/li[2]/a")
    private WebElement orderHistoryButton;

    @FindBy(xpath = "//div[contains(@id, 'top-links')]/ul/li[2]/ul/li[3]/a")
    private WebElement transactionsButton;

    @FindBy(xpath = "//div[contains(@id, 'top-links')]/ul/li[2]/ul/li[4]/a")
    private WebElement downloadsButton;

    @FindBy(xpath = "//div[contains(@id, 'top-links')]/ul/li[2]/ul/li[5]/a")
    private WebElement logoutButton;

    @FindBy(xpath = ".//*[contains(@href, 'register')]")
    private WebElement myRegisterButton;

    @FindBy(xpath = ".//*[contains(@href, 'account/login')]")
    private WebElement loginButton;

    @FindBy(id = "wishlist-total")
    private WebElement wishListButton;

    @FindBy(xpath = "//*[@title='Shopping Cart']")
    private WebElement shoppingCartButton;

    @FindBy(xpath = "//*[contains(@class, 'btn btn-link dropdown-toggle')]")
    private WebElement currencyDropDownButton;

    @FindBy(xpath = "//*[contains(@name, 'EUR')]")
    private WebElement euroButton;

    @FindBy(xpath = "//*[contains(@name, 'GBP')]")
    private WebElement poundSterlingButton;

    @FindBy(xpath = "//*[contains(@name, 'USD')]")
    private WebElement dollarButton;

    @FindBy(xpath = "//*[@title='Checkout']")
    private WebElement checkoutButton;


    public WebElement getMyAccountButton() {
        return myAccountButton;
    }

    public WebElement getMyRegisterButton() {
        return myRegisterButton;
    }

    public WebElement getWishListButton() {
        return wishListButton;
    }

    public WebElement getShoppingCartButton() {
        return shoppingCartButton;
    }

    public WebElement getContactUsButton() {
        return contactUsButton;
    }

    public WebElement getDropDownButton() {
        return dropDownButton;
    }

    public WebElement getOrderHistoryButton() {
        return orderHistoryButton;
    }

    public WebElement getTransactionsButton() {
        return transactionsButton;
    }

    public WebElement getDownloadsButton() {
        return downloadsButton;
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getCurrencyDropDownButton() {
        return currencyDropDownButton;
    }

    public WebElement getEuroButton() {
        return euroButton;
    }

    public WebElement getPoundSterlingButton() {
        return poundSterlingButton;
    }

    public WebElement getDollarButton() {
        return dollarButton;
    }

    public WebElement getCheckoutButton() {
        return checkoutButton;
    }
}