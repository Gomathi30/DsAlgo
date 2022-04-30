/*package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PortalPage extends BaseClass{
	//@FindBy (xpath = "//button[@class='btn']")
	@FindBy(xpath="//button[contains(text(),'Get Started')]")
	WebElement getstartedBtn;
	
public void clickOnGetStarted() {
		
		getstartedBtn.click();
		/*WebElement clck =driver.findElement(By.linkText("Get Started"));
		clck.click();*/
//	}
//}
//end

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageObjects.BaseClass;


public class PortalPage{
	
	@FindBy(xpath="//button[contains(text(),'Get Started')]")
	WebElement getstartedBtn;
	 

	 public PortalPage(WebDriver driver) {
		  PageFactory.initElements(driver, this);
			
		}
	
	public void clickOnGetStarted()
	{
		getstartedBtn.click();
		
	}
	
}

