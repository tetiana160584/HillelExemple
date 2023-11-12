package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.WorkWithLogs;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;

    @BeforeClass
    public void create() {
        driver = DriverFactory.greateDriver(WEBDRIVERS.BNIGARSIA);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void end() throws InterruptedException {
        Thread.sleep(6000);
        //WorkWithLogs.printAllLogs(driver); //для логов
        WorkWithLogs.writeLogsToFile(driver, "СonsoleLogs"); //для логов

            driver.quit();
        }
    }
