package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SearchPage;
import pages.SearchResultsPage;

public class SearchResultsStep extends SearchResultsPage {

    public ChromeDriver driver;
    public SearchResultsStep(ChromeDriver driver) {

        this.driver = driver;
    }

    public void searchResultButton(WebDriver driver) {

        driver.findElement(By.xpath(choosingCreditCard)).click();
    }

}
