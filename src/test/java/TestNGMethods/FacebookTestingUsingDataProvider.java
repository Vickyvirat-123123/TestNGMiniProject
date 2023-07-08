package TestNGMethods;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.page.objects.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class FacebookTestingUsingDataProvider {
	public static WebDriver  driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

@Test(priority = 1)
	public void aloginPage() throws InterruptedException {
		LoginPage login=new LoginPage(driver);
		login.enterNameandPassword("karth@gmail.com", "kakakak");
		
		Thread.sleep(10000);
	}
	
@DataProvider(name = "testData")
public Object[][] provideTestData(){
	return  new Object[][] {
		{ "karth@gmail.com", "Yelooo-o-" },
		{"data2@gmail.com", "jdhfksd" },
		{"data3@gmail.com" ,"dskjdksl" },
	};
}

@DataProvider(name = "testExceldata")
public Object[][] provideexcelTestData(){
	Object[][] data=null;
	try {
	FileInputStream fis = new FileInputStream(
			"C:\\Users\\Admin\\eclipse-workspace\\TestMaven\\src\\main\\resources\\test\\data\\xcel.xlsx");

	Workbook workbook = new XSSFWorkbook(fis);

	Sheet sheet1 = workbook.getSheetAt(0);
	int rowcount = sheet1.getLastRowNum()-sheet1.getFirstRowNum()+1;
	int columnCount = sheet1.getRow(0).getLastCellNum();
	data = new Object[rowcount-1][columnCount];
	
	
	for (int i = 1; i < rowcount; i++) {
		
		for (int j = 0; j < columnCount; j++) {
			data[i-1][j] = sheet1.getRow(i).getCell(j).getStringCellValue();
		}
		
	}
workbook.close();

return data;
//	for (Row row : sheet1) {
//
//		for (Cell cell : row) {
//
//			String data = cell.getStringCellValue();
//			System.out.print(data+ " ");
//		}
//		System.out.println();
//	}

} catch (Exception e) {
	// TODO: handle exception
}
return data;
	}

	@Test(priority = 1,dataProvider = "testExceldata")
	public void loinPageWithInvalidInputs(String username,String password) {
		LoginPage login=new LoginPage(driver);
		login.enterNameandPassword(username, password);
	WebElement checkbox = driver.findElement(By.xpath("//button[@type='submit']"));
	checkbox.click();
}
	@AfterMethod
	public void quitBrowser() {
		 driver.quit();
	}
	
}
