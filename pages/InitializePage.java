package pages;

import Utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class InitializePage{

    public WebDriver driver;
    private String baseUrl;
    public HomePage homePage;
    public SearchPageResult searchPage;
    public Utilities utilities;
    public QuestionsAndAnswersResult questionsAndAnswersResult;

    @BeforeTest
    public void setUp(){
        baseUrl = "https://shop.super-pharm.co.il/";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\1\\IdeaProjects\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        searchPage = new SearchPageResult(driver);
        utilities = new Utilities(driver);
        questionsAndAnswersResult = new QuestionsAndAnswersResult(driver);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println("It will be executed first");
    }

    @AfterTest
    public void tearDown() throws IOException {
        driver.quit();
    }
}
