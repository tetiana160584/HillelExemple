package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SelectCourseParamPage {

    @FindBy(xpath = "//button[@data-dropdown-trigger=\"coursesMenu\"]")
    WebElement courseButton;

    @FindBy(xpath = "//input[@class=\"search-field_input\"]")
    WebElement fieldSearchByCourse;

    @FindBy(xpath = "//div[@id=\\\"coursesMenuDesktop\\\"]//div[@class=\\\"courses-nav \\\"]//ul[@class=\\\"course-list\\\"]//p[@class=\\\"course-label_name\\\"]") //дописать по нейм всех в списке
           List <WebElement>labelCoursesNames;


    public boolean openCourseList() { //кликаем и проверяем что появился список
        courseButton.click();
        return fieldSearchByCourse.isDisplayed();
    }

    public List<String> getCourseNameByVarieble(String enterCourseVariable) { //метод для возврата списка отфильтрованых курсов по переменной по названию лейбы
        List<String> list = new ArrayList<>();
        fieldSearchByCourse.clear();
        fieldSearchByCourse.sendKeys(enterCourseVariable);
        for (WebElement label : labelCoursesNames) {
            list.add(label.getText());
        }
        return list;
    }
}
