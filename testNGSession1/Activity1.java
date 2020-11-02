package testNGSession1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	
	    WebDriver driver;
	    
	    @BeforeMethod
	    public void beforeMethod() {
	    	System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
	        driver = new FirefoxDriver();

	        driver.get("https://www.training-support.net");
	        driver.manage().window().maximize();
	    }

	    @Test
	    public void exampleTestCase() {
	        String title = driver.getTitle();

	        System.out.println("Page title is: " + title);

	        Assert.assertEquals("Training Support", title);
	        driver.findElement(By.id("about-link")).click();
	                    
	        System.out.println("New title is: " + driver.getTitle());
	        
	        Assert.assertEquals(driver.getTitle(), "About Training Support");
	    }

	    @AfterMethod
	    public void afterMethod() {
	        driver.close();
	    }

}
