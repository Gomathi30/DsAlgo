package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GraphPage extends BaseClass{

public GraphPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	@FindBy (linkText="Graph") 
	WebElement graphlnk;
	
	@FindBy (linkText="Graph Representations") 
	WebElement graphreplnk;
	
	public void clickOnGraph()  {
		System.out.println("before clicking graph"+ graphlnk.isEnabled());
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		graphlnk.click();
	}
	public void clickOnGraphRep() {
		graphreplnk.click();
	}
}
