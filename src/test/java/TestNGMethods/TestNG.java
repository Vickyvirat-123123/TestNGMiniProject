package TestNGMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class TestNG {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void registrationPage() {
		WebElement nameInput = driver.findElement(By.xpath("//input[@minlength='2']"));
		nameInput.sendKeys("VickyVirat");

		WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
		emailInput.sendKeys("vigneshyar@gmail.com");

		WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
		passwordInput.sendKeys("Welcome@123");

		WebElement checkbox = driver.findElement(By.xpath("//input[@id='exampleCheck1']"));
		checkbox.click();

		Select genderDropdown = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		genderDropdown.selectByVisibleText("Male");

		WebElement employmentRadio = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		employmentRadio.click();

		WebElement dobInput = driver.findElement(By.xpath("//input[@max='3000-12-31']"));
		dobInput.sendKeys("03.10.1998");

		WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
		submitButton.click();

		// Verify successful submission message
		WebElement successMessage = driver
				.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		String messageText = successMessage.getText();
		if (messageText.contains("Success! The Form has been submitted successfully!.")) {
			System.out.println("Test Passed: Form submitted successfully");
		} else {
			System.out.println("Test Failed: Form submission failed");
		}
	}
	
	
	@Test(priority = 3)
	
	public void registrationPageWithInvalidInputs() {
		WebElement nameInput = driver.findElement(By.xpath("//input[@minlength='2']"));
		nameInput.sendKeys("VickyVirat");

		WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
		emailInput.sendKeys("vigneshyar@gmail.com");

		WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
		passwordInput.sendKeys("Welcome@123");

		WebElement checkbox = driver.findElement(By.xpath("//input[@id='exampleCheck1']"));
		checkbox.click();

		Select genderDropdown = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		genderDropdown.selectByVisibleText("Male");

		WebElement employmentRadio = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		employmentRadio.click();

		WebElement dobInput = driver.findElement(By.xpath("//input[@max='3000-12-31']"));
		dobInput.sendKeys("03.10.1998");

		WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
		submitButton.click();

		// Verify successful submission message
		WebElement successMessage = driver
				.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		String messageText = successMessage.getText();
		if (messageText.contains("Success! The Form has been submitted successfully!.")) {
			System.out.println("Test Passed: Form submitted successfully");
		} else {
			System.out.println("Test Failed: Form submission failed");
		}
	}
	
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();	
	}
	
}
