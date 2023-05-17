package hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise3Mo {
	public static void main(String[] args) throws InterruptedException {

		String url = "https://demo.nopcommerce.com/";

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement reg = driver.findElement(By.xpath("//a[@class='ico-register']"));
		reg.click();
		Thread.sleep(2000);

		String title = driver.getTitle();
		System.out.println("Page title : " + title);

		WebElement maleRadio = driver.findElement(By.xpath("//input[@id='gender-male']"));
		maleRadio.click();

		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
		firstName.sendKeys("Mo");
		Thread.sleep(2000);
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
		lastName.sendKeys("Elsyed");
		Thread.sleep(2000);

		WebElement day = driver.findElement(By.xpath(" //select[@name='DateOfBirthDay']"));
		Select dayslct = new Select(day);
		dayslct.selectByVisibleText("1");
		Thread.sleep(2000);

		WebElement month = driver.findElement(
				By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]"));
		Select monthslct = new Select(month);
		monthslct.selectByIndex(1);

		WebElement year = driver.findElement(
				By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]"));
		Select yearslct = new Select(year);
		yearslct.selectByVisibleText("2000");
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		email.sendKeys("mooo@google.com");
		Thread.sleep(2000);

		WebElement cName = driver.findElement(By.xpath("//*[@id=\"Company\"]"));
		cName.sendKeys("Noorteck");

		WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"Newsletter\"]"));
		checkBox.click();
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		password.sendKeys("1234567890");

		WebElement confirmPassword = driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
		confirmPassword.sendKeys("1234567890");

		Thread.sleep(2000);

		WebElement regButton = driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
		regButton.click();
		Thread.sleep(2000);

		WebElement regConfirmation = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));
		String str=regConfirmation.getText();
		System.out.println(str);
		Thread.sleep(2000);

		driver.quit();
	}

}
