package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.tracing.AttributeMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MobileWebpageTesting{
    WebDriver driver;
//    ChromeOptions opt =new ChromeOptions();

    public MobileWebpageTesting(WebDriver driver){
        this.driver=driver;
//        Map<String,String> mobileEm=new HashMap<String,String>();
//        mobileEm.put("devicename", "IphoneX");
//        opt.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation"));
//        opt.setExperimentalOption("mobileEmulation",mobileEm);


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.apple.com/in/app-store/");

    }
}
