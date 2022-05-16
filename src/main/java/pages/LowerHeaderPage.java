package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LowerHeaderPage extends BasePage{

    @FindBy(xpath = "//*[@placeholder='Search']")
    private WebElement searchInput;

    @FindBy(xpath = "//*[contains(@class, 'btn btn-default btn-lg')]")
    private WebElement searchButton;

    @FindBy(xpath = "//*[contains(@class, 'btn btn-inverse btn-block')]")
    private WebElement shoppingCartButton;

    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getShoppingCartButton() {
        return shoppingCartButton;
    }
}
