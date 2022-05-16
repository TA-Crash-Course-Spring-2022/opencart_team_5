package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductContainer {

    public ProductContainer(WebElement elem){

        this.productImage = elem.findElement(By.xpath("//*[contains(@class, 'image')]"));
        this.productName = elem.findElement(By.xpath("//*[contains(@class, 'caption')]/h4/a"));
        this.productDescription = elem.findElement(By.xpath("//*[contains(@class, 'caption')]/p"));
        this.productPrice = elem.findElement(By.xpath("//*[contains(@class, 'price')]"));
        this.productTax = elem.findElement(By.xpath("//*[contains(@class, 'price-tax')]"));
        this.productAddToCartButton = elem.findElement(By.xpath("//*[contains(@class, 'button-group')]/button[1]"));
        this.productAddToWishListButton = elem.findElement(By.xpath("//*[contains(@class, 'button-group')]/button[2]"));
        this.productCompareButton = elem.findElement(By.xpath("//*[contains(@class, 'button-group')]/button[3]"));

    }

    private WebElement productImage;

    private WebElement productName;

    private WebElement productDescription;

    private WebElement productPrice;

    private WebElement productTax;

    private WebElement productAddToCartButton;

    private WebElement productAddToWishListButton;

    private WebElement productCompareButton;



    public WebElement getProductImage() {
        return this.productImage;
    }

    public WebElement getProductName() {
        return this.productName;
    }

    public WebElement getProductDescription() {
        return this.productDescription;
    }

    public WebElement getProductPrice() {
        return this.productPrice;
    }

    public WebElement getProductTax() {
        return this.productTax;
    }

    public WebElement getProductAddToCartButton() {
        return this.productAddToCartButton;
    }

    public WebElement getProductAddToWishListButton() {
        return this.productAddToWishListButton;
    }

    public WebElement getProductCompareButton() {
        return this.productCompareButton;
    }
}
