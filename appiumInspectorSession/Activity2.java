package appiumInspectorSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity2 {
	
	    WebDriverWait wait;
	    AppiumDriver<MobileElement> driver = null;

	    @BeforeTest
	    public void beforeClass() throws MalformedURLException {
	        // Set the Desired Capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceId", "ZY2244GXPS");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("appPackage", "com.google.android.calculator");
	        caps.setCapability("appActivity", "com.android.calculator2.Calculator");
	        caps.setCapability("noReset", true);
	 
	        // Instantiate Appium Driver
	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	        wait = new WebDriverWait(driver, 10);
	    }

	    @Test
	    public void add() {
	    	//formula
	    	driver.findElementById("digit_5").click();
	    	driver.findElementById("op_add").click();
	    	driver.findElementById("digit_9").click();
	    	
	    	//calculation
	    	driver.findElementById("eq").click();
	    	
	    	//result
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result_final")));
	    	String Addition = driver.findElementById("result_final").getText();

	    	driver.findElementById("clr").click();
	    	
	    	System.out.println("Addition: " + Addition);
	    	Assert.assertEquals(Addition, "14");
	    }

	    
	    @Test
	    public void Subtract() {
	    	//formula
	    	driver.findElementById("digit_1").click();
	    	driver.findElementById("digit_0").click();
	    	driver.findElementById("op_sub").click();
	    	driver.findElementById("digit_5").click();
	    	
	    	//calculation
	    	driver.findElementById("eq").click();
	    	
	    	//result
	    	
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result_final")));
	    	String Subtract = driver.findElementById("result_final").getText();

	    	driver.findElementById("clr").click();
	    	
	    	System.out.println("Subtraction: " + Subtract);
	    	Assert.assertEquals(Subtract, "5");
	    }
	    
	    @Test
	    public void mult() {
	    	//formula
	    	driver.findElementById("digit_5").click();
	    	driver.findElementById("op_mul").click();
	    	driver.findElementById("digit_1").click();
	    	driver.findElementById("digit_0").click();
	    	driver.findElementById("digit_0").click();
	    	
	    	//calculation
	    	driver.findElementById("eq").click();
	    	
	    	//result
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result_final")));
	    	String Multiply = driver.findElementById("result_final").getText();
	    	

	    	driver.findElementById("clr").click();
	    	
	    	System.out.println("Multiplication: " + Multiply);
	    	Assert.assertEquals(Multiply, "500");
	    }
	    
	    @Test
	    public void divide() throws InterruptedException {
	    	//formula
	    	driver.findElementById("digit_5").click();
	    	driver.findElementById("digit_0").click();
	    	driver.findElementById("op_div").click();
	    	driver.findElementById("digit_2").click();
	    	
	    	//calculation
	    	driver.findElementById("eq").click();
	    	
	    	//result
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result_final")));
	    	String divide = driver.findElementById("result_final").getText();
	    	

	    	driver.findElementById("clr").click();
	    	
	    	System.out.println("Division: " + divide);
	    	Assert.assertEquals(divide, "25");
	    }
	    
	    
	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	    }
	}
