package appiumSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity2 {

	    @Test
	    public void calc() throws MalformedURLException {
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceId", "ZY2244GXPS");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("appPackage", "com.google.android.calculator");
	        caps.setCapability("appActivity", "com.android.calculator2.Calculator");
	        caps.setCapability("noReset", true);

	        AppiumDriver<MobileElement> driver = null;
	        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	        System.out.println("Calculator is open");
	        
	    }

}
