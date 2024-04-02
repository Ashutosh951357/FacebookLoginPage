package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import java.util.concurrent.TimeUnit;

public class SearchLinkdeIn {

    WebDriver driver;
    By LoginLinkedin =By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3");
    By username =By.xpath("//input[@id=\"session_key\"]");
    By password=By.xpath("//input[@id=\"session_password\"]");
    By loginbutton = By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/div[2]/button");

    public SearchLinkdeIn(WebDriver driver)
    {
        this.driver=driver;
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com/search?q=linkedin");
        driver.findElement(LoginLinkedin).click();
        driver.findElement(username).sendKeys("ashutoshkumargupta902@gmail.com");
        driver.findElement(password).sendKeys("ashutosh");
        driver.findElement(loginbutton).click();

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/gmail/about/");
        System.out.println(driver.getTitle());
        
    }
}
