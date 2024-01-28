package tests;

import org.junit.Test;
import org.testng.Assert;
import pages.CardYearsWithoutPercentPage;
import pages.SearchResultsPage;
import steps.HomePageStep;
import steps.SearchPageStep;
import steps.SearchResultsStep;
import steps.YearsCreditCardStep;


public class SearchForCreditCardTest extends BaseTest{
 HomePageStep homePageStep = new HomePageStep(driver);
 SearchPageStep searchPageStep = new SearchPageStep(driver);

 SearchResultsStep searchResultsStep = new SearchResultsStep(driver);

 YearsCreditCardStep yearsCreditCardStep = new YearsCreditCardStep(driver);


 @Test
    public void firstTest () {
     homePageStep.clickButtonSearch(driver);

     searchPageStep.enteringTextInTheSearchField(driver);

     searchPageStep.clickSearchButton(driver);

     searchResultsStep.searchResultButton(driver);

     yearsCreditCardStep.inspectFinalText(driver);

 }

}
