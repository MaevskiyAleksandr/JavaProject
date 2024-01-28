package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import java.util.concurrent.TimeUnit;


public class HomePageStep extends HomePage {


    private ChromeDriver driver;

    public HomePageStep (ChromeDriver driver){
        this.driver = driver;

    }




    public void clickButtonSearch (WebDriver driver){
        try {
            TimeUnit.SECONDS.sleep(6);
        }catch (Exception e){

        }

        driver.findElement(By.xpath(buttonSearch)).click();


    }
}
