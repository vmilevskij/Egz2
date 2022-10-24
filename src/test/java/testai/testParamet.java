package testai;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class testParamet {
	
	protected static WebDriver driver;
	
	@BeforeClass
	public static void Setup() {
		
		
		
		driver = new ChromeDriver();
		driver.get("http://localhost:8080");
		
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void TearDown() {
		driver.close();
	}

}
