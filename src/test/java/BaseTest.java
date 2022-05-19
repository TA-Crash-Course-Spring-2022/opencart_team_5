import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;

    @BeforeSuite
    public void setup(){ Driver.downloadWebDriver(); }

    @BeforeClass
    public void createDriver(){
        Driver.instanceWebBrowser();
        driver = Driver.DRIVERS.get();
    }

    @AfterSuite
    public void closeBrowser(){ Driver.closeBrowser(); }
    }
