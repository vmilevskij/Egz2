package testai;



import org.junit.Test;
import page.LoginOut;
import page.login;
import page.loginNegativ;
import page.registerNewNegative;
import page.registerNewPositiv;

public class tests extends testParamet {
	
	@Test
	public void regNegative() {
		
		registerNewNegative r = new registerNewNegative(driver);
		
		r.ClickButton();
		r.EnterCredentials();
		r.Clickbtn();
		r.isErrorOK();
		
	}
	
	@Test
	public void regPositive() {
		
		registerNewPositiv r2 = new registerNewPositiv(driver);
		
		r2.ClickButton();
		r2.EnterCredentials();
		r2.Clickbtn();
		
	}
	
	@Test
	public void loginPage() {
		login l = new login(driver);
		l.EnterCredentials();
		l.ClickButton();
		//l.isOK();
		
	}
	@Test
	public void loginPageNeg() {
		loginNegativ ln = new loginNegativ(driver);
		ln.EnterCredentials();
		ln.ClickButton();
	
		
	}
	
	@Test
	public void loginPageOut() {
		login l = new login(driver);
		LoginOut o = new LoginOut (driver);
		l.EnterCredentials();
		l.ClickButton();
		//l.isOK();
		o.logout();
		
	}
}
