package com.Libraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
	public Properties proper;

	public void launching() throws IOException, InterruptedException {
		FileInputStream ab = new FileInputStream("src/test/resources/Properties/app.properties");
		proper = new Properties();
		proper.load(ab);
		proper.getProperty("Browser").equalsIgnoreCase("chrome");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(proper.getProperty("URL"));

		Thread.sleep(5000);
	}

}
