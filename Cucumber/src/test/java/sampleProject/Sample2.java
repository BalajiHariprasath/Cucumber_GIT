package sampleProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Sample2 
{	
	WebDriver Driver;
	
	@Given("Navigate to Google URL")
	public void navigate_to_google_url() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse\\Driver\\chromedriver.exe"); //initialize
		Driver = new ChromeDriver(); //ready to handle
		Driver.get("http://www.google.com");
	}

	@Given("User Print the Page Title")
	public void user_print_the_page_title() {
		String GetTitle = Driver.getTitle();
		System.out.println(GetTitle);
	  
	}

	@Then("Close the Browser")
	public void close_the_browser() {
		Driver.close();
	   
	}
	
	
	
	
}
