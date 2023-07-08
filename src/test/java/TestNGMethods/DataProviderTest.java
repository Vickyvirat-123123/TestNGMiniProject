package TestNGMethods;

import org.testng.annotations.DataProvider;

public class DataProviderTest {
	@DataProvider(name = "testData")
	public Object[][] provideTestData(){
		return (Object[][]) new Object[][] {
			{ "", 123 },
			{"data2", 456 },
			{"data3" ,789 },
		};
		
		
	

}
}