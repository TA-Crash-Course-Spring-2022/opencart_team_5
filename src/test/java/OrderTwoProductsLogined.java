import enums.URLs;
import navigation.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import repository.CheckoutRepository;
import repository.SearchProductRepository;
import steps.LoginPageBL;
import org.testng.annotations.Test;
import repository.LoginModelRepository;
import steps.*;

import java.time.Duration;

public class OrderTwoProductsLogined extends BaseTest{
    @Test
    public void MakingOrder() {
        new Navigation().navigateToUrl(URLs.BASE_URL);
        HeaderPageBL headerPageBL = new HeaderPageBL()
                .clickMyAccountButton()
                .clickLoginButton();
        LoginPageBL loginPageBL = new LoginPageBL()
                .loginPerson(LoginModelRepository.getLoginUser());
        SearchProductPageBL searchProductPageBL = new SearchProductPageBL();
        searchProductPageBL.searchProduct(SearchProductRepository.getSearch().getProductFirstName())
                .productSearch();
        driver.findElement(By.xpath("//*[contains(@onclick, 'cart.add')]")).click();
        driver.findElement(By.xpath("//*[@href='http://localhost/OpenCart/upload/index.php?route=checkout/checkout']")).click();

        //ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='payment_address' and @value = 'new']"));
        /*driver.findElement(By.xpath("//*[@name='payment_address' and @value = 'existing']")).click();*/
        CheckoutPageBL checkoutPageBL = new CheckoutPageBL()
                .makeOrderAsLoginedUser(CheckoutRepository.loginedUser());
    }
}