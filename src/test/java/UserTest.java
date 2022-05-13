import navigation.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.AdminGeoZonesPage;
import pages.ChangePasswordPage;



import static enums.URLs.BASE_URL;

public class UserTest extends BaseTest{
    @Test
    public void Homepage() throws InterruptedException {

        new Navigation().navigateToUrl(BASE_URL);
        Thread.sleep(5000);

    }
}
