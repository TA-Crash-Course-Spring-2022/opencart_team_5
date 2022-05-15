package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MenuPage {
    @FindBy(xpath = "//a[starts-with(text(),'Desktops')]")
    private List<WebElement> menuDesktopsButton;

    @FindBy(xpath = "//a[starts-with(text(),'Laptops')]")
    private List<WebElement> menuLaptopsButton ;

    @FindBy(xpath = "//a[starts-with(text(),'Components')]")
    private List<WebElement> menuComponentsButton;

    @FindBy(xpath = "//a[starts-with(text(),'Tablets')]")
    private List<WebElement> menuTabletsButton;

    @FindBy(xpath = "//a[starts-with(text(),'Software')]")
    private List<WebElement> menuSoftwareButton;

    @FindBy(xpath = " //a[starts-with(text(),'Phones')]")
    private List<WebElement> menuPhonesButton;

    @FindBy(xpath = "//a[starts-with(text(),'Cameras')]")
    private List<WebElement> menuCamerasButton;

    @FindBy(xpath = "//a[starts-with(text(),'MP3 Players')]")
    private List<WebElement> menuPlayersButton;

    public WebElement getMenuDesktopsButton(int id) {
        return menuDesktopsButton.get(id);
    }
    public WebElement getMenuLaptopsButton(int id) {
        return menuLaptopsButton.get(id);
    }
    public WebElement getMenuComponentsButton(int id) {
        return menuComponentsButton.get(id);
    }
    public WebElement getMenuTabletsButton(int id) {
        return menuTabletsButton.get(id);
    }
    public WebElement getMenuSoftwareButton(int id) {
        return menuSoftwareButton.get(id);
    }
    public WebElement getMenuPhonesButton(int id) {
        return menuPhonesButton.get(id);
    }
    public WebElement getMenuCamerasButton(int id) {
        return menuCamerasButton.get(id);
    }
    public WebElement getMenuPlayersButton(int id) {
        return menuPlayersButton.get(id);
    }
}
