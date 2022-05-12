import driver.Driver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    @BeforeSuite
    public void setup(){ Driver.downloadWebDriver(); }

    @BeforeClass
    public void createDriver(){ Driver.instanceWebBrowser(); }

    @AfterSuite
    public void closeBrowser(){ Driver.closeBrowser(); }


}
