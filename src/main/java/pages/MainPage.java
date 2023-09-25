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
    private WebElement dropdownMenu;


    public void clickSchoolButton() {
        schoolButton.click();
        //проверка после клика -> дропдаун есть
        Assert.assertTrue(dropdownMenu.isDisplayed(), "Dropdown menu is not displayed.");
        // Вывод всех элементов из выпадающего списка по названию
        List<WebElement> dropdownItems = dropdownMenu.findElements(By.tagName("li"));
        for (WebElement item : dropdownItems) {
            System.out.println(item.getText());

        }

    }
}
