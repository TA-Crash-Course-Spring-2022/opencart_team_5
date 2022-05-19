package steps;
import org.openqa.selenium.WebElement;
import pages.SearchProductPage;

public class SearchProductPageBL {
    private SearchProductPage searchProductPage;

    public SearchProductPageBL(){
        searchProductPage = new SearchProductPage();
    }
    public SearchProductPageBL searchProduct (String productName){
        searchProductPage.getSearchInput().clear();
        searchProductPage.getSearchInput().sendKeys(productName);
        return this;
    }
    public void productSearch () {
        searchProductPage.getSearchButton().click();
    }

    public SearchProductPageBL clickAddToWishListButton(int id) {
        searchProductPage.getAddToWishListButton(id).click();
        return this;
    }
    public SearchProductPageBL clickAddToCartButton(int id) {
        searchProductPage.getAddToCartButton(id).click();
        return this;
    }
}
