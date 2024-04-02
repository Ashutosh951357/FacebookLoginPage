package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchpage {
    WebDriver driver;

    public GoogleSearchpage(WebDriver driver) {
        this.driver = driver;
    }

    By searchbox = By.xpath("//*[@name=\"q\"]");
    By search_btn = By.xpath(("(//input[@name='btnK'])[1]"));
    By facebook_link = By.xpath("//a//h3[text()='Facebook - log in or sign up']");

    public void searchgoogle(String searchinput) {
        try {
            driver.findElement(searchbox).sendKeys(searchinput);
            driver.findElement(search_btn).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Exception Caught " + e.getMessage());
        }
    }

    public void facebooklink() {
        try {
            driver.findElement(facebook_link).click();

            Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println("Exception Caught " + e.getMessage());

        }
    }
//    public void MobileWebpageTesting() throws InterruptedException {
//        driver.findElement(iphone_Appstore).click();
//        Thread.sleep(2000);
//
//    }  catch(Exception e){
//        System.out.println("Exception caught" + e.getMessage());
//
//    }

}



