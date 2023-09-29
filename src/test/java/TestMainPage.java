import configuration.BaseClass;
import listeners.TestMainPageListener;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.MainPage;

import java.time.Duration;
@Listeners(TestMainPageListener.class)  // подключили Lictener класс для этого теста, методы в классе описываем

public class TestMainPage extends BaseClass {

    MainPage mainPage;

    @BeforeClass
    public void openSite() {
        String siteUrl = "https://ithillel.ua/";  // url сайта
        driver.get(siteUrl);
        mainPage = PageFactory.initElements(driver, MainPage.class);//инициализация page
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.elementToBeClickable(By.className("site-nav-link")));
    }

    @Test(priority = 0)
    public void testClickSchoolButton() {
        mainPage.clickSchoolButton();


    }

}
