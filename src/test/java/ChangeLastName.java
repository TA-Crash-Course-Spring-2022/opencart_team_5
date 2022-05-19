import enums.URLs;
import navigation.Navigation;
import org.testng.annotations.Test;
import repository.EditAccountRepository;
import repository.LoginModelRepository;
import steps.EditAccountInformationPageBL;
import steps.HeaderPageBL;
import steps.LoginPageBL;
import steps.MyAccountPageBL;

public class ChangeLastName extends BaseTest{

    @Test
    public void ChangingEmail() {
        new Navigation().navigateToUrl(URLs.BASE_URL);
        HeaderPageBL headerPageBL = new HeaderPageBL()
                .clickMyAccountButton()
                .clickLoginButton();
        LoginPageBL loginPageBL = new LoginPageBL()
                .loginPerson(LoginModelRepository.getLoginUser());
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL()
                .clickOnEditYourAccountInformation();
        EditAccountInformationPageBL editAccountInformationPageBL = new EditAccountInformationPageBL()
                .inputEmail(EditAccountRepository.getLastNameEdit().getLastName());
    }
}
