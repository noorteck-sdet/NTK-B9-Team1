package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1ArslanHamidullah {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Phoenix\\Desktop\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("ntk-admin");
		Thread.sleep(2000);
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("Ntk-orange!admin.123");
		Thread.sleep(2000);
		WebElement searchButton = driver.findElement(By.tagName("button"));
		searchButton.click();
		Thread.sleep(2000);
		WebElement headerLoc = driver.findElement(By.tagName("h6"));
		String header = headerLoc.getText();
		if (header.equals("Dashboard")) {
			System.out.println("Correct Header");
		}else {
			System.out.println("Wrong Header");
			System.out.println(header);
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
