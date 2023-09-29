package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class MainPage {

    @FindBy(className = "site-nav-link")
    private WebElement schoolButton;

    @FindBy(className = "site-nav-dropdown")
    private WebElement dropdownMenuSchool;

    @FindBy(xpath = "//*[@id=\"body\"]/div[1]/div[1]/div[1]/div/div/div[2]")
    private WebElement languageSwitch;// для параметр теста


    public void clickSchoolButton() {
        schoolButton.click();
        //проверка после клика -> дропдаун есть
        Assert.assertTrue(dropdownMenuSchool.isDisplayed(), "Dropdown menu is not displayed.");
        // Вывод всех элементов из выпадающего списка по названию
        List<WebElement> dropdownItems = dropdownMenuSchool.findElements(By.tagName("li"));
        for (WebElement item : dropdownItems) {
            System.out.println(item.getText());
        }
        System.out.println("__________________");//строка с _____после списка
    }

    public void changeLanguage(String name) {  //для параметриз теста , язык сайта
       languageSwitch.click();
        // Добавьте код для выбора языка на основе значения "name"
        if ("ru".equals(name)) {
            // Кликнуть на элемент для смены на русский язык
            languageSwitch.click();
            // Дополнительные действия для смены на русский язык, если необходимо
        } else if ("ua".equals(name)) {
            // Кликнуть на элемент для смены на украинский язык
            languageSwitch.click();
            // Дополнительные действия для смены на украинский язык, если необходимо
        }
        // Добавьте проверки, чтобы убедиться, что язык действительно изменился
    }


}
