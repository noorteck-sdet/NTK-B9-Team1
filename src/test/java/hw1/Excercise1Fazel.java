package hw1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise1Fazel {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\fazel\\OneDrive\\Desktop\\Selenium-B9\\chromedriver.exe\\");
		
		String url = "https://ntkhr.noortecktraining.com/web/index.php/auth/login";
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("ntk-admin");
		
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Ntk-orange!admin.123");
		
		WebElement logIn = driver.findElement(By.tagName("button"));
		logIn.click();
		
		Thread.sleep(2000);
		
		WebElement dashboard = driver.findElement(By.tagName("h6"));
		
		String header = dashboard.getText();
		if(header.equals("Dashboard")) {
			System.out.println("Header: Correct Header");
		}else
			System.out.println("Wrong Header");
		
		Thread.sleep(2000);
		
		
		driver.quit();
		
		
	}

}

/**
<button 
	type="submit" 
		class="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button" 
			data-v-7e88b27e="" 
				data-v-30b9e6c4="">
					<!----> 
						Login <!---->
							</button>
*/