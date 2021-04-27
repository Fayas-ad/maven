package com.telecom.stepdefinition;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AddTarrifPlan {
	public static WebDriver driver;
	@Given("users launche telecom applications")
	public void users_launche_telecom_applications() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
	    
	}

	@Given("user click on add tariff plan buttons")
	public void user_click_on_add_tariff_plan_buttons() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
		
	}   

	@When("users need to fill up the fields by one dim list")
	public void users_need_to_fill_up_the_fields_by_one_dim_list(io.cucumber.datatable.DataTable dataTable) {
		List<String> tariffs = dataTable.asList();
		driver.findElement(By.id("rental1")).sendKeys(tariffs.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(tariffs.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(tariffs.get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(tariffs.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(tariffs.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(tariffs.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(tariffs.get(6));
	    
	   
	}

	@When("user click on submit buttons")
	public void user_click_on_submit_buttons() {
		driver.findElement(By.name("submit")).click();	    
	}

	@Then("users verify Congratulation you add Tariff Plan is generated")
	public void users_verify_Congratulation_you_add_Tariff_Plan_is_generated() {
		Assert.assertEquals("Congratulation you add Tariff Plan", driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).getText());
	}
	@When("users need to fill up the fields by one dim maps")
	public void users_need_to_fill_up_the_fields_by_one_dim_maps(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> maps = dataTable.asMap(String.class, String.class);
		driver.findElement(By.id("rental1")).sendKeys(maps.get("rental"));
		driver.findElement(By.id("local_minutes")).sendKeys(maps.get("lname"));
		driver.findElement(By.id("inter_minutes")).sendKeys(maps.get("email"));
		driver.findElement(By.id("sms_pack")).sendKeys(maps.get("addr"));
		driver.findElement(By.id("minutes_charges")).sendKeys(maps.get("telephoneno"));
		driver.findElement(By.id("inter_charges")).sendKeys(maps.get("addss"));
		driver.findElement(By.id("sms_charges")).sendKeys(maps.get("tele"));
	}
	@When("users need to fill up the fields by two dim list")
	public void users_need_to_fill_up_the_fields_by_two_dim_list(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> twod = dataTable.asLists(String.class);
		driver.findElement(By.id("rental1")).sendKeys(twod.get(0).get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(twod.get(0).get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(twod.get(0).get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(twod.get(1).get(0));
		driver.findElement(By.id("minutes_charges")).sendKeys(twod.get(1).get(1));
		driver.findElement(By.id("inter_charges")).sendKeys(twod.get(1).get(2));
		driver.findElement(By.id("sms_charges")).sendKeys(twod.get(2).get(0));
	}
	@When("users need to fill up the fields by two dim maps")
	public void users_need_to_fill_up_the_fields_by_two_dim_maps(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> mapz = dataTable.asMaps(String.class, String.class);
		driver.findElement(By.id("rental1")).sendKeys(mapz.get(0).get("AB"));
		driver.findElement(By.id("local_minutes")).sendKeys(mapz.get(0).get("AC"));
		driver.findElement(By.id("inter_minutes")).sendKeys(mapz.get(0).get("AD"));
		driver.findElement(By.id("sms_pack")).sendKeys(mapz.get(1).get("AE"));
		driver.findElement(By.id("minutes_charges")).sendKeys(mapz.get(1).get("AF"));
		driver.findElement(By.id("inter_charges")).sendKeys(mapz.get(1).get("AG"));
		driver.findElement(By.id("sms_charges")).sendKeys(mapz.get(2).get("AH"));
	}



}
