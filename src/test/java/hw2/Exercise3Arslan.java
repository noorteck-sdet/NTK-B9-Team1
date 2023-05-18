package hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise3Arslan {

		public static void main(String[] args) throws InterruptedException {
			String url = "https://demo.nopcommerce.com/";

			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			// maximize the browser
			driver.manage().window().maximize();
			
			driver.get(url);
			WebElement register = driver.findElement(By.linkText("Register"));
			register.click();
			String titleMessage = driver.getTitle();
			if (titleMessage.equals("nopCommerce demo store. Register")) {
				System.out.println("Correct title");
			}else {
				System.out.println("Wrong title");
			}
			Thread.sleep(2000);
			WebElement gender = driver.findElement(By.id("gender-male"));
			gender.click();
			Thread.sleep(2000);
			
			WebElement firstName = driver.findElement(By.id("FirstName"));
			firstName.sendKeys("John");
			Thread.sleep(2000);
			
			WebElement lastName = driver.findElement(By.id("LastName"));
			lastName.sendKeys("Cena");
			Thread.sleep(2000);
			
			WebElement dayDropDown = driver.findElement(By.name("DateOfBirthDay"));
			Select select1 = new Select(dayDropDown);
			select1.selectByIndex(3);
			Thread.sleep(2000);
			
			WebElement monthDropDown = driver.findElement(By.name("DateOfBirthMonth"));
			Select select2 = new Select(monthDropDown);
			select2.selectByIndex(3);
			Thread.sleep(2000);
			
			WebElement yearDropDown = driver.findElement(By.name("DateOfBirthYear"));
			Select select3 = new Select(yearDropDown);
			select3.selectByVisibleText("1980");
			Thread.sleep(2000);
			
			WebElement email = driver.findElement(By.id("Email"));
			email.sendKeys("johncena@cantseeme.com");
			Thread.sleep(2000);
			
			WebElement company = driver.findElement(By.id("Company"));
			company.sendKeys("WWE");
			Thread.sleep(2000);
			
			WebElement newsLetter = driver.findElement(By.id("Newsletter"));
			newsLetter.click();
			Thread.sleep(2000);
			
			WebElement password = driver.findElement(By.id("Password"));
			password.sendKeys("password");
			Thread.sleep(2000);
			
			WebElement confPassword = driver.findElement(By.id("ConfirmPassword"));
			confPassword.sendKeys("password");
			Thread.sleep(2000);
			
			WebElement registerButton = driver.findElement(By.id("register-button"));
			registerButton.click();
			Thread.sleep(2000);
			//after i checked this part it did not allow me to go thank you
			//for registering page since i had already made an account with this info
		driver.quit();
				
}
}