package com.examples;

import com.google.common.primitives.Bytes;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.*;
import ru.yandex.qatools.allure.model.SeverityLevel;

import java.io.File;

/**
 * Created by Harsha on 11/16/2016.
 */
@Description("Google Test")
@Title("Selenium web testing")
public class TestSelenium {


    @Test
    @Attachment(type = "image/png",value = "Google search box ")
    @TestCaseId("TC-1002")
    @Issues({@Issue("121"),@Issue("122"),@Issue("123")})
    @Severity(value = SeverityLevel.CRITICAL)
    @Features("Google Search feature")
    @Step("Enter hello in search box")
    public File TestMethod(){


System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Hello");
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

return file;
    }

}
