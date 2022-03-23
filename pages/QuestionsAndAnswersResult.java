package pages;

import Utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuestionsAndAnswersResult extends BasePage {

    WebDriver driver;
    WebElement element;
    Utilities utilities = new Utilities(driver);

    @FindBy(xpath = "//body/div[3]/div[2]/div[2]/div[1]/img[1]")
    WebElement QaHeader;

    @FindBy(xpath = "//h2[contains(text(),'שאלות כלליות')]")
    WebElement GeneralQuestionHead;

    @FindBy(xpath = "//a[contains(text(),'כיצד ניתן להתחבר לאתר?')]")
    WebElement FirstQuestion;

    @FindBy(xpath = "//a[contains(text(),'כמה עולה משלוח?')]")
    WebElement DeliveryCost;

    @FindBy(xpath = "//a[contains(text(),'כיצד ניתן לדעת מה סטטוס ההזמנה שלי?')]")
    WebElement OrderStatus;

    public QuestionsAndAnswersResult(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement QaHeader(){
        return QaHeader;
    }

    public WebElement GeneralQuestionHead(){
        return GeneralQuestionHead;
    }

    public WebElement FirstQuestion(){
        return FirstQuestion;
    }

    public WebElement DeliveryCost(){
        return DeliveryCost;
    }

    public WebElement OrderStatus(){
        return OrderStatus;
    }
  }
