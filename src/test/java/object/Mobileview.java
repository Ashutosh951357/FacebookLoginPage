package object;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Mobileview {
    @Test
    public static void main(String[] args)
    {
        Map<String,String> mobileEm=new HashMap<String,String>();
        mobileEm.put("deviceName","iPhone X");
        ChromeOptions opt =new ChromeOptions();
        opt.setAcceptInsecureCerts(true);
        opt.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation"));
        opt.addArguments("incognito");
        opt.setExperimentalOption("mobileEmulation",mobileEm);
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver(opt); // Use the driver instance declared in the class
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://hsp.abdm.gov.in/login");
        System.out.println(driver.getTitle());

    }
}
