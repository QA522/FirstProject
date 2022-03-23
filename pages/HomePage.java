package pages;

import Utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    WebDriver driver;
    WebElement element;
    Utilities utilities = new Utilities(driver);

    @FindBy(xpath = "//header/div[@id='header-top']/nav[@id='navbar-header-top']/div[1]/div[1]/div[4]/div[1]/div[1]/a[1]/img[1]")
    WebElement OnLineElement;

    @FindBy(id ="search-input")
    WebElement searchInput;


    @FindBy(id="addProductToCart")
    WebElement addProductToCart;

    @FindBy(id="click-pharm-text")
    WebElement clickPharmButton;

    @FindBy(xpath="//a[contains(text(),'מבצעים')]")
    WebElement Mivtzaim;

    @FindBy(xpath = "//div[contains(text(),'אופטיקה')]")
    WebElement OpticsMivtsa;

    @FindBy(xpath = "//div[contains(text(),'טבע')]")
    WebElement NatureMivtsa;

    @FindBy(className = "magnifierBtn")
    WebElement SearchButton;

    @FindBy(xpath = "//a[contains(text(),'קטגוריות')]")
    WebElement Categories;

    @FindBy(xpath = "//header/div[@id='header-bottom']/div[@id='header-content-botto")
    WebElement LifeStyleCategory;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public WebElement OnLineElement() {
        return OnLineElement;
    }

    public void searchInput(String Item){
        searchInput.sendKeys(Item);


      /*  try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchInput.submit();*/
    }

    public void SearchButton(){
        SearchButton.click();
    }

    public void addProductToCart() {
        addProductToCart.click();
    }

    public void clickPharmButton(){
        clickPharmButton.click();
    }

    public void Mivtzaim(){
        Mivtzaim.click();
    }

    public WebElement OpticsMivtsa(){
        return OpticsMivtsa;
    }

    public WebElement NatureMivtsa(){
        return NatureMivtsa;
    }

    public WebElement Categories(){
        return Categories;
    }

    public WebElement LifeStyleCategory(){
        return LifeStyleCategory;
    }


}