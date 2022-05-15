import driver.Driver;
import enums.URLs;
import navigation.Navigation;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class MakeTest extends BaseTest{
    @Test
    public void doTest() throws InterruptedException {
        Driver.driverGet(URLs.BASE_URL.getValue());
        Thread.sleep(10000);
    }
}
