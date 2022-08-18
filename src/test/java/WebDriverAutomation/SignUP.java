package WebDriverAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUP {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://hotel.testplanisphere.dev/en-US/signup.html");
		Thread.sleep(2000);
		WebElement emailtext = driver.findElement(By.xpath("//input[@id='email']"));

		emailtext.sendKeys("testing@gmail.com");

		Thread.sleep(2000);

		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("Password123#");

		Thread.sleep(2000);

		WebElement pwd_confirmation = driver.findElement(By.id("password-confirmation"));
		pwd_confirmation.sendKeys("Password123#");

		Thread.sleep(2000);

		WebElement name = driver.findElement(By.name("username"));
		name.sendKeys("Alpa");

		Thread.sleep(3000);

		// WebElement radio1 = driver.findElement(By.id("rank-premium"));
		// radio1.click(); // Premium Membership

		WebElement radio2 = driver.findElement(By.id("rank-normal"));
		radio2.click(); // Membership

		Thread.sleep(3000);

		WebElement address = driver.findElement(By.xpath("//input[@id='address']"));
		address.sendKeys("1050 Duberry street, CA");

		Thread.sleep(3000);

		WebElement number = driver.findElement(By.id("tel"));
		number.sendKeys("09109679087");

		Thread.sleep(3000);

		WebElement gender = driver.findElement(By.name("gender"));
		Select gender_option = new Select(gender);

		gender_option.selectByIndex(2); // female

		Thread.sleep(3000);

		WebElement DOB = driver.findElement(By.id("birthday"));
		DOB.sendKeys("08/16/1991");

		Thread.sleep(3000);

		WebElement notification = driver.findElement(By.id("notification"));
		notification.click();

		Thread.sleep(3000);

		WebElement signup = driver.findElement(By.xpath("//*[@id=\"signup-form\"]/button"));
		signup.click();

		Thread.sleep(3000);

		driver.close();
		driver.quit();
	}

}
