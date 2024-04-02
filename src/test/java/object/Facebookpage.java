package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Facebookpage {
    WebDriver driver;

    public Facebookpage(WebDriver driver) {
        this.driver = driver;

    }

    By username = By.xpath("//input[@id='email']");
    By password = By.xpath("//input[@id='pass']");
    By Loginbutton = By.name("login");

    public void EnterUsername() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(username).clear();
        driver.findElement(username).sendKeys("akg157951@gmail.com");
    }

    public void Enterpassword() {
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys("Ashutosh@987");
    }

    public void verifylogin() {
        driver.findElement(Loginbutton).click();
        String title = driver.getTitle();
    }

}

