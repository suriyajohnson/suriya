package com.automation.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.automation.Page.LoginPage;
import com.automation.factory.FactoryDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	private LoginPage lp ;
	 @Given("User lauches the login application")
	public void user_lauches_the_login_application() {
	    lp = new LoginPage(FactoryDriver.getDr̥iver());
	    lp.open();
	}
	@When("User enter the username as {string}")
	public void user_enter_the_username_as(String string) {
	    lp.getUsername().sendKeys(string);
	}
	@When("User enter the password as {string}")
	public void user_enter_the_password_as(String string) {
	    lp.getPassword().sendKeys(string);
	}
	@When("User clicks login button")
	public void user_clicks_login_button() {
	    lp.getLogin().click();
	}
	@Then("login should navigate to secure page")
	public void login_should_navigate_to_secure_page() {
//	  WebElement element = FactoryDriver.getDr̥iver().findElement(By.xpath("//h4[text()='Welcome to the Secure Area. When you are done click logout below.']"));
//	  
//	  Assert.assertTrue(element.getText().contains("//h4[text()='Welcome to the Secure Area. When you are done click logout below.']"));
	}
}
