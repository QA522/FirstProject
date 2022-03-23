package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.InitializePage;

import java.io.IOException;

public class FirstTest extends InitializePage {

    @BeforeTest
    public void setUp(){
        super.setUp();
    }

   @Test (priority = 1)
    public void searchParfum(){
        homePage.searchInput("Joy Intense");
        homePage.SearchButton();
        WebElement e = driver.findElement(By.xpath("//span[contains(text(),'JOY INTENSE א.ד.פ לאשה')]"));
        Assert.assertEquals(searchPage.ParfumSearchResult(),e);
        //assertNotNull(utilities.waitForElement(searchPage.searchFlagLogo(), 20));
    }

    @Test (priority = 2)
    public void QaResult1(){
        searchPage.QuestionAnswerButton().click();
        WebElement d = driver.findElement(By.xpath("//h2[contains(text(),'שאלות כלליות')]"));
        Assert.assertEquals(questionsAndAnswersResult.GeneralQuestionHead(),d);
    }

    @Test (priority = 3)
    public void QaResult2(){
        searchPage.QuestionAnswerButton().click();
        WebElement f = driver.findElement(By.xpath("//a[contains(text(),'כיצד ניתן להתחבר לאתר?')]"));
        Assert.assertEquals(questionsAndAnswersResult.FirstQuestion(),f);
    }

    @Test (priority = 4)
    public void QaResult3(){
        searchPage.QuestionAnswerButton().click();
        WebElement c = driver.findElement(By.xpath("//a[contains(text(),'כמה עולה משלוח?')]"));
        Assert.assertEquals(questionsAndAnswersResult.DeliveryCost(),c);
    }

    @Test (priority = 5)
    public void QaResult4(){
        searchPage.QuestionAnswerButton().click();
        WebElement c = driver.findElement(By.xpath("//a[contains(text(),'כיצד ניתן לדעת מה סטטוס ההזמנה שלי?')]"));
        Assert.assertEquals(questionsAndAnswersResult.OrderStatus(),c);
    }

    @Test (priority = 6)
    public void CategoriesResult(){
        homePage.Categories().click();
        WebElement g = driver.findElement(By.xpath("//header/div[@id='header-top']/nav[@id='navbar-header-top']/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]"));
        Assert.assertEquals(searchPage.QuestionAnswerButton(),g);
    }

    @Test (priority = 7)
    public void CategoriesResult2(){
        homePage.Categories().click();
        WebElement g = driver.findElement(By.xpath("//header/div[@id='header-bottom']/div[@id='header-content-bottom']/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
        Assert.assertEquals(searchPage.Cosmetics(),g);
    }

    @Test (priority = 8)
    public void CategoriesResult1(){
        homePage.Categories().click();
        WebElement g = driver.findElement(By.xpath("//header/div[@id='header-bottom']/div[@id='header-content-bottom']/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[6]/a[1]"));
        Assert.assertEquals(searchPage.HealthOption(),g);
    }

    @Test (priority = 9)
    public void CategoriesResult3(){
        homePage.Categories().click();
        WebElement g = driver.findElement(By.xpath("//header/div[@id='header-bottom']/div[@id='header-content-bottom']/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
        Assert.assertEquals(searchPage.Home(),g);
    }

    @Test (priority = 10)
    public void MivtsaimResult(){
        homePage.Mivtzaim();
        WebElement h = driver.findElement(By.xpath("//div[contains(text(),'אופטיקה')]"));
        Assert.assertEquals(homePage.OpticsMivtsa(),h);
    }

    @Test (priority = 11)
    public void MivtsaimResult2(){
        homePage.Mivtzaim();
        WebElement h = driver.findElement(By.xpath("//div[contains(text(),'טבע')]"));
        Assert.assertEquals(homePage.NatureMivtsa(),h);
    }

    @Test (priority = 12)
    public void LifeStyleResult(){
        homePage.LifeStyleCategory();
        WebElement h = driver.findElement(By.xpath("//p[contains(text(),'אודותינו')]"));
        Assert.assertEquals(searchPage.AboutLifeStyle(),h);
    }

    @Test (priority = 13)
    public void ElectricityCategoryResult(){
        searchPage.ElectricityAndElectronicCategory().click();
        WebElement h = driver.findElement(By.xpath("//p[contains(text(),'מחשבים')]"));
        Assert.assertEquals(searchPage.Computers(),h);
    }

    @Test (priority = 14)
    public void ElectricityCategoryResult2(){
        searchPage.ElectricityAndElectronicCategory().click();
        WebElement i = driver.findElement(By.xpath("//p[contains(text(),'מצלמות')]"));
        Assert.assertEquals(searchPage.Cameras(),i);
    }

    @Test (priority = 15)
    public void CamerasResult2(){
        searchPage.Cameras();
        WebElement l = driver.findElement(By.xpath("//div[contains(text(),'הרלוונטיות')]"));
        Assert.assertEquals(searchPage.OrderByRelevent(),l);
    }

    @Test (priority = 16)
    public void PharmacyOption(){
        searchPage.Pharmacy().click();
        WebElement m = driver.findElement(By.xpath("//a[contains(text(),'קופת חולים כללית')]"));
        Assert.assertEquals(searchPage.Clalit(),m);
    }

    @Test (priority = 17)
    public void PharmacyOption2(){
        searchPage.Pharmacy().click();
        WebElement n = driver.findElement(By.xpath("//a[contains(text(),'קופת חולים מכבי')]"));
        Assert.assertEquals(searchPage.Macabi(),n);
    }

    @Test (priority = 18)
    public void PharmacyOption3(){
        searchPage.Pharmacy().click();
        WebElement o = driver.findElement(By.xpath("//a[contains(text(),'קופת חולים מאוחדת')]"));
        Assert.assertEquals(searchPage.Meuhedet(),o);
    }


    public void tearDown() throws IOException {
        // utilities.screenshot();
        super.tearDown();
    }
}