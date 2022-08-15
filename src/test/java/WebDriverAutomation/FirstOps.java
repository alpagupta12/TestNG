package WebDriverAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

		public class FirstOps {
			
			public static void main(String[] args) throws InterruptedException {
				
				WebDriverManager.chromedriver().setup();   // Chrome driver is working
				
				WebDriver driver1 = new ChromeDriver();
				
				driver1.get("https://www.google.com/");
				
				Thread.sleep(3000); 
		        
			/*	WebDriverManager.edgedriver().setup();    // Edge driver is working

				WebDriver driver2 = new EdgeDriver();
				
				driver2.get("https://www.youtube.com/"); 
				
				
				
				WebDriverManager.safaridriver().setup();    // Safari driver is working

				WebDriver driver3 = new SafariDriver();
				
				driver3.get("https://www.w3schools.com/");
				
				
				WebDriverManager.firefoxdriver().setup();    // Firefox driver is getting open but 
			                                                     //  doesn't pass URL
				WebDriver driver4 = new FirefoxDriver();
				
				driver3.get("https://www.tutorialspoint.com/"); */
			
				
				WebElement gTextBox = driver1.findElement(By.name("q"));
				
				gTextBox.sendKeys("Automation")	;
				Thread.sleep(3000);
				
				WebElement gSearchBox = driver1.findElement(By.className("gNO89b"));		
				gSearchBox.click(); 
				
				Thread.sleep(3000);
				driver1.navigate().back();
				
				Thread.sleep(3000);
				driver1.navigate().forward();
				
				Thread.sleep(3000);
				driver1.navigate().refresh();
				
				driver1.close();
				
				driver1.quit();
				
			
			}
	}



