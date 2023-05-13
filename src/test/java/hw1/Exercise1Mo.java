package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1Mo {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Noorteck\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");

		WebElement userNameField= driver.findElement(By.name("username"));
		userNameField.sendKeys("ntk-admin");

		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Ntk-orange!admin.123");

		WebElement LoginButton = driver.findElement(By.tagName("button"));
		LoginButton.click();

		String header = driver.getTitle();
		System.out.println("Header :" + header);

		driver.quit();
	}

}
