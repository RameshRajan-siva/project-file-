package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenTechnologys {
	 public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selineum 01 Day\\Driver\\chromedriver.exe" );
			
			WebDriver driver = new ChromeDriver();
			
			driver.get(" http://www.greenstechnologys.com/");
			
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			
			String title = driver.getTitle();
			System.out.println(title);
		
			
			driver.close();
		}
		
	}

