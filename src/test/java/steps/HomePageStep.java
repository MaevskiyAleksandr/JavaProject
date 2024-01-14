package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import java.util.concurrent.TimeUnit;


public class HomePageStep extends HomePage {




    public HomePageStep (ChromeDriver driver){
        this.driver = driver;

    }

    private ChromeDriver driver;


    public void clickButtonSearch (){
        try {
            TimeUnit.SECONDS.sleep(6);
        }catch (Exception e){

        }

        driver.findElement(By.xpath(buttonSearch)).click();


    }
}
