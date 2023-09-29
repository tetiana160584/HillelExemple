import configuration.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.SelectCourseParamPage;
import testData.SelectCourseParamData;

import java.time.Duration;
import java.util.List;

public class TastSelectCourseParameteriz extends BaseClass {

    SelectCourseParamPage selectCourseParamPage; //доступная страница
    private final String mainUrl = "https://ithillel.ua/";

    @BeforeClass
    public void openSite() {
        driver.get(mainUrl);
        selectCourseParamPage = PageFactory.initElements(driver, SelectCourseParamPage.class);//инициализация page
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"body\"]/div[1]/div[1]/div[1]/div/div/div[2]")));
    }

    @Test
    public void checkOpenCourseList() {
        Assert.assertTrue(selectCourseParamPage.openCourseList());
    }

    @Test(dependsOnMethods = {"checkOpenCourseList"}, dataProviderClass = SelectCourseParamPage.class, dataProvider = "SelectCourseParamData")
    public void testSelectCourseParam(String enterCourseVariable, List<String> listFilteredCourse) {
        Assert.assertEquals(selectCourseParamPage.getCourseNameByVarieble(enterCourseVariable), listFilteredCourse);

    }


//    @DataProvider //анотация для параметризации, метод параметриз, если в одном классе
//    public static Object[][] getLangNames(){
//        return new Object[][]{
//                {"ru"},
//                {"ua"}
//        };
//    }
//    @Test(dataProvider = "getLangNames") //если в одном классе
//    private void testParametLang(String name){
//
//    }


}
