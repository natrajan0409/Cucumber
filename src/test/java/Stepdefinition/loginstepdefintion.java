package Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginstepdefintion {
	
	WebDriver driver;
	///String path = System.getProperty("user.dir");   // return project folder path
	///String driverpath = path + "E:\\GITlocation\\Cucmber1\\cocumberproject\\Webdriver\\chromedriver.exe"; 
	
	
	
	@Given("^I have open the browser$")
	public void i_have_open_the_browser_precondition() throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\ECLIPS\\Navotar\\WEBDRIVER\\chromedriver.exe");  
	    driver=new ChromeDriver(); 
	}

	@When("^I open Facebook website$")
	public void i_open_Facebook_website_testcondition() throws Throwable {
		driver.navigate().to("http://www.javatpoint.com/");
		System.out.println("URL entered into browser");
	}

	@Then("^Login button should exits$")
	public void login_button_should_exits_postcondition() throws Throwable {
		driver.manage().window().maximize(); 
		System.out.println("Browser maximized");
	    driver.quit(); 
	}

	
	

}
