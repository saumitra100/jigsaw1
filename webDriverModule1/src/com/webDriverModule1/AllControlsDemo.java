package com.webDriverModule1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllControlsDemo {

	    public static void main(String[] args) {
	        // declaration and instantiation of objects/variables
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Saumitra\\eclipse-workspace\\newproject\\src\\drivers\\chromedriver.exe");
			
			// Launch the Browser
			// Creating ChromeDriver class object
			WebDriver driver = new ChromeDriver();
			
			//Maximize the browser
			driver.manage().window().maximize();
			
			//get function is available on Chromedriver().
			//Enter URL
			driver.get("http://softwaretesting-guru.blogspot.com/p/main-page.html");
			
			//Handle Hyperlink selenium practice page
			driver.findElement(By.linkText("Selenium Practice page")).click();
			
			//Handle Text Box and enter data using webdriver
			driver.findElement(By.name("Name")).sendKeys("Selenium");
			
			//Handle Check Box
			driver.findElement(By.name("subscribe")).click();
			
			//Handle Text Area
			driver.findElement(By.name("comments")).sendKeys("Welcome to the selenium training");
			
			//Handle Dropdown
			
			new Select(driver.findElement(By.name("countries"))).selectByVisibleText("Argentina");
			
			//Handle Radio button
			
			driver.findElement(By.xpath("//input[@value='bad']")).click();
	       
	    }

	}
