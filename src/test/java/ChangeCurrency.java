import enums.URLs;
import navigation.Navigation;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class ChangeCurrency extends BaseTest{
    @Test
    public void ChangingCurrency() {
        new Navigation().navigateToUrl(URLs.BASE_URL);

    }
}
