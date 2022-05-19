import driver.Driver;
import enums.URLs;
import navigation.Navigation;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddProductToShoppingCart extends BaseTest{
    @Test
    public void registerValidUserTest() {
        new Navigation().navigateToUrl(URLs.BASE_URL);
    }
}
