package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class WishListPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/table")
    private WebElement wishListTable;

    @FindBy(xpath = "//tbody/tr/td[contains(@class, 'text-center')]")
    private List<WebElement> images;

    @FindBy(xpath = "//tbody/tr/td[contains(@class, 'text-left')]/a")
    private List<WebElement> productNames;

    @FindBy(xpath = "//tbody/tr/td[3][contains(@class, 'text-left')]")
    private List<WebElement> productModels;

    @FindBy(xpath = "//tbody/tr/td[4][contains(@class, 'text-right')]")
    private List<WebElement> productStocks;

    @FindBy(xpath = "//tbody/tr/td/div[contains(@class, 'price')]")
    private List<WebElement> productPrices;

    @FindBy(xpath = "//tbody/tr/td/button[contains(@type, 'button')]")
    private List<WebElement> addToCartButtons;

    @FindBy(xpath = "//tbody/tr/td[contains(@class, 'text-right')]/a")
    private List<WebElement> removeButtons;

    @FindBy(xpath = "//div[contains(@class, 'pull-right')]/a")
    private List<WebElement> continueButtons;


    public WebElement getWishListTable() {
        return wishListTable;
    }

    public List<WebElement> getImages() {
        return images;
    }

    public List<WebElement> getProductNames() {
        return productNames;
    }

    public List<WebElement> getProductModels() {
        return productModels;
    }

    public List<WebElement> getProductStocks() {
        return productStocks;
    }

    public List<WebElement> getProductPrices() {
        return productPrices;
    }

    public List<WebElement> getAddToCartButtons() {
        return addToCartButtons;
    }

    public List<WebElement> getRemoveButtons() {
        return removeButtons;
    }

    public List<WebElement> getContinueButtons() {
        return continueButtons;
    }
}
