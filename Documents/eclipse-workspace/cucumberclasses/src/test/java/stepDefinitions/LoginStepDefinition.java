package stepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition {

	WebDriver driver;

	@Given("User Open Chrome Browser")
	public void user_open_chrome_browser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	@Given("Launch the Application")
	public void launch_the_application() {

		driver.get("https://www.amazon.com/");
	}

	@When("User enter valid Username and Password")
	public void user_enter_valid_username_and_password() {

		driver.findElement(By.id("ap_email")).sendKeys("alpagupta12@gmail.com");
		driver.findElement(By.xpath("//span[@id='continue']//input[@id='continue']")).click();
		driver.findElement(By.name("password")).sendKeys("password123");

	}

	@Then("Click Login")
	public void click_login() {

		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Then("See the Amazon Home page")
	public void see_the_amazon_home_page() {

		String actual_result = driver.getTitle();
		String expected_result = "https://www.amazon.com/?_encoding=UTF8&ref_=navm_hdr_signin";

		Assert.assertEquals(actual_result, expected_result);

		System.out.println("Test Passed");

		Thread.sleep(2000);

		driver.quit();
	}

}
