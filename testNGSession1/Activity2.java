package testNGSession1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
      System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
      driver = new FirefoxDriver();
      driver.get("https://www.training-support.net/selenium/target-practice");
    }
    
    @Test
    public void testCase1() {
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        Assert.assertEquals(title, "Target Practice");
    }
    
    @Test
    public void testCase2() {
        WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "Black");
    }
    
    @Test(enabled = false)
    public void testCase3() {
    	WebElement purpleButton = driver.findElement(By.cssSelector("button.purple"));
        Assert.assertTrue(purpleButton.isDisplayed());
        Assert.assertEquals(purpleButton.getText(), "Purple");
    }
    
    @Test
    public void testCase4() {
        throw new SkipException("Skipping test case");      
    }

    @AfterTest
    public void afterMethod() {
        driver.close();
    }

}
