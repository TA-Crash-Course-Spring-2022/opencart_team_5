package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

    @FindBy (xpath = "//a[contains(@href,'account/edit')]")
    private WebElement editYourAccountInformation;

    @FindBy (xpath = "//a[contains(@href,'account/password')]")
    private WebElement changeYourPassword;

    @FindBy (xpath = "//a[contains(@href,'account/address')]")
    private WebElement modifyYourAddressBookEntries;

    @FindBy (xpath = "//a[contains(@href,'account/wishlist')]")
    private WebElement modifyYourWishList;

    @FindBy (xpath = "//a[contains(@href,'account/order')]")
    private WebElement viewYourOrderHistory;

    @FindBy (xpath = "//a[contains(@href,'account/download')]")
    private WebElement downloads;

    @FindBy (xpath = "//a[contains(@href,'account/reward')]")
    private WebElement yourRewardPoints;

    @FindBy (xpath = "//a[contains(@href,'account/return')]")
    private WebElement viewYourReturnRequests;

    @FindBy (xpath = "//a[contains(@href,'account/transaction')]")
    private WebElement yourTransactions;

    @FindBy (xpath = "//a[contains(@href,'account/recurring')]")
    private WebElement recurringPayments;

    @FindBy (xpath = "//a[contains(@href,'account/affiliate/add')]")
    private WebElement registerForAnAffiliate;

    @FindBy (xpath = "//a[contains(@href,'account/newsletter')]")
    private WebElement newslettersSubscription;

    @FindBy (xpath = "//a[contains(@href,'account/account')")
    private WebElement myAccount;

    @FindBy (xpath = "//a[contains(@href,'account/logout')")
    private WebElement logout;


    public WebElement getEditYourAccountInformation() {return editYourAccountInformation;}

    public WebElement getChangeYourPassword() {return changeYourPassword;}

    public WebElement getModifyYourAddressBookEntries() {return modifyYourAddressBookEntries;}

    public WebElement getModifyYourWishList() {return modifyYourWishList;}

    public WebElement getViewYourOrderHistory() {return viewYourOrderHistory;}

    public WebElement getDownloads() {return downloads;}

    public WebElement getYourRewardPoints() {return yourRewardPoints;}

    public WebElement getViewYourReturnRequests() {return viewYourReturnRequests;}

    public WebElement getYourTransactions() {return yourTransactions;}

    public WebElement getRecurringPayments() {return recurringPayments;}

    public WebElement getRegisterForAnAffiliate() {return registerForAnAffiliate;}

    public WebElement getNewslettersSubscription() {return newslettersSubscription;}

    public WebElement getMyAccount() {return myAccount;}

    public WebElement getLogout() {return logout;}

}