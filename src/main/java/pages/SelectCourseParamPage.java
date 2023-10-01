package pages;

import configuration.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ScreenS;

import java.util.ArrayList;
import java.util.List;

public class SelectCourseParamPage  {

    @FindBy(xpath = "//button[@data-dropdown-trigger=\"coursesMenu\"]")
    WebElement courseButton;

    @FindBy(xpath = "//input[@class=\"search-field_input\"]")
    WebElement fieldSearchByCourse;

    @FindBy(xpath = "//*[@id=\"coursesMenuSearchPanel\"]/div[3]/div/ul//p[@class=\"course-label_name\" or @class=\"sprint-link-title\"]")
    List<WebElement> labelCoursesNames;//дописать по нейм всех в списке


    public boolean openCourseList() { //кликаем и проверяем что появился список
        courseButton.click();
        return fieldSearchByCourse.isDisplayed();
    }

    WebDriver driver; //для скрина элемента драйвер делаем доступ и гетер к нему, это второй способ инициализации т.е в этом классе
    public SelectCourseParamPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver ,this);
    }

    public List<String> getCourseNameByVarieble(String enterCourseVariable) throws InterruptedException { //метод для возврата списка отфильтрованых курсов по переменной по названию лейбы
        List<String> list = new ArrayList<>();
        ScreenS.getWebElementPNG(fieldSearchByCourse, driver, "SearchLine");//подключ. скрин элемента строки поиска
        fieldSearchByCourse.clear();
        fieldSearchByCourse.sendKeys(enterCourseVariable);
        Thread.sleep(6000);
        for (WebElement label : labelCoursesNames) { //цикл, в котором перебираются элементы
            list.add(label.getText()); //Название курса, извлеченное из элемента label, добавляется в список list.
        }
        return list;
    }
}
