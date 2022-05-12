package steps;

import pages.TopHeaderPage;

public class TopHeaderPageBL {
    private TopHeaderPage topHeaderPage;

    public TopHeaderPageBL() { topHeaderPage = new TopHeaderPage();}

    public WishListBL clickOnWishListButton(){
        topHeaderPage.getWishListButton().click();
        return new WishListBL();
    }

    public ShoppingCartPageBL clickOnShoppingCartButton(){
        topHeaderPage.getShoppingCartButton().click();
        return new ShoppingCartPageBL();
    }


}
