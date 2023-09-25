import configuration.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MainPage;

public class TestMainPage extends BaseClass {

    MainPage mainPage;

    @BeforeClass
    public void openSite() {
        String siteUrl = "https://ithillel.ua/";  // url сайта
        driver.get(siteUrl);
        mainPage = PageFactory.initElements(driver, MainPage.class);//инициализация page
    }

    @Test(priority = 0)
    public void testClickSchoolButton() {
        mainPage.clickSchoolButton();

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("spinner"))); //перекрывается элемент поэтому ожидпние
    }


}
