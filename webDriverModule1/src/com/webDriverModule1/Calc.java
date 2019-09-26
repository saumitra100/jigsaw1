package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class calculatorTest {

	static AppiumDriver<MobileElement> driver;
	
	
	public static void main(String[] args) {
		
		try {
			
			openCalculator();
		}catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		

	}
	public static void openCalculator() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName","ASUS_X00TD");
		cap.setCapability("udid","J7AAGF011904AFP");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","9");
		
		cap.setCapability("appPackage","com.asus.calculator");
		cap.setCapability("appActivity","com.myos.calculator.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		
		System.out.println("Application started");

		// IT'S A TEST again omce again and again and again
		//test test
		//test test test test
}
