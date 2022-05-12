package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.containers.ProductContainer;
import steps.LowerHeaderPageBL;
import steps.TopHeaderPageBL;
import pages.containers.ProductContainer;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage{
    private TopHeaderPageBL topHeaderPageBL;
    private LowerHeaderPageBL lowerHeaderPageBL;

    @FindBy(xpath = ".//*[contains(@class, 'product-layout')]")
    private List<WebElement> products;

    public List<ProductContainer> getProducts(){
        List<ProductContainer> productContainers = new ArrayList<>();
        for(WebElement elem : products){
            productContainers.add(new ProductContainer(elem));
        }
        return productContainers;
    }


    public TopHeaderPageBL getTopHeaderPageBL() {
        return topHeaderPageBL;
    }

    public LowerHeaderPageBL getLowerHeaderPageBL() {
        return lowerHeaderPageBL;
    }
}
