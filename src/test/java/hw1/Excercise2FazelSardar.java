package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excercise2FazelSardar {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\fazel\\OneDrive\\Desktop\\Selenium-B9\\chromedriver.exe");
		
		// Step 2. Create an object of WebDriver
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
		registerLink.click();
		
		String title = driver.getTitle();
		if(title.equals("Mercury Tours")) {
			System.out.println("Title is Mercury Tours");
		}else {
			System.out.println("Title is NOT Mercury Tours. It is: " + title);
		}
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Ibn");
		
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Cena");
		
		WebElement digits = driver.findElement(By.name("phone"));
		digits.sendKeys("911");
		
		WebElement emailz = driver.findElement(By.id("userName"));
		emailz.sendKeys("ibncenamenow@noorteck.edu");
		
		WebElement addy = driver.findElement(By.name("address1"));
		addy.sendKeys("111 NW Blue Face St");
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("BobVille");
		
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("BobVille");
		
		WebElement zip = driver.findElement(By.name("postalCode"));
		zip.sendKeys("22742");
		
		WebElement country = driver.findElement(By.name("country"));
		
		Select select = new Select(country);
		select.selectByVisibleText("BRAZIL");
		
		WebElement uzerName = driver.findElement(By.id("email"));
		uzerName.sendKeys("binseenah");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("123123");
		
		WebElement ConfPass = driver.findElement(By.name("confirmPassword"));
		ConfPass.sendKeys("123123");
		
		WebElement submitBtn = driver.findElement(By.name("submit"));
		submitBtn.click();
		Thread.sleep(5000);
		
		
		WebElement message = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]"));
		
		String thankYouMessage = message.getText();
		
		if(thankYouMessage.contains("Thank you for registering.")) {
			System.out.println("TESTCASE PASSED");
		}else {
			System.out.println("TESTCASE FAILED");
		}
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
