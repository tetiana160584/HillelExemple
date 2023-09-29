package listeners;

import configuration.BaseClass;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenS;

public class TestMainPageListener extends BaseClass implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        ScreenS.takeScreenShot(driver, "_"+result.getTestClass().getName()+"_"+result.getMethod().getMethodName());// метод при падении будет Метод Нейм, фото в папке pictures
    //все его методы в папке ScreenS
    }

}
