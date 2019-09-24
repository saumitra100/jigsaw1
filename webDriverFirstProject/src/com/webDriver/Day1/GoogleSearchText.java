package com.webDriver.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearchText {
	
	public static void main(String[] args) {
		
		//Step 1 For launching the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saumitra\\eclipse-workspace\\newproject\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//ChromeDriver is a class constructor
		
		//Step 2 Enter URL
		//Get function is asking about URL parameter.
		driver.get("http://www.google.co.in");
		
		//Step 3 Search for selenium
		
		//Handle textbox and search
		WebElement searchbox=driver.findElement(By.xpath("//input[@name='q']"));
	
		searchbox.sendKeys("Selenium");
		searchbox.sendKeys(Keys.ENTER);
		
		
	
		//driver.findElement(By.xpath("//*[@id="tsf"]/div[2]/div/div[2]/button")).sendKeys(Keys.RETURN);
	}
}
