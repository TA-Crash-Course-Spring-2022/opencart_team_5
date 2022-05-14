package steps;

import org.openqa.selenium.WebElement;
import pages.ProductPage;

public class ProductPageBL {
    private ProductPage productPage;

    public ProductPageBL(){
        productPage = new ProductPage();
    }

    public void clickAddToCart(){
        productPage.getAddToCart().click();
    }
    public void addToWishList(){
        productPage.getAddToWishList().click();
    }
    public ProductPageBL inputQuantity(String quantity){
        WebElement input = productPage.getQuantity();
        input.clear();
        input.sendKeys(quantity);
        return this;
    }
}
