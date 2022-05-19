package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    public static final ThreadLocal <WebDriver> DRIVERS = new ThreadLocal<>();

    private static WebDriver webDriver;

    private Driver(){

    }
    public static void downloadWebDriver(){
        WebDriverManager.chromedriver().setup();
    }

    public static void instanceWebBrowser(){
        webDriver = new ChromeDriver();
        DRIVERS.set(webDriver);
    }

    public static void closeBrowser() {
        webDriver.quit();
    }

    public static void driverGet(String URL){webDriver.get(URL);}

    public static void waitForDriver(){
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
