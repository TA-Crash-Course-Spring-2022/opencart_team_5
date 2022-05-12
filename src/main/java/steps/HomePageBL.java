package steps;

import pages.HomePage;
import pages.containers.ProductContainer;

import java.util.List;

public class HomePageBL {
    private HomePage homePage;


    public HomePageBL(){
        homePage = new HomePage();

    }

    public WishListBL wishListButtonClick(){
        homePage.getTopHeaderPageBL().clickOnWishListButton();
        return new WishListBL();
    }

    public ShoppingCartPageBL shoppingCartButtonClick(){
        homePage.getTopHeaderPageBL().clickOnShoppingCartButton();
        return new ShoppingCartPageBL();
    }

    public void addProductToWishList(int quantity){
        List<ProductContainer> list = homePage.getProducts();
        for (int i = 0; i < quantity; i++){
            list.get(i).getProductAddToWishListButton().click();

        }
    }
}
