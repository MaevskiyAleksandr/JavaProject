package steps;

import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.CardYearsWithoutPercentPage;

public class YearsCreditCardStep extends CardYearsWithoutPercentPage {


    public ChromeDriver driver;

    public YearsCreditCardStep(ChromeDriver driver){
        this.driver = driver;
    }

    public void inspectFinalText (WebDriver driver){

        String resultMessage = driver.findElement(By.cssSelector(serviceTitle)).getText();
        Assert.assertTrue(resultMessage.equals("Бесплатное обслуживание"));
        String resultMessage2 = driver.findElement(By.cssSelector(cashBack)).getText();
        Assert.assertTrue(resultMessage2.equals("Кэшбэк до 100%"));
        String resultMessage3 = driver.findElement(By.cssSelector(yearsWithoutPercentTitle)).getText();
        Assert.assertTrue(resultMessage3.equals("365 дней"));
    }
}
