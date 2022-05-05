package utils;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;


public class DriverUtils {
    private WebDriver driver;

    public DriverUtils(){
        driver = Driver.DRIVERS.get();
    }

    public void clickOnElementsJS(WebElement element){
        getJSExecutor().executeScript("arguments[0].click", element);
    }

    private JavascriptExecutor getJSExecutor(){
        return (JavascriptExecutor) driver;
    }
}