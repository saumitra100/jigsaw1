package com.webDriverModule1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxDemo {

	    public static void main(String[] args) {
	        // declaration and instantiation of objects/variables
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Saumitra\\eclipse-workspace\\newproject\\src\\drivers\\chromedriver.exe");
			
			// Launch the Browser
			// Creating ChromeDriver class object
			WebDriver driver = new ChromeDriver();
			
			//get function is available on Chromedriver().
			//Enter URL
			driver.get("http://www.google.co.in");
			
			//Enter data on the search box
			driver.findElement(By.name("q")).sendKeys("Selenium");

			//Saumitra it's a test
	       
	    }

	}

