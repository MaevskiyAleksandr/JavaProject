package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SearchPage;

public class SearchPageStep extends SearchPage {

    private ChromeDriver driver;

    public SearchPageStep(ChromeDriver driver) {

        this.driver = driver;
    }

    public void enteringTextInTheSearchField(WebDriver driver) {
        String text = "Карта год без процентов";
        driver.findElement(By.xpath(creditCart))
                .sendKeys(text);

    }

    public void clickSearchButton(WebDriver driver) {

        driver.findElement(By.xpath(clickSearch)).click();
    }




}
