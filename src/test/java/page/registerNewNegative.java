package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class registerNewNegative extends pageparameters{

	//lokatoriai
	By createnew = By.cssSelector("body > div > form > div > h4 > a");
	By fieldUserName = By.id("username");
	By fieldUserPsw = By.id("password");
	By passwordConfirm = By.id("passwordConfirm");
	By errornote = By.id ("username.errors");
	By buttonSignIn = By.cssSelector("#userForm > button");

	
	//konstruktorius
	public  registerNewNegative (WebDriver driver) {
		this.driver=driver;
		}
	//metodai
	public void ClickButton() {
		
		driver.findElement(createnew).click();
	}
	
	public void EnterCredentials() {
		driver.findElement(fieldUserName).sendKeys("pe");
		driver.findElement(fieldUserPsw).sendKeys("12345");
		driver.findElement(passwordConfirm).sendKeys("12345");
		
	}
	
	public void Clickbtn() {
		driver.findElement(buttonSignIn).click();
	}

	public void isErrorOK() {
	}
	
/*	public void isErrorOK() {
		String note = driver.findElement(errornote).getText();
		Assert.assertEquals("Privaloma įvesti nuo 3 iki 32 simbolių", note);
	}
*/
}
