package pages;

import configuration.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Scroll;

import java.util.ArrayList;
import java.util.List;

import static configuration.BaseClass.driver;

public class TeachersScrollPage {
//    private final String vasiliyShevchenkoSelector = "//div[@class=\"coach-card_group\"]//p[@class=\"coach-card_name\" and text()=\"Василь Шевченко\"]\n";

    @FindBy(xpath = "//div[@class=\"block-coaches_main\"]//ul[@class=\"block-coaches_list\"]")
    private WebElement teachersList;


    @FindBy(xpath = "//li[@class=\"block-coaches_item\"]//div[@class=\"coach-card_group\"]//p[@class=\"coach-card_name\"]")
    private WebElement teachersByName;

    @FindBy(xpath = "vasiliyShevchenkoSelector")
    private WebElement vasiliy;

    @FindBy(xpath = "//*[@id=\"blockCoaches\"]/div[2]/ul/li[22]/a/div/div[1]/div/img")
    private WebElement polishyck;

    public WebElement getTeachersList() {
        return teachersList;
    }

    public WebElement getTeachersByName() {
        return teachersByName;
    }

    public List<String> getVasilyPolishchuk() {
        List<String> list = new ArrayList<>();
            Scroll.scrollToElementVisibilityOf(driver, By.xpath("//*[@id=\"blockCoaches\"]/div[2]/ul/li[22]/a/div/div[1]/div/img"));
            polishyck.click();
        return list;
    }

    }

