package steps;


import org.openqa.selenium.WebElement;
import pages.MyAccountPage;

public class MyAccountPageBL {

    private MyAccountPage myAccountPage;

    public MyAccountPageBL() {myAccountPage = new MyAccountPage();}
    public MyAccountPageBL clickOnEditYourAccountInformation(){
        myAccountPage.getEditYourAccountInformation().click();
        return this;
    }
    public MyAccountPageBL clickOnChangeYourPassword(){
        myAccountPage.getChangeYourPassword().click();
        return this;
    }
    public MyAccountPageBL clickOnModifyYourAddressBookEntries(){
        myAccountPage.getModifyYourAddressBookEntries().click();
        return this;
    }
    public MyAccountPageBL clickOnModifyYourWishList(){
        myAccountPage.getModifyYourWishList().click();
        return this;
    }
    public MyAccountPageBL clickOnViewYourOrderHistory(){
        myAccountPage.getViewYourOrderHistory().click();
        return this;
    }
    public MyAccountPageBL clickOnDownloads(){
        myAccountPage.getDownloads().click();
        return this;
    }
    public MyAccountPageBL clickOnYourRewardPoints(){
        myAccountPage.getYourRewardPoints().click();
        return this;
    }
    public MyAccountPageBL clickOnViewYourReturnRequests(){
        myAccountPage.getViewYourReturnRequests().click();
        return this;
    }
    public MyAccountPageBL clickOnYourTransactions(){
        myAccountPage.getYourTransactions().click();
        return this;
    }
    public MyAccountPageBL clickOnRecurringPayments(){
        myAccountPage.getRecurringPayments().click();
        return this;
    }
    public MyAccountPageBL clickOnRegisterForAnAffiliate(){
        myAccountPage.getRegisterForAnAffiliate().click();
        return this;
    }
    public MyAccountPageBL clickOnNewslettersSubscription(){
        myAccountPage.getNewslettersSubscription().click();
        return this;
    }
    public MyAccountPageBL clickOnMyAccount(){
        myAccountPage.getMyAccount().click();
        return this;
    }
    public MyAccountPageBL clickOnLogout(){
        myAccountPage.getLogout().click();
        return this;
    }

}
