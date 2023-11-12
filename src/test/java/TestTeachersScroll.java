import configuration.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.TeachersScrollPage;

import java.time.Duration;
import java.util.List;

import utils.Scroll;

public class TestTeachersScroll extends BaseClass {
    TeachersScrollPage teachersScrollPage;

    @BeforeClass
    public void openSite() {
        String siteUrl = "https://ithillel.ua/coaches";  // url сайта
        driver.get(siteUrl);
        teachersScrollPage = PageFactory.initElements(driver, TeachersScrollPage.class);//инициализация page
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.elementToBeClickable(By.className("site-nav-link")));
    }

    @Test
    public void get(){
        teachersScrollPage.getVasilyPolishchuk();
    }
}









