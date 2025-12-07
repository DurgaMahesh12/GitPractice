package Mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstClass {
    WebDriver driver;
    @BeforeMethod
    public void startBrowser(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }
    @Test
    public void firtstestcase(){
        System.out.println("Mahesh");
        System.out.println("NewFeature");
    }

    @AfterMethod
    public void close(){
        driver.close();
    }

}
