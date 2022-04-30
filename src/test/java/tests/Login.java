package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.ExcelReader;
/*
 * 1. cross browser testing -- done
 * 2. rerun failed tests -- done
 * 3.get screenshot of failed test cases -- done
 * 4. extent reports
 * 5. excel reading -- done
 * 6. config file 
 * 7. Pico container
 * 8. git
 * 9. jenkins integration
 */
import pageObjects.BaseClass;
import pageObjects.CommonLinks;
import pageObjects.PortalPage;
import pageObjects.SignInPage;

public class Login extends BaseClass {

	//RegisterPage regpage = new RegisterPage(null);

	String username;  //="gomathi";
	String password;  //="NumpyNinja";

	@Test(priority = 0)
	public void login() {

		//verify we are in portal page
		Assert.assertEquals(driver.getTitle(),"Numpy Ninja");
		Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("portal"));
		
		//click get started button in portal page
		PortalPage portpage= new PortalPage(driver);
		portpage.clickOnGetStarted(); 

		//verify user is in homepage
		Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("home"));

		//Get the credentials from excel
		ExcelReader excel = new ExcelReader();
		username = excel.getUsername();
		password =  excel.getPassword();
		System.out.println("Username:"+ username +"\n"+"password:"+password);

		//sign in with valid credentials
		CommonLinks cl = new CommonLinks(driver);
		cl.clickOnSignInLink(); 
		SignInPage signpage = new SignInPage(driver);
		Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("signin"));
		signpage.signIn(username,password);
		cl.verifySignIn(username);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

