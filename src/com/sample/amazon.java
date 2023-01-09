package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class amazon {

	
public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\eclipse-workspace\\Selineum 01 Day\\Driver\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(" https://www.amazon.in");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
	}
	}

