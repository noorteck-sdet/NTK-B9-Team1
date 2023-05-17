package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2ArslanHamidullah {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Phoenix\\Desktop\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
		registerLink.click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		if (title.equals("Mercury Tours")) {
			System.out.println("Correct title");
		}else {
			System.out.println("Wrong title");
			System.out.println(title);
		}
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("John");
		Thread.sleep(1000);
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Cena");
		Thread.sleep(1000);
		WebElement phoneNumber = driver.findElement(By.name("phone"));
		phoneNumber.sendKeys("5555555555");
		Thread.sleep(1000);
		WebElement emailAddress = driver.findElement(By.id("userName"));
		emailAddress.sendKeys("example@example.com");
		Thread.sleep(1000);
		WebElement homeAddress = driver.findElement(By.name("address1"));
		homeAddress.sendKeys("123 Example rd");
		Thread.sleep(1000);
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Reston");
		Thread.sleep(1000);
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("VA");
		Thread.sleep(1000);
		WebElement postalCode = driver.findElement(By.name("postalCode"));
		postalCode.sendKeys("55555");
		Thread.sleep(1000);
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("example123");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345678");
		Thread.sleep(1000);
		WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
		confirmPassword.sendKeys("12345678");
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		Thread.sleep(1000);
		WebElement registrationMessage = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]"));
		String thanks = registrationMessage.getText();
		if (thanks.contains("Thank you for registering.")) {
			System.out.println("Testcase Passed");
		}else {
			System.out.println("Testcase Failed");
			System.out.println(thanks);
		}
		Thread.sleep(2000);
		driver.quit();
}
}