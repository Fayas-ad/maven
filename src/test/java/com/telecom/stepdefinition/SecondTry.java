package com.telecom.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class SecondTry {
	
	public static WebDriver driver;
	@Given("user launches telecom application")
	public void user_launches_telecom_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
	    
	}

	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	    
	}

	@When("user need to file up the fields")
	public void user_need_to_file_up_the_fields() {
		driver.findElement(By.xpath("(//label)[1]")).click();
	    driver.findElement(By.id("fname")).sendKeys("Fayas");
	    driver.findElement(By.id("lname")).sendKeys("Ahamed");
	    driver.findElement(By.id("email")).sendKeys("fazerfayas@gamil.com");
	    driver.findElement(By.name("addr")).sendKeys("ald");
	    driver.findElement(By.id("telephoneno")).sendKeys("1232321");
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@Then("user verify customer id is generated")
	public void user_verify_customer_id_is_generated() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}



}
