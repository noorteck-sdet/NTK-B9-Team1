package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise2Mo {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Noorteck\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/");

		driver.manage().window().maximize();

		WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
		registerLink.click();

		String regTitle = driver.getTitle();
		System.out.println("Page Title :- " + regTitle);
		

		WebElement firstName =driver.findElement(By.name("firstName"));
		firstName.sendKeys("John");
		
		WebElement lastName =driver.findElement(By.name("lastName"));
		lastName.sendKeys("Cena");
		
		WebElement phone =driver.findElement(By.name("phone"));
		phone.sendKeys("555-555-5555");
		
		WebElement email =driver.findElement(By.id("userName"));
		email.sendKeys("john@yahoo.com");
		
		WebElement address =driver.findElement(By.name("address1"));
		address.sendKeys("123 NY LN");

		WebElement city =driver.findElement(By.name("city"));
		city.sendKeys("123 NY LN");
		
		WebElement state =driver.findElement(By.name("state"));
		state.sendKeys("NY");
		
		WebElement pCode =driver.findElement(By.name("postalCode"));
		pCode.sendKeys("123 NY LN");
		
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("UNITED STATES");

		
		WebElement userName =driver.findElement(By.id("email"));
		userName.sendKeys("JohnCena");

		WebElement password =driver.findElement(By.name("password"));
		password.sendKeys("cena1234");
		
		WebElement confirmPassword =driver.findElement(By.name("confirmPassword"));
		confirmPassword.sendKeys("cena1234");


		WebElement submitButton =driver.findElement(By.name("submit"));
		submitButton.click();

		Thread.sleep(3000);

		driver.quit();

	}

}
