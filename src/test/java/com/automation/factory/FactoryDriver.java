package com.automation.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FactoryDriver {

	public static WebDriver driver;
	
	public static  void initDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	public static WebDriver getDr̥iver() {
		return driver;
	}
	
	public static void quitDriver() {
		driver.quit();
	}
}
