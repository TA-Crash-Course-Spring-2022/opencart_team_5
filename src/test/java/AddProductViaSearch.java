import enums.URLs;
import navigation.Navigation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.SearchProductPage;
import repository.SearchProductRepository;
import steps.SearchProductPageBL;

public class AddProductViaSearch extends BaseTest{

    @Test
    public void SearchingProduct() {
        new Navigation().navigateToUrl(URLs.BASE_URL);
        SearchProductPageBL searchProductPageBL = new SearchProductPageBL();
        searchProductPageBL.searchProduct(SearchProductRepository.getSearch().getProductFirstName())
        .clickAddToWishListButton(1);
    }
}
