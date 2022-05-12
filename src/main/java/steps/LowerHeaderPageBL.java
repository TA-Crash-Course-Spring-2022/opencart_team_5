package steps;

import pages.LowerHeaderPage;

public class LowerHeaderPageBL {
    private LowerHeaderPage lowerHeaderPage;

    public LowerHeaderPageBL(){
        lowerHeaderPage = new LowerHeaderPage();
    }

    public ShoppingCartPageBL clickOnShoppingCartButton(){
        lowerHeaderPage.getShoppingCartButton().click();
        return new ShoppingCartPageBL();
    }

    public SearchProductPageBL clickSearchButton(){
        lowerHeaderPage.getSearchButton().click();
        return new SearchProductPageBL();
    }

    public void inputSearchData(String data){
        lowerHeaderPage.getSearchInput().clear();
        lowerHeaderPage.getSearchInput().sendKeys(data);
    }
}
