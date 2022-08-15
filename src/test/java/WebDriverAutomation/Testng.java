package WebDriverAutomation;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng {

	WebDriver driver = null;

	@BeforeTest
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test

	public void test1() throws InterruptedException {

		driver.get("https://www.google.com/");

		Thread.sleep(3000);

		WebElement gTextBox = driver.findElement(By.name("q"));

		gTextBox.sendKeys("Automation");
		Thread.sleep(3000);

		WebElement gSearchBox = driver.findElement(By.className("gNO89b"));
		gSearchBox.click();

	}

	@Test
	public void test2() throws InterruptedException {

		driver.get("https://www.google.com/");

		Thread.sleep(3000);
		driver.navigate().back();

		Thread.sleep(3000);
		driver.navigate().forward();

		Thread.sleep(3000);
		driver.navigate().refresh();

	}

	@AfterTest
	public void endTest() {

		driver.close();

		driver.quit();

	}
}
