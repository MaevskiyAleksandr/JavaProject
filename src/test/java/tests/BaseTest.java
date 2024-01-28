package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {

    public static ChromeDriver driver;



    @Before
    public void setUp() {
        driver = new ChromeDriver();
        System.out.println("Test start");
        driver.get("https://alfabank.ru/");
        driver.manage().window().maximize();

    }

    @After
    public void close() {
        driver.close();
        //driver.quit();
       System.out.println("Test close");
    }

}

