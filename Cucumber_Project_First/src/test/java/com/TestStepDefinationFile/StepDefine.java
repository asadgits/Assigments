package com.TestStepDefinationFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefine {

	private WebDriver driver;
	
	
	
	@Before
	public void step() {
		
		//OLD PRACTICE  By SPECIFIYING chromedriver path
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asad\\Downloads\\chromedriver_win321\\chromedriver.exe");
		
		// NEW PRACTICE by putting webDriverManager Maven Dependency 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	
	@Given("I am in the login page")
	@Given("I am in the login page of para bank Application")
	public void i_am_in_the_login_page_of_para_bank_application() {
	   
//		driver = webdriver.Chrome("C:\\\\Users\\\\Asad\\\\Downloads\\\\chromedriver_win32");
//	   driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.0.0-alpha-7sts");
	   driver.get("http://localhost:8080/index");
	}

	@When("I enter Valid Cerdentials")
	public void i_enter_valid_cerdentials() {
		driver.findElement(By.name("username")).sendKeys("asad123");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("username")).submit();
	
	}

	@Then("I should be taken to the Overview Page")
	public void i_should_be_taken_to_the_overview_page() throws Exception {
		Thread.sleep(5000);
		
//		driver.findElement(By.linkText("Logout")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		driver.findElement(By.name("meDrop")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("logout")).click();
		Thread.sleep(3000);
//		driver.close();
	}

	
	@When("I enter Valid {string} and {string}")
	public void i_enter_valid_cerdentials(String username , String passowrd) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(passowrd);
		driver.findElement(By.name("username")).submit();
	
	}
	


	@After
	public void quiteBrowser() {
		driver.quit();
		
	}
	
}
