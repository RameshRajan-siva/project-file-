package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GreensTechnologys {

public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\eclipse-workspace\\Selineum 01 Day\\Driver\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
	}
	

}
