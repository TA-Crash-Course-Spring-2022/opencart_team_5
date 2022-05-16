package navigation;

import enums.URLs;
import org.openqa.selenium.WebDriver;
import driver.Driver;

public class Navigation {
    private WebDriver driver;

    public Navigation(){
        driver = Driver.DRIVERS.get();
    }

    public void navigateToUrl(URLs URL){
        driver.get(URL.getValue());
        driver.manage().window().maximize();
    }
}
