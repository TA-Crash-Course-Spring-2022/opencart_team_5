package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    @FindBy(id = "button-cart")
    private WebElement addToCart;

    @FindBy(xpath = "//button[@class='btn btn-default'] //i[@class= 'fa fa-heart']")
    private WebElement addToWishList;

    @FindBy(id = "input-quantity")
    private WebElement quantity;

    public WebElement getAddToCart() {
        return addToCart;
    }

    public WebElement getAddToWishList() {
        return addToWishList;
    }

    public WebElement getQuantity() {
        return quantity;
    }
}
