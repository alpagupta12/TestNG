package WebDriverAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotPrac {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nike.com/");
		
		takesSnapShot (driver, "/Users/alpagupta/Documents/eclipse-workspace/Selenium/Screenshot/homepage.png");
		
	}

	private static void takesSnapShot(WebDriver driver, String filePath) throws IOException {
		
		// Full page Screenshot
		
		TakesScreenshot shot = ((TakesScreenshot) driver);
		
		File srcFile = shot.getScreenshotAs(OutputType.FILE);
		
		File desFile = new File (filePath);
		FileUtils.copyFile(srcFile, desFile);
	

        // screenshot by Element
		
	WebElement element = driver.findElement(By.xpath("//a[@aria-label='Nike Home Page']//*[name()='svg']"));
	File srcFile2 = element.getScreenshotAs(OutputType.FILE);
	
	File desFile2 = new File ("/Users/alpagupta/Documents/eclipse-workspace/Selenium/Screenshot/logo.png");
	FileUtils.copyFile(srcFile2 , desFile2);
	
	driver.close();

		
	} }

