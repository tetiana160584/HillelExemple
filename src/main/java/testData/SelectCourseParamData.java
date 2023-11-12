package testData;

import org.testng.annotations.DataProvider;

import java.util.Arrays;

public class SelectCourseParamData {
    @DataProvider //анотация для параметризации, метод параметриз
    public static Object[][] getSearchCourseVeriable(){
        return new Object[][]{
                {"QA", Arrays.asList("QA Start","QA Manual","QA Automation — Java","QA Technical Pro")}, //вводим значение и проверяем данные фильтра
                {"Java", Arrays.asList( "Основи Java для школярів","JavaScript Basiс","Java Pro","Java Basic")},
                {"DevOps", Arrays.asList("DevOps Advanced", "DevOps Basic","DevOps Pro", "Project Management")}
        };
    }
}
