package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageResult extends BasePage {


    @FindBy(xpath = "//span[contains(text(),'JOY INTENSE א.ד.פ לאשה')]")
    WebElement ParfumSearchResult;

    @FindBy(xpath ="//h4[contains(text(),'קולגייט משחת שיניים אופטיק וויט לסטינג וויט')]")
    WebElement ColgateWhiteResult;

    @FindBy(xpath = "//body/div[3]/div[2]/div[2]/main[1]/section[2]/div[5]/a[2]/div[1]/div[7]/div[1]/div[1]")
    WebElement ColgateAddButton;

    @FindBy(xpath = "//h4[contains(text(),'CARELINE BOLD STAY LONG מסקרה עמידה במים')]")
    WebElement MascaraBoldResult;

    @FindBy(xpath = "//header/div[@id='header-bottom']/div[@id='header-content-bottom']/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")
    WebElement Cosmetics;

    @FindBy(xpath = "//header/div[@id='header-bottom']/div[@id='header-content-bottom']/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement Home;

    @FindBy(xpath = "//header/div[@id='header-bottom']/div[@id='header-content-bottom']/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[6]/a[1]")
     WebElement HealthOption;

    @FindBy(xpath = "//header/div[@id='header-top']/nav[@id='navbar-header-top']/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]")
    WebElement QuestionAnswerButton;

    @FindBy(xpath = "//p[contains(text(),'אודותינו')]")
    WebElement AboutLifeStyle;

    @FindBy(xpath = "//p[contains(text(),'חשמל ואלקטרוניקה')]")
    WebElement ElectricityAndElectronicCategory;

    @FindBy(xpath = "//p[contains(text(),'מחשבים')]")
    WebElement Computers;

    @FindBy(xpath = "//p[contains(text(),'מצלמות')]")
    WebElement Cameras;

    @FindBy(xpath = "//body/div[3]/div[2]/div[2]/main[1]/section[2]/div[6]/a[2]/div[1]/div[1]/img[1]")
    WebElement Mouse;

    @FindBy(xpath = "//body/div[3]/div[2]/div[2]/main[1]/section[2]/div[6]/a[2]/div[1]/div[1]/img[1]")
    WebElement PixVtechCamera;

    @FindBy(xpath = "//div[contains(text(),'הרלוונטיות')]")
    WebElement OrderByRelevent;

    @FindBy(xpath = "//a[contains(text(),'בית מרקחת')]")
    WebElement Pharmacy;

    @FindBy(xpath = " //a[contains(text(),'קופת חולים כללית')]")
    WebElement Clalit;

    @FindBy(xpath = "//a[contains(text(),'קופת חולים מכבי')]")
    WebElement Macabi;

    @FindBy(xpath = "//a[contains(text(),'קופת חולים מאוחדת')]")
    WebElement Meuhedet;

    public SearchPageResult(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public WebElement ParfumSearchResult() {
        return ParfumSearchResult;
    }

    public WebElement ColgateWhiteResult() {
        return ColgateWhiteResult;
    }
    public WebElement MascaraBoldResult(){
        return MascaraBoldResult;
    }

    public WebElement HealthOption(){
        return HealthOption;
    }
    public WebElement Cosmetics(){
        return Cosmetics;
    }

    public WebElement Home(){
        return Home;
    }

    public WebElement ColgateAddButton(){
        return ColgateAddButton;
    }
    public WebElement QuestionAnswerButton(){
        return QuestionAnswerButton;
    }

    public WebElement AboutLifeStyle(){
        return AboutLifeStyle;
    }

    public WebElement ElectricityAndElectronicCategory(){
        return ElectricityAndElectronicCategory;
    }

    public WebElement Computers(){
        return Computers;
    }

    public WebElement Cameras(){
        return Cameras;
    }

    public WebElement Mouse(){
        return Mouse;
    }

    public WebElement PixVtechCamera(){
        return PixVtechCamera;
    }

    public WebElement OrderByRelevent(){
        return OrderByRelevent;
    }

    public WebElement Pharmacy(){
        return Pharmacy;
    }

    public WebElement Clalit(){
        return Clalit;
    }

    public WebElement Macabi(){
        return Macabi;
    }

    public WebElement Meuhedet(){
        return Meuhedet;
    }

}