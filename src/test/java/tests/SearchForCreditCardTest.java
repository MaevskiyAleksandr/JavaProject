package tests;

import org.junit.Test;
import steps.HomePageStep;

public class SearchForCreditCardTest extends BaseTest{
 HomePageStep homePageStep = new HomePageStep(driver);

 @Test
    public void firstTest () {
     homePageStep.clickButtonSearch();
 }
}
