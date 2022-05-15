package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ComparePage {
    @FindBy(xpath = "//*[@id='content']/table/tbody[1]/tr[1]/td[2]/a")
    private List<WebElement> productName;

    @FindBy(xpath = "//*[@class='img-thumbnail']")
    private List<WebElement> productImage;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-block']")
    private List<WebElement> addToCartButton;

    @FindBy(xpath = "//*[@class='btn btn-danger btn-block']")
    private List<WebElement> removeButton;

    public WebElement getProductName(int id) {
        return productName.get(id);
    }
    public WebElement getProductImage(int id) {
        return productImage.get(id);
    }
    public WebElement getAddToCartButton(int id) {
        return addToCartButton.get(id);
    }
    public WebElement getRemoveButton(int id) {
        return removeButton.get(id);
    }
}
