package com.automation.hooks;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.automation.factory.FactoryDriver;
import com.google.common.io.Files;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks {

	@Before
	public void setUp() {
		FactoryDriver.initDriver();
	}
	
	@After
	public void tearDown(Scenario scr) throws IOException {
		
		boolean res = scr.isFailed();
		
		if(res) {
			
			TakesScreenshot ts = (TakesScreenshot) FactoryDriver.getDr̥iver();
			 File source = ts.getScreenshotAs(OutputType.FILE);
			 File destination = new File("");
			 Files.copy(source, destination);
		}else {
			FactoryDriver.quitDriver();
		}
	}
}
